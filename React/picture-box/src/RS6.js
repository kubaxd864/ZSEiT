import './App.css';
import React from 'react';
import { Swiper, SwiperSlide } from 'swiper/react';

import 'swiper/css';


function RS6() {
  return (
    <div className="App">
      <div className="picture-box">
        <div className="wrapper">
        <Swiper
          spaceBetween={60}
          slidesPerView={1}
          loop
          className='swiper'
        >

        <SwiperSlide className='slides'>
          <img src={require('./img/RS6/Audi-RS6-1.jpg')} alt="Audi RS6"/>
        </SwiperSlide>

        <SwiperSlide className='slides'>
          <img src={require('./img/RS6/Audi-RS6-2.jpg')} alt="Audi RS6"/>
        </SwiperSlide>

        <SwiperSlide className='slides'>
          <img src={require('./img/RS6/Audi-RS6-3.jpg')} alt="Audi RS6"/>
        </SwiperSlide>
        
        </Swiper>
        </div>
        <div className="picture-box-text">
            <h1 className="picture-box-title">Audi RS 6</h1>
            <p className="picture-box-description">
                Gdy obok RS 6 przechodzą osoby, które nie są fanami motoryzacji, na dłuższą chwilę zawieszają wzrok. 
                Niby zwykłe kombi, a jednak jakieś takie niezwykłe. 
                RS 6 Avant z wyjątkiem przednich drzwi, dachu i pokrywy kufra ma elementy poszycia stworzone wyłącznie na potrzeby tego sportowego modelu. 
                To poszerzone o ok. 4 cm z każdej strony nadwozie z charakterystycznymi nadmuchanymi nadkolami, 
                potężne 22-calowe koła z oponami o szerokości 285 i profilu 30, 
                spod których widać potężne tarcze hamulcowe i czerwone zaciski oraz ogromne dwa czarne „kominy” układu wydechowego.
                Pod maską budzi się wówczas 4-litrowe V8 z biturbo, które ma teraz 600 KM i 800 Nm.
            </p>
        </div>
       </div>
    </div>
  );
}

export default RS6;