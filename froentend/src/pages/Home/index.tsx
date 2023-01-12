import './styles.css';
import { FiBarChart } from 'react-icons/fi';
import React, { useState } from "react";

const Home = () => {
  
  const [counter, setCounter] = useState(0)
  
  const handleClick1 = () => {
    
    setCounter(counter + 1)

  }
  

  return (
    <div className="home-container">
      <h1>View de Página</h1>
      <div className="home-card-container">
        {/* <div className="home-img">
           <h2>Imagem</h2>
         </div> */}
        <div>
         <button 
          onClick={handleClick1}
          className="btn btn-primary view-button">Veja Mais</button>
        </div>
        <div className="home-views">
          <FiBarChart />  <h1>{counter}</h1> 
        </div>
      </div>
    </div>
  );
};

export default Home;
