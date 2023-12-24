package com.java.eshop.eshop.controllers;

import com.java.eshop.eshop.config.SpringSecurityConfig;
import com.java.eshop.eshop.dto.OrderDTO;
import com.java.eshop.eshop.dto.ResponseDTO;
import com.java.eshop.eshop.dto.UserDTO;
import com.java.eshop.eshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController {

//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

//    @PostMapping("user")
//    public Principal user(Principal user) {
//        return user;
//    }
//
//    @PostMapping
//    public String login(@RequestBody UserDTO userDTO) {
////        try {
////            passwordEncoder.encode(userDTO.getPassword());
////            Authentication authenticate = authenticationManager.authenticate(
////                    new UsernamePasswordAuthenticationToken(
////                            userDTO.getUserName(),
////                            userDTO.getPassword()
////                    )
////            );
////
////            // If authentication is successful, you can return a JWT or a success message
////            return new ResponseEntity<>(true, HttpStatus.OK);
////        } catch (AuthenticationException e) {
////            // Handle authentication failure
////            return new ResponseEntity<>(false, HttpStatus.OK);
////        }
//        return "login";
//    }

    @PostMapping("/user")
    public ResponseEntity<ResponseDTO<String>> getUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(ResponseDTO.<String>builder()
                .data(userService.getUserRole(userDTO.getUserName()))
                .build(), HttpStatus.OK);
    }
}
