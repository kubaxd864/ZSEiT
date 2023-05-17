import React, { useState } from 'react'
import './App.css';

const App = () => {

  return (
    <div className="App">
      <div className='container'>
        <h1>Pobierz Datę W Wybranym Formacie</h1>
        <h3 className='Info'>Wybierz format daty</h3>
        <select>
          <option className='First' value=""></option>
          <option className='Eu' value="dd/mm/yyyy">Eu date Format</option>
          <option className='Us' value="mm/dd/yyyy">Us date Format</option>
          <option className='China' value="yyyy/mm/dd">Chinese date Format</option>
        </select>
        <button className='Pick'>Pobierz Datę</button>
        <p className='Message'>Data W Wybranym Formacie:</p>
        <p className='Date'></p>
      </div>
    </div>
  );
}

export default App;
