// src/pages/Home.tsx
import React from 'react';
import { Link } from 'react-router-dom';

const Home: React.FC = () => {
  return (
    <div>
      <h1>Bienvenido a Cursero Platform</h1>
      <p>Esta es la página de inicio.</p>
      <a href='/login'>login</a>
      <a href='/dashboard'>dashboard</a>
    </div>
  );
};

export default Home;
