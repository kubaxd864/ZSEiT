import React, { useState, useEffect } from 'react';
import './App.css';

const App = () => {
  const [number, setNumber] = useState();
  const [randomNumber, setRandomNumber] = useState(0);
  const [message, setMessage] = useState('');
  const [count, setCount] = useState(10);

  useEffect(() => {
    handleChange()
  }, [count]);

  const handleChange = (e) => {
    setRandomNumber(Math.floor(Math.random() * count));
  };

  const handleSubmit = (e) => {
    if( document.getElementById('playbtn').innerHTML == 'Zagraj ponownie!') {
      window.location.reload();
    } else {
      if (randomNumber == number) {
        setMessage('Gratulacje! Zgadłeś liczbę!');
        document.getElementById('playbtn').innerHTML = 'Zagraj ponownie!';
      } else if (randomNumber < number) {
        setMessage('Za dużo! Spróbuj jeszcze raz!');
      } else if (randomNumber > number) {
        setMessage('Za mało! Spróbuj jeszcze raz!');
      } else {
        setMessage('Wprowadź liczbę!');
      }
    }
  };

  return (
    <div className="App">
      <div className='container'>
        <h1>Zgadnij Randomową Liczbę !</h1>
        <h3 className='Info'>Wybierz zakres liczb</h3>
        <select value={count} onChange={e => {setCount(e.target.value); handleChange()}}>
          <option className='Word_count' value="10">Do 1 do 10</option>
          <option className='Word_count' value="100">Do 1 do 100</option>
          <option className='Word_count' value="1000">Do 1 do 1000</option>
          <option className='Word_count' value="10000">Do 1 do 10000</option>
          <option className='Word_count' value="100000">Do 1 do 100000 </option>
        </select>
        <h3 className='Info'>Wprowadź Liczbę</h3>
        <input type="number" className='Input_Number' onChange={e => setNumber(e.target.value)} />
        <button type="submit" className='Pick' id="playbtn" onClick={e => handleSubmit(e.target.value)}>Graj!</button>
        <h2>{message}</h2>
      </div>
    </div>
  );
};

export default App;