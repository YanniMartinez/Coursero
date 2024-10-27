import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import UserProfile from './components/user/UserProfile';
import Home from './pages/Home';
import Login from './pages/Login';
import Dashboard from './pages/Dashboard';
import Register from './pages/Register';

const App: React.FC = () => {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<UserProfile />} />
        <Route path="/dashboard" element={<Dashboard />} /> 
        <Route path="/register" element={<Register />} /> 
      </Routes>
    </Router>
  );
};

export default App;
