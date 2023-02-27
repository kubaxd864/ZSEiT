import './App.css';
import React from 'react';
import { Swiper, SwiperSlide } from 'swiper/react';

import 'swiper/css';


function RS3() {
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
          <img src={require('./img/RS3/Audi-RS3-1.jpg')} alt="Audi RS3"/>
        </SwiperSlide>

        <SwiperSlide className='slides'>
          <img src={require('./img/RS3/Audi-RS3-2.jpg')} alt="Audi RS3"/>
        </SwiperSlide>

        <SwiperSlide className='slides'>
          <img src={require('./img/RS3/Audi-RS3-3.jpg')} alt="Audi RS3"/>
        </SwiperSlide>

        <SwiperSlide className='slides'>
          <img src={require('./img/RS3/Audi-RS3-4.jpg')} alt="Audi RS3"/>
        </SwiperSlide>
        
        </Swiper>
        </div>
        <div className="picture-box-text">
            <h1 className="picture-box-title">Audi RS 3</h1>
            <p className="picture-box-description">
              Audi RS 3 w aktualnym wydaniu zostało oficjalnie pokazane w lipcu ubiegłego roku. 
              Opisywany model został wyposażony w pięciocylindrowy silnik 2.5 TFSI, który osiąga 400 KM i 500 Nm.
              Dzięki temu nowe RS3 Audi rozpędza się do setki w 3,8 sekundy, 
              a maksymalnie dobija do 250 km/h w standardzie lub 280 km/h z opcjonalnym pakietem Performance i wreszcie 290km/h, 
              jeśli do zestawu dorzucimy ceramiczne hamulce przednie. 
              Moc trafia na obie osie za pośrednictwem 7-biegowej skrzyni dwusprzęgłowej S tronic. 
              Nowością w RS 3 jest system RS Torque Splitter, który odpowiada za rozdział momentu obrotowego między tylne koła.
            </p>
        </div>
       </div>
    </div>
  );
}

export default RS3;
