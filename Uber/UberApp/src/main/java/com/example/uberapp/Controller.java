package com.example.uberapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private UberService uberService;
    public Controller(UberService uberService) {
        this.uberService = uberService;

}
    @PostMapping("users")
    public void registerUser(@RequestBody RegisterUserRequest registerUserRequest){
    uberService.registerUser(registerUserRequest);
    }

    @PostMapping("users")
    public void loginUser(@RequestBody LoginUserRequest loginUserRequest) {
        uberService.loginUser(loginUserRequest);
    }

}
