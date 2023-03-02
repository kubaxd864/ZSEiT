const express = require("express");
const app = express();
const cors = require("cors");
const mysql = require('mysql2');
const dbConnection = mysql.createPool({
    host     : 'localhost', 
    user     : 'root',        
    password : '',    
    database : 'to_do_database'      
}).promise();

app.use(cors());

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
  console.log(id);
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

app.post("/insert/:id", (req, res) => {
  const id = req.params.id;
  const title = req.body.title;
  const description = req.body.description;
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

app.listen(5000, () => console.log("Backend Działa na localhost:5000"));