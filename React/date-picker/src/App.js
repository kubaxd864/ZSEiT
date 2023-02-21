import React, { useState } from 'react';
import './App.css';

const PickDate = (event) =>  {
  console.log("XD");
}

function App() {
  return (
    <div className="App">
      <div className='container'>
        <h1>Wybierz Format Daty</h1>
        <select>
          <option className='Eu' value="dd/mm/yyyy">Eu date Format</option>
          <option className='Us' value="mm/dd/yyyy">Us date Format</option>
          <option className='China' value="yyyy/mm/dd">Chinese date Format</option>
        </select>
        <button className='Pick' onClick={(event) => PickDate(event.target.value)}>Wybierz</button>
      </div>
    </div>
  );
}

export default App;
