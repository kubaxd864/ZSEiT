import React, { useState } from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import RS3 from './components/RS3-Box';
import RS4 from './components/RS4-Box';
import RS6 from './components/RS6-Box';

const root = ReactDOM.createRoot(document.getElementById('root'));

function Main() {
  const [showComponents, setShowComponents] = useState(false);
  const [selectedComponent, setSelectedComponent] = useState(null);

  const handleClick = (component) => {
      setSelectedComponent(component);
      setShowComponents(true);
  };

  const HideComponent = event => {
    setSelectedComponent(false);
    setShowComponents(null);
  };

  return (
    <React.StrictMode>
      {showComponents && selectedComponent === "RS3" && <RS3 />}
      {showComponents && selectedComponent === "RS4" && <RS4 />}
      {showComponents && selectedComponent === "RS6" && <RS6 />}
      <div className="App">
        <div className="mini-box">
          <div className="mini-box-img">
            <img src={require("./img/RS3/Audi-RS3-1.jpg")} alt="Audi RS3" />
          </div>
          <div className="mini-box-text">
            <h1 className="mini-box-title">Audi RS 3</h1>
            <p className="mini-box-description">
              Audi RS 3 w aktualnym wydaniu zostało oficjalnie pokazane w lipcu ubiegłego roku. Opisywany model został
              wyposażony w pięciocylindrowy silnik 2.5 TFSI, który osiąga 400 KM i 500 Nm ...
            </p>
            <button className="mini-box-button" onClick={() => handleClick("RS3")} onDoubleClick = {HideComponent} >Zobacz Więcej</button>
          </div>
        </div>
        <div className="mini-box">
          <div className="mini-box-img">
            <img src={require("./img/RS4/Audi-RS4-1.jpg")} alt="Audi RS4" />
          </div>
          <div className="mini-box-text">
            <h1 className="mini-box-title">Audi RS 4</h1>
            <p className="mini-box-description">
              Nowe Audi RS4 Avant napędzane jest silnikiem 2.9 TFSI V6 wyposażonym w dwie turbosprężarki. Dokładnie 18 lat
              temu prawie identyczny motor trafił do pierwszej generacji RS4 ...
            </p>
            <button className="mini-box-button" onClick={() => handleClick("RS4")} onDoubleClick = {HideComponent}>Zobacz Więcej</button>
          </div>
        </div>
        <div className="mini-box">
          <div className="mini-box-img">
            <img src={require("./img/RS6/Audi-RS6-1.jpg")} alt="Audi RS6" />
          </div>
          <div className="mini-box-text">
            <h1 className="mini-box-title">Audi RS 6</h1>
            <p className="mini-box-description">
              Gdy obok RS 6 przechodzą osoby, które nie są fanami motoryzacji, na dłuższą chwilę zawieszają wzrok. Niby
              zwykłe kombi, a jednak jakieś takie niezwykłe ...
            </p>
            <button className="mini-box-button" onClick={() => handleClick("RS6")} onDoubleClick = {HideComponent}>Zobacz Więcej</button>
        </div>
       </div>
    </div>
    </React.StrictMode>
  );
}

root.render(<Main />);
