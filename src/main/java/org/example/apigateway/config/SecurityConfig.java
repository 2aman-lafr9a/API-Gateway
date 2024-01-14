//package org.example.apigateway.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
////    private final JwtAuthenticationFilter jwtAuthenticationFilter;
////
////    @Autowired
////    public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter) {
////        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
////    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        todo enable csrf
//        http
//                .csrf(AbstractHttpConfigurer::disable);
////                .authorizeHttpRequests(authorize -> authorize.requestMatchers("/api/v1/auth/**")
////                                .permitAll()
////                .anyRequest().authenticated()
////                );
//
////         Add JWT token filter
////        http.addFilterAfter(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//        return http.build();
//    }
//
//
//}