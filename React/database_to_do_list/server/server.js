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

app.get('/add', async (req, res) => {
  const title = req.query.title;
  const description = req.query.description;
  console.log(title, description);
  dbConnection.execute('INSERT INTO to_do (title, description) VALUES (?, ?)', [title, description])
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

app.post('/update', async (req, res) => {
  dbConnection.execute('INSERT INTO to_do (title, description) VALUES (?, ?)', [req.body.title, req.body.description])
  .then(() => {
    dbConnection.execute('Select * from to_do')
    .then(([rows]) => {
    res.send({message: rows});
  })
  })
  .catch(err => {
    res.send({message: err});
  })
})


app.listen(5000, () => console.log("Backend Działa na localhost:5000"));