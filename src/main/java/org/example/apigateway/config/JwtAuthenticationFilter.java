package org.example.apigateway.config;

import io.micrometer.common.lang.NonNull;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.apigateway.grpc.authentication.AuthenticationOuterClass;
import org.example.apigateway.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final UserDetailsService UserDetailsService;

    private final AuthService authService;


    @Autowired
    public JwtAuthenticationFilter(UserDetailsService UserDetailsService, AuthService authService) {
        this.UserDetailsService = UserDetailsService;
        this.authService = authService;
    }

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain) throws ServletException, IOException {
        if (request.getRequestURI().equals("/api/v1/auth/signIn") || request.getRequestURI().equals("/api/v1/auth/signUp")) {
            filterChain.doFilter(request, response);
            return;
        }
        // this is an authentication filter, so we need to check if the request has a valid JWT token
        final String authorizationHeader = request.getHeader("Authorization");
        final String jwt;
        final String userName;
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            jwt = authorizationHeader.substring(7);
            AuthenticationOuterClass.TokenValidationResponse validateTokenResponse = authService.validateToken(jwt);
            userName = validateTokenResponse.getUsername();

            if (SecurityContextHolder.getContext().getAuthentication() == null) {
                UserDetails userDetails = this.UserDetailsService.loadUserByUsername(userName);
                if (validateTokenResponse.getSuccess()) {
                    UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    token.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(token);
                }
            }
            filterChain.doFilter(request, response);
        } else {
            filterChain.doFilter(request, response);
        }
    }
}