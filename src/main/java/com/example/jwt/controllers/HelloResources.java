package com.example.jwt.controllers;

import com.example.jwt.models.AuthenticationRequest;
import com.example.jwt.models.AuthenticationResponse;
import com.example.jwt.services.MyUserDetailsService;
import com.example.jwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * Created by Iabur on February 15, 2021.
 */
@RestController
public class HelloResources {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Iabur";
    }
}

