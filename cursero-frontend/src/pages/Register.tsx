// src/pages/Register.tsx
import React, { useState } from 'react';
import { useDispatch } from 'react-redux';
import { setUser } from '../slices/userSlice'; // Asegúrate de que la ruta sea correcta
import axios from 'axios';

const Register: React.FC = () => {
  const dispatch = useDispatch();
  const [name, setName] = useState<string>('');
  const [email, setEmail] = useState<string>('');
  const [password, setPassword] = useState<string>('');
  const [error, setError] = useState<string | null>(null);

  const handleRegister = async (event: React.FormEvent) => {
    event.preventDefault(); // Evita que la página se recargue

    try {
      // Hacer la llamada al backend para crear el usuario
      const response = await axios.post('http://localhost:8080/api/alumnos', {
        name,
        email,
        password,
      });

      // Suponiendo que el backend devuelve el usuario creado
      const user = response.data;

      // Despachar la acción para almacenar el usuario en el estado global
      dispatch(setUser(user));

      // Redirigir o mostrar un mensaje de éxito
      console.log('Usuario registrado con éxito:', user);
    } catch (err) {
      // Manejo de errores
      setError('Error al registrar el usuario. Intenta de nuevo.');
      console.error(err);
    }
  };

  return (
    <div>
      <h1>Registrar Usuario</h1>
      <form onSubmit={handleRegister}>
        <div>
          <label>
            Nombre:
            <input type="text" value={name} onChange={(e) => setName(e.target.value)} required />
          </label>
        </div>
        <div>
          <label>
            Correo Electrónico:
            <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} required />
          </label>
        </div>
        <div>
          <label>
            Contraseña:
            <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} required />
          </label>
        </div>
        {error && <p style={{ color: 'red' }}>{error}</p>}
        <button type="submit">Registrar</button>
      </form>
    </div>
  );
};

export default Register;
