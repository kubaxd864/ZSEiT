import React, { useState } from 'react';
import axios from 'axios';
import moment from 'moment'
import './App.css';
function App() {

  const [data, setData] = useState({});
  const [location, setLocation] = useState('');

  const url = `https://api.openweathermap.org/data/2.5/weather?q=${location}&appid=9176476946e7cee23d0075c5eebd3fbe`;

  const searchLocation = (event) =>  {
    if(event.key === "Enter"){
      axios.get(url).then((response) => {
        setData(response.data);
      })
      setLocation('');
    }
  }
  return (
    <div className='App'>
      <div className='container'>
        <div className='search'>
            <h1>Podaj Miasto</h1>
            <input type="text" placeholder="Search..." onChange={(event) => setLocation(event.target.value)} onKeyPress={searchLocation}/>
          </div>
          <div className='location'>
            <h1>Miasto: </h1>
            <h1>{data.name}</h1>
          </div>
          <div className='temp'>
            <h1>Temperatura:</h1>
            {data.main && <h1>{Math.round(data.main.temp - 273.15)}°C</h1>}
          </div>
          <div className='feels'>
            <h1>Odczuwalna Temperatura:</h1>
            {data.main && <h1>{Math.round(data.main.feels_like - 273.15)}°C</h1>}
          </div>
          <div className='desciption'>
            <h1>Opis:</h1>
            {data.weather && <h1>{data.weather[0].description}</h1>}
          </div>
          <div className='sunrise'>
            <h1>Wschód Słońca:</h1>
            {data.sys && <h1>{(moment.utc(data.sys.sunrise,'X').add(data.timezone,'seconds').format('HH:mm a'))}</h1>}
          </div>
          <div className='sunset'>
            <h1>Zachód Słońca:</h1>
            {data.sys && <h1>{(moment.utc(data.sys.sunset,'X').add(data.timezone,'seconds').format('HH:mm a'))}</h1>}
          </div>
          <div className="wind">
            <h1>Prędkość Wiatru:</h1>
            <h1>{data.wind && (data.wind.speed * 1.60934 + " km/h")}</h1>
        </div>
      </div>
    </div>
  );
}

export default App;