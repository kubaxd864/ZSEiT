const express = require('express')
const app = express()
const bodyParser = require('body-parser')
const dbConnection = require('./database')
const path = require('path')
const ejs = require('ejs')
const urlencodedParser = bodyParser.urlencoded({ extended: false })

app.use(express.urlencoded({extended:false}));
app.use(bodyParser.json()); 
app.use(express.static('public')); 
app.use(express.static(__dirname + '/public'));
app.set('views', path.join(__dirname,'views'));
app.set('view engine','ejs');

app.get('/', (req, res) => {
    var Message = ""
    res.render('Bank', { Message : Message } )
})

app.post("/bank", urlencodedParser, async (req, res) => {
    try {
    if(req.body.name && req.body.pin){
        dbConnection.execute('Select * from clients WHERE FullName = ?', [req.body.name])
        .then(([rows]) => {
            if(rows.length == 0){
                var Message = "Niepoprawne Imię i Nazwisko"
                res.render('Bank', { Message : Message } )
            }
            else if(rows[0].FullName == req.body.name) {
                dbConnection.execute('Select AccountPin from accounts WHERE AccountPin = ?', [req.body.pin])
                .then(([rows1]) => {
                    if(rows1.length == 0){
                        var Message = "Niepoprawne Pin do Konta"
                        res.render('Bank', { Message : Message } )
                    }
                    else if(rows1[0].AccountPin == req.body.pin) {
                        global.AccountOwnerID = rows[0].ClientID
                        global.FullName = req.body.name
                        global.Name = req.body.name.split(" ")[0]
                        var Message = ""
                        res.render('Menu' , { Name : global.Name, Message : Message })
                    }
                })
            }
        })

    } 
     else {
        var Message = "Nie Podano Danych"
        res.render('Bank', { Message : Message } )
    }
    } catch (error) {
        console.log(error)
    }
})

app.post("/menu", urlencodedParser, async (req, res) => {

    try {
    if(req.body.choice == "Wyświetl Dane" || req.body.choice == "1"){
        dbConnection.execute('Select * from clients WHERE FullName = ?', [global.FullName])
        .then(([rows]) => {
            if(rows.length == 0){
                var Message = "Nie Można Wyświetlić Danych"
                res.render('Menu' , { Message : Message, Name : global.Name })
            }
            else{
                var Message = "Imię i Nazwisko: " + rows[0].FullName + " Adres: " + rows[0].Address + " Numer Telefonu: " + rows[0].Phonenumber
                res.render('Menu' , { Message : Message, Name : global.Name })
            }
        })
    }
    else if (req.body.choice == "Dodaj Nowe Konto" || req.body.choice == "2") {
        var first_part = Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000;
        var second_part = Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000;
        var third_part = Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000;
        var fourth_part = Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000;
        var pin = Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000;
        var AccountNumber = first_part + "" + second_part + third_part + fourth_part 
        dbConnection.execute('INSERT INTO accounts (AccountOwnerID, AccountNumber, AccountPin, Balance) VALUES (?,?,?,?)', [global.AccountOwnerID, AccountNumber, pin, 0])
        var Message = "Dodano Konto"
        res.render('Menu' , { Message : Message, Name : global.Name })
    }
    else if (req.body.choice == "Wpłata" || req.body.choice == "3") {
        dbConnection.execute('Select Balance from accounts WHERE AccountOwnerID = ?', [global.AccountOwnerID])
        .then(([rows]) => {
            if(rows.length == 0){
                var Message = "Nie Można Wyświetlić Danych"
                res.render('Menu' , { Message : Message, Name : global.Name })
            }
            else{
                if(req.body.amount <= 0){
                    var Message = "Podaj Kwotę większą od 0"
                    res.render('Menu' , { Message : Message, Name : global.Name })
                }
                else{
                    var AddBalance = (parseInt(rows[0].Balance) + parseInt(req.body.amount))
                    dbConnection.execute('UPDATE accounts SET Balance = ? WHERE AccountOwnerID = ?', [AddBalance, global.AccountOwnerID])
                    var Message = "Wpłacono"
                    res.render('Menu' , { Message : Message, Name : global.Name })
                }
            }
        })
    }
    else if (req.body.choice == "Wypłata" || req.body.choice == "4") {
        dbConnection.execute('Select Balance from accounts WHERE AccountOwnerID = ?', [global.AccountOwnerID])
        .then(([rows]) => {
            if(rows.length == 0){
                var Message = "Nie Można Wyświetlić Danych"
                res.render('Menu' , { Message : Message, Name : global.Name })
            }
            else{
                if(req.body.amount <= 0){
                    var Message = "Podaj Kwotę większą od 0"
                    res.render('Menu' , { Message : Message, Name : global.Name })
                }
                else{
                    var New_Balance = rows[0].Balance - req.body.amount
                    if(parseInt(req.body.amount) <= parseInt(rows[0].Balance)){
                        dbConnection.execute('UPDATE accounts SET Balance = ? WHERE AccountOwnerID = ?', [New_Balance, global.AccountOwnerID])
                        var Message = "Wypłacono"
                        res.render('Menu' , { Message : Message, Name : global.Name })
                    }
                    else{
                        var Message = "Nie Masz Tyle Środków"
                        res.render('Menu' , { Message : Message, Name : global.Name })
                    }
                }
            }
        })
    }
    else if (req.body.choice == "Sprawdź Saldo" || req.body.choice == "5") {
        dbConnection.execute('Select Balance from accounts WHERE AccountOwnerID = ?', [global.AccountOwnerID])
        .then(([rows]) => {
            if(rows.length == 0){
                var Message = "Nie Można Wyświetlić Salda"
                res.render('Menu' , { Message : Message, Name : global.Name })
            }
            else{
                var Message = "Twoje Saldo To: " + rows[0].Balance
                res.render('Menu' , { Message : Message, Name : global.Name })
            }
        })
    }
    else if (req.body.choice == "Lista Klientów" || req.body.choice == "6") {
        dbConnection.execute('Select FullName from clients')
        .then(([rows]) => {
            if(rows.length == 0){
                var Message = "Nie Można Wyświetlić Danych"
                res.render('Menu' , { Message : Message, Name : global.Name })
            }
            else{
                for (let i = 0; i < rows.length; i++) {
                    console.log(rows[i].FullName)
                }
                var Message = "Lista Klientów wyświetlona w konsoli"
                res.render('Menu' , { Message : Message, Name : global.Name })
            }
        })
    }
    else if (req.body.choice == "Lista Kont Klienta" || req.body.choice == "7") {
        dbConnection.execute('Select * from accounts WHERE AccountOwnerID = ?', [global.AccountOwnerID])
        .then(([rows]) => {
            if(rows.length == 0){
                var Message = "Nie Masz Żadnych Kont"
                res.render('Menu' , { Message : Message, Name : global.Name })
            }
            else{
                console.log(rows)
                var Message = "Lista Klientów wyświetlona w konsoli";
                res.render('Menu' , { Message : Message, Name : global.Name })
            }
        })
    }
    else if (req.body.choice == "Wyloguj" || req.body.choice == "8") {
        var Logout = "Wylogowano Poprawnie"
        res.render('bank' , { Message : Logout })
    }
    else{
        var Message = "Brak Wybranej Opcji"
        res.render('Menu' , { Message : Message, Name : global.Name })
    }
    } 
    catch (error) {
        console.log(error)
    }
})

app.listen(3000, () => {
    console.log(`Serwer został uruchomiony: http://localhost:3000`)
})