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
    res.render('bank')
})

app.post("/bank", urlencodedParser, (req, res) => {
    if(req.body.name && req.body.pin){
        console.log("Witaj " + req.body.name)
    } 
    else {
        console.log("Niepoprawne dane logowania")
    }
  })

app.listen(3000, () => {
    console.log(`Serwer został uruchomiony: http://localhost:3000`)
})