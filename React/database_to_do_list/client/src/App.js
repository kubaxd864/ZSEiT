import React, { useState, useEffect, Suspense } from 'react';
import './App.css';
import axios from 'axios';

function App() {
  const [todo, setTodo] = useState([]);
  useEffect(() => {
    axios.get("http://localhost:5000/").then((response) => {
      setTodo(response.data.message);
      console.log(response.data.message);
    })
  }, [])

  return (
    <div className="App">
      <header className="App-header">
        <p>Lista rzeczy do zrobienia:</p>
        <p className='to_do'>
          <p>{todo[0].thinks_to_do}</p>
        </p>
        <button>Get Data</button>
      </header>
    </div>
  );
}

export default App;
