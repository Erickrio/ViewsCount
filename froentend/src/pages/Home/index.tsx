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
       alert('Obrigado! Entraremos em contato com você em breve!');
        console.log(response.data);
      }).catch((error) =>{
        console.log(error);
      });
  };

  useEffect(() => {
    axios
      .get(BASE_URL + '/views/count-por-views/1')
      .then((response) => {
        setView(response.data);
        console.log(response.status)
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
          Veja Mais
        </button>
        <div className="home-views">
          <FiBarChart /> <h1>{view}</h1>
        </div>
      </div>
    </div>
  );
};

export default Home;
