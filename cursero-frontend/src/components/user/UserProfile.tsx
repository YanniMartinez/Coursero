import React from 'react';
import { useDispatch } from 'react-redux';
import { clearUser, setUser } from '../../slices/userSlice';

const UserProfile: React.FC = () => {
    const dispatch = useDispatch();

    const handleLogin = () => {
        // Simulando datos de un usuario autenticado
        const userData = {
            id: '123',
            name: 'Juan Perez',
            email: 'juan.perez@example.com',
        };
        dispatch(setUser(userData)); // Establecer el usuario en el estado
    };

    const handleLogout = () => {
        dispatch(clearUser()); // Limpiar el estado del usuario
    };

    return (
        <div>
            <h1>User Profile</h1>
            <button onClick={handleLogin}>Login</button>
            <button onClick={handleLogout}>Logout</button>
        </div>
    );
};

export default UserProfile;
