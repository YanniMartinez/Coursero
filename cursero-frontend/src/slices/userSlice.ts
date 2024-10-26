import { createSlice, PayloadAction } from '@reduxjs/toolkit';

// Definimos la interfaz para el estado de usuario
interface UserState {
    id: string | null;
    name: string | null;
    email: string | null;
}

// Estado inicial
const initialState: UserState = {
    id: null,
    name: null,
    email: null,
};

// Creamos el slice
const userSlice = createSlice({
    name: 'user', // Nombre del slice
    initialState, // Estado inicial
    reducers: {
        // Acciones para modificar el estado
        setUser: (state, action: PayloadAction<UserState>) => {
            // Actualizamos el estado con los datos del usuario
            state.id = action.payload.id;
            state.name = action.payload.name;
            state.email = action.payload.email;
        },
        clearUser: (state) => {
            // Reiniciamos el estado del usuario
            state.id = null;
            state.name = null;
            state.email = null;
        },
    },
});

// Exportamos las acciones generadas por createSlice
export const { setUser, clearUser } = userSlice.actions;

// Exportamos el reductor
export default userSlice.reducer;
