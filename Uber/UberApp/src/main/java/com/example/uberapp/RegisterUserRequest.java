package com.example.uberapp;

public class RegisterUserRequest {
    private String username;
    private String password;

    private String userType;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType(){
        return userType;
    }
}
