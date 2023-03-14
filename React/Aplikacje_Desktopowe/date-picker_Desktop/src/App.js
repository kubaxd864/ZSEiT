import React, { useState } from 'react';
import './App.css';

function App() {
  const [selectedFormat, setSelectedFormat] = useState();
  const [Date_Format, setDate_Format] = useState();
  const PickDate = (event) =>  {
    const date = new Date();
    const day = date.getDate();
    const month = date.getMonth() + 1;
    const year = date.getFullYear();
    const hours = date.getHours();
    const minutes = date.getUTCMinutes();
    if (selectedFormat === undefined) {
      var formattedDate = `Wybierz Format Daty`;
      setDate_Format(formattedDate);
    } else if (selectedFormat === 'dd/mm/yyyy') {
      var formattedDate = `${day}/${month}/${year}  ${hours}:${minutes}`;
      setDate_Format(formattedDate);
    } else if (selectedFormat === 'mm/dd/yyyy') {
      var formattedDate = `${month}/${day}/${year} ${hours}:${minutes}`;
      setDate_Format(formattedDate);
    } else if (selectedFormat === 'yyyy/mm/dd') {
      var formattedDate = `${year}/${month}/${day} ${hours}:${minutes}`;
      setDate_Format(formattedDate);
    }
  }

  return (
    <div className="App">
      <div className='container'>
        <h1>Pobierz Datę W Wybranym Formacie</h1>
        <h3 className='Info'>Wybierz format daty</h3>
        <select value={selectedFormat} onChange={e=>setSelectedFormat(e.target.value)}>
          <option className='First' value=""></option>
          <option className='Eu' value="dd/mm/yyyy">Eu date Format</option>
          <option className='Us' value="mm/dd/yyyy">Us date Format</option>
          <option className='China' value="yyyy/mm/dd">Chinese date Format</option>
        </select>
        <button className='Pick' onClick={(event) => PickDate(event.target.value)}>Pobierz Datę</button>
        <p className='Message'>Data W Wybranym Formacie:</p>
        <p className='Date'>{Date_Format}</p>
      </div>
    </div>
  );
}

export default App;
