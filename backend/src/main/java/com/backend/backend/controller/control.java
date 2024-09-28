package com.backend.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.backend.backend.repository.loginrepo;
import com.backend.backend.model.login;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController  // Defines this as a REST controller
@RequestMapping("/login")  // Base URL for the login-related endpoints
@CrossOrigin(origins = "http://localhost:3000")
public class control {
     @Autowired  // Injects the repository into the controller
    private loginrepo loginRepository;
    
    // POST request to add new login details
    @PostMapping("/add")
    public login addLoginDetails(@RequestBody login loginDetails) {
        return loginRepository.save(loginDetails);
    }
    
    
    @GetMapping("/all")
    public List<login> getAllLoginDetails() {
        return loginRepository.findAll();
    }
}
