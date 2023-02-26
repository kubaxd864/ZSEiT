import './App.css';
import React from 'react';
import { Swiper, SwiperSlide } from 'swiper/react';

import 'swiper/css';


function RS4() {
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
          <img src={require('./img/RS4/Audi-RS4-1.jpg')} alt="Audi RS4"/>
        </SwiperSlide>

        <SwiperSlide className='slides'>
          <img src={require('./img/RS4/Audi-RS4-2.jpg')} alt="Audi RS4"/>
        </SwiperSlide>

        <SwiperSlide className='slides'>
          <img src={require('./img/RS4/Audi-RS4-3.jpg')} alt="Audi RS4"/>
        </SwiperSlide>

        <SwiperSlide className='slides'>
          <img src={require('./img/RS4/Audi-RS4-4.jpg')} alt="Audi RS4"/>
        </SwiperSlide>
        
        </Swiper>
        </div>
        <div className="picture-box-text">
            <h1 className="picture-box-title">Audi RS 4</h1>
            <p className="picture-box-description">
                Nowe Audi RS4 Avant napędzane jest silnikiem 2.9 TFSI V6 wyposażonym w dwie turbosprężarki. 
                Dokładnie 18 lat temu prawie identyczny motor trafił do pierwszej generacji RS4. 
                Podobna pojemność i podwójne turbodoładowanie wyraźnie przypominają nową konstrukcję. 
                Czyżby zatem świat motoryzacji, po wielkim wybuchu w latach 90-tych, zaczynał się kurczyć i wracać powoli do czasów zamierzchłych? 
                Dane techniczne obu RS4 i ich osiągi mogą o tym w pewnym stopniu świadczyć!
                Co więcej, nowe Audi RS4 na tle pierwszej generacji to auto o znacznie bardziej luksusowym charakterze, doskonale wykończone i wyposażone w niesamowite rozwiązania. 
            </p>
        </div>
       </div>
    </div>
  );
}

export default RS4;