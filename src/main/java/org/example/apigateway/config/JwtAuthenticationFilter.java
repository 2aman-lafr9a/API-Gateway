//package org.example.apigateway.config;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import io.micrometer.common.lang.NonNull;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.example.apigateway.service.AuthService;
//import org.jetbrains.annotations.NotNull;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//
//    private final ObjectMapper mapper;
//
//    private final AuthService authService;
//
//
//    @Autowired
//    public JwtAuthenticationFilter(AuthService authService, ObjectMapper mapper) {
//        this.mapper = mapper;
//        this.authService = authService;
//    }
//
//    @Override
//    protected void doFilterInternal(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull FilterChain filterChain) throws ServletException, IOException {
//        // allow sign in and sign up requests
//        if (request.getRequestURI().equals("/api/v1/auth/login") || request.getRequestURI().equals("/api/v1/auth/signup")) {
//            filterChain.doFilter(request, response);
//            return;
//        }
//        try {
//            // this is an authentication filter, so we need to check if the request has a valid JWT token
//            String authorizationHeader = request.getHeader("Authorization");
//
//            if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
//                throw new Exception("Invalid JWT token");
//            }
//
//            String jwt = authorizationHeader.substring(7);
//            authService.validateToken(jwt);
//        } catch (Exception e) {
//            Map<String, Object> errorDetails = new HashMap<>();
//            errorDetails.put("message", "Authentication Error");
//            errorDetails.put("details", e.getMessage());
//            response.setStatus(HttpStatus.FORBIDDEN.value());
//            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
//            mapper.writeValue(response.getWriter(), errorDetails);
//        }
//        filterChain.doFilter(request, response);
//    }
//}
