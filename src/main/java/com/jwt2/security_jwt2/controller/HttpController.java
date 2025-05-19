package com.jwt2.security_jwt2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping
public class HttpController {
    
    
    @GetMapping("/public")
    public String publicRoute() {
        return "<h1>Public Route feel free to look around! :lock </h1>";
    }
    @GetMapping("/private")
    public String privateRoute() {
        return "<h1>Private Route you need to be authenticated! :lock </h1>";
    }   
    
    

}
