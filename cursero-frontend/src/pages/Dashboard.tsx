// src/pages/Dashboard.tsx
import React from 'react';
import { useSelector } from 'react-redux';
import { RootState } from '../store';

const Dashboard: React.FC = () => {
  const user = useSelector((state: RootState) => state.user);

  return (
    <div>
      <h1>Dashboard</h1>
      {user.id ? (
        <p>Bienvenido, {user.name} ({user.email})</p>
      ) : (
        <p>No has iniciado sesión.</p>
      )}
    </div>
  );
};

export default Dashboard;
