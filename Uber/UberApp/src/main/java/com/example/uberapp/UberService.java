package com.example.uberapp;

public class UberService {
    private UberRepository uberRepository;

    public UberService(UberRepository uberRepository) {
        this.uberRepository = uberRepository;
    }


    public void loginUser(LoginUserRequest loginUserRequest) {
        int pass = loginUserRequest.getPassword().hashCode();

        if (loginUserRequest.getUserType().equals("passenger")) {
            Passenger passenger = new Passenger();
            passenger.setUsername(loginUserRequest.getUsername());
            passenger.setPassword(Integer.toString(pass));
            passenger.setLast_geolocation("");
            passenger.setPassengerTaken(false);
            uberRepository.loginPassenger(passenger);
        } else {
            Driver driver = new Driver();
            driver.setUsername(loginUserRequest.getUsername());
            driver.setPassword(Integer.toString(pass));
            driver.setLast_geolocation("");
            driver.setDriverTaken(false);
            uberRepository.loginDriver(driver);
        }
    }

    public void registerUser(RegisterUserRequest registerUserRequest) {
        int pass = registerUserRequest.getPassword().hashCode();

        if (registerUserRequest.getUserType().equals("passenger")) {
            Passenger passenger = new Passenger();
            passenger.setUsername(registerUserRequest.getUsername());
            passenger.setPassword(Integer.toString(pass));
            passenger.setLast_geolocation("");
            passenger.setPassengerTaken(false);
            uberRepository.registerPassenger(passenger);
        } else {
            Driver driver = new Driver();
            driver.setUsername(registerUserRequest.getUsername());
            driver.setPassword(Integer.toString(pass));
            driver.setLast_geolocation("");
            driver.setDriverTaken(false);
            uberRepository.registerDriver(driver);
        }
    }
}


