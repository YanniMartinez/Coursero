package com.marInc.cursero_platform.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desactiva CSRF para evitar errores en desarrollo
                .cors(cors -> {}); // Habilita CORS

        http
                .authorizeHttpRequests(authorize ->
                        authorize.anyRequest().permitAll()); // Permitir todas las solicitudes

        return http.build();
    }
}
