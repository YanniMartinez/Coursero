import React from 'react';
import { useDispatch } from 'react-redux';
import { clearUser, setUser } from '../../slices/userSlice';
import { Link, useNavigate } from 'react-router-dom';

const UserProfile: React.FC = () => {
    const dispatch = useDispatch();
    const navigate = useNavigate();

    const handleLogin = () => {
        // Simulando datos de un usuario autenticado
        const userData = {
            id: '123',
            name: 'Juan Perez',
            email: 'juan.perez@example.com',
        };
        dispatch(setUser(userData)); // Establecer el usuario en el estado

        //Once the user login will be redirected to dashboard page
        navigate('/dashboard');
    };

    const handleLogout = () => {
        dispatch(clearUser()); // Limpiar el estado del usuario
    };

    return (
        <div>
            <h1>User Profile</h1>
            <button onClick={handleLogin}>Login</button>
            <button onClick={handleLogout}>Logout</button>
            {/* <a href='/dashboard'>Holaaa ....   </a> */}
            <Link to="/dashboard">Ir a dashboard</Link>
            
        </div>
    );
};

export default UserProfile;
