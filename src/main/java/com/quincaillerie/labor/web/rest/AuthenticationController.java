package com.quincaillerie.labor.web.rest;

import com.quincaillerie.labor.models.AuthenticationRequest;
import com.quincaillerie.labor.models.AuthenticationResponse;
import com.quincaillerie.labor.service.MyUserDetailsService;
import com.quincaillerie.labor.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/authenticate")
public class AuthenticationController {
    @Autowired
        private AuthenticationManager authenticationManager;

    @Autowired
        private MyUserDetailsService userDetailsService;
    @Autowired
        private JwtUtil jwtTokenUtil;
        @PostMapping("")
        public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
            try{
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword())
                );
            }
            catch (BadCredentialsException e){
                throw new Exception("Incorrect username or password", e);
            }
            final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
            final String jwt = jwtTokenUtil.generateToken(userDetails);

            return ResponseEntity.ok(new AuthenticationResponse(jwt));
        }
}
