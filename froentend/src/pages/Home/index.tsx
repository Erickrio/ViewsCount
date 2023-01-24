import { FiBarChart } from 'react-icons/fi';
import axios from 'axios';
import React, { useEffect, useState } from 'react';
import { View } from '../../types/view';
import { BASE_URL } from '../../util/request';

import './styles.css';

const Home = () => {
  const [view, setView] = useState<View>();
  const [counter, setCounter] = useState(0);



  const handleClick1 = () => {
    axios
      .post(BASE_URL+'/views', {
      })
      .then((response) => {
        setView(response.data);
      // alert('Obrigado! Entraremos em contato com você em breve!');
        console.log(response.data);
      }).catch((error) =>{
        console.log(error);
      });
  };

  useEffect(() => {
    axios
      .get(BASE_URL + '/views/count-por-views')
      .then((response) => {
        setView(response.data);
        console.log(response.status);
        console.log(response);
      })
      .catch((error) => {
        setView(undefined);
      });
  },[]);

  return (
    <div className="home-container">
      <h1>View de Página</h1>
      <div className="home-card-container">
        {/* <div className="home-img">
           <h2>Imagem</h2>
         </div> */}
        <button onClick={handleClick1} className="btn btn-primary view-button">
        {/* <a href="https://www.w3schools.com">veja mais</a> */} observe
        </button>
        <div className="home-views">
        <FiBarChart /> <h1> {view?.id}</h1>
            
        </div>
      </div>
    </div>
  );
};

export default Home;
