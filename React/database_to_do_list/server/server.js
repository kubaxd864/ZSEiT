const express = require("express");
const app = express();
const port = 5000
const cors = require("cors");
const mysql = require('mysql2');
const dbConnection = mysql.createPool({
    host     : 'localhost', 
    user     : 'root',        
    password : '',    
    database : 'to_do_database'      
}).promise();

app.use(cors());
app.listen(port, () => console.log("Backend Działa na localhost:"+port));

app.get("/", (req, res) => {
  var thinks_to_do = []
  dbConnection.execute('Select * from to_do')
  .then(([rows]) => {
    res.send({message: rows});
  })
  .catch(err => {
    res.send({message: err});
  })
});