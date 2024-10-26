import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import UserProfile from './components/user/UserProfile';
/*import Home from './pages/Home';
import Courses from './pages/Courses';
import Profile from './pages/Profile';*/

const App: React.FC = () => {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<UserProfile />} />
        {/* <Route path="/courses" element={<Courses />} />
        <Route path="/profile" element={<Profile />} /> */}
      </Routes>
    </Router>
  );
};

export default App;
