const express = require("express");
const app = express();
const cors = require("cors");
const mysql = require('mysql2');
const bodyParser = require('body-parser');
const dbConnection = mysql.createPool({
    host     : 'localhost', 
    user     : 'root',        
    password : '',    
    database : 'to_do_database'      
}).promise();

app.use(cors());
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json())
app.get("/", (req, res) => {
  dbConnection.execute('Select * from to_do')
  .then(([rows]) => {
    res.send({message: rows});
  })
  .catch(err => {
    res.send({message: err});
  })
});

app.delete("/delete/:id", (req, res) => {
  const id = req.params.id;
  dbConnection.execute('DELETE FROM to_do WHERE id = ?', [id])
  .then(() => {
    dbConnection.execute('Select * from to_do')
    .then(([rows]) => {
    res.send({message: rows});
  })
  })
  .catch(err => {
    res.send({message: err});
  })
});

app.post('/add', async (req, res) => {
  const title = req.body.title;
  const description = req.body.description;
  if(title === '' || description === '') {
    dbConnection.execute('Select * from to_do')
      .then(([rows]) => {
      res.send({message: rows, err_message: 'Podaj tytuł i opis'});
    })
  } else {
    dbConnection.execute('INSERT INTO to_do (title, description) VALUES (?, ?)', [title, description])
    .then(() => {
      dbConnection.execute('Select * from to_do')
      .then(([rows]) => {
      res.send({message: rows, err_message: 'Dodano'});
    })
    })
    .catch(err => {
      res.send({message: err});
    })
}});

app.post('/update', async (req, res) => {
  const id = req.body.id;
  const title = req.body.title;
  const description = req.body.description;
  if(title === '' || description === '') {
    res.send({err_message: 'Podaj dane które chcesz zaktualizować'});
  } else if(title === '' ) {
    dbConnection.execute('UPDATE to_do SET description = ? WHERE id = ?', [description, id]).then(() => {
      dbConnection.execute('Select * from to_do')
      .then(([rows]) => {
      res.send({message: rows, err_message: 'Zmieniono tylko opis'});
    })
    })
  } else if(description === '') {
    dbConnection.execute('UPDATE to_do SET title = ? WHERE id = ?', [title, id]).then(() => {
      dbConnection.execute('Select * from to_do')
      .then(([rows]) => {
      res.send({message: rows, err_message: 'Zmieniono tylko tytuł'});
    })
    })
  } else {
    dbConnection.execute('UPDATE to_do SET title = ?, description = ? WHERE id = ?', [title, description, id]).then(() => {
      dbConnection.execute('Select * from to_do')
      .then(([rows]) => {
      res.send({message: rows, err_message: 'Zmieniono tytuł i opis'});
    })
    })
}})


app.listen(5000, () => console.log("Backend Działa na localhost:5000"));