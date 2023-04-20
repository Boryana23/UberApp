package com.example.uberapp;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class UberRepository {

    public void registerPassenger(Passenger passenger){

        RestTemplate restTemplate = new RestTemplate();

        String resourceUrl = "http://localhost:8081/passengers/register";

        HttpEntity<Passenger> request = new HttpEntity<Passenger>(passenger);
        String passengerCreateResponse = restTemplate.postForObject(resourceUrl, request, String.class);

        System.out.println(passengerCreateResponse);
    }

    public void registerDriver(Driver driver){

        RestTemplate restTemplate = new RestTemplate();

        String resourceUrl = "http://localhost:8082/drivers/register";

        HttpEntity<Driver> request = new HttpEntity<Driver>(driver);
        String driverCreateResponse = restTemplate.postForObject(resourceUrl, request, String.class);

        System.out.println(driverCreateResponse);
    }

    public void loginPassenger(Passenger passenger){

        RestTemplate restTemplate = new RestTemplate();

        String resourceUrl = "http://localhost:8081/passengers/login";

        HttpEntity<Passenger> request = new HttpEntity<Passenger>(passenger);
        String passengerCreateResponse = restTemplate.postForObject(resourceUrl, request, String.class);

        System.out.println(passengerCreateResponse);
    }

    public void loginDriver(Driver driver){

        RestTemplate restTemplate = new RestTemplate();

        String resourceUrl = "http://localhost:8082/drivers/login";

        HttpEntity<Driver> request = new HttpEntity<Driver>(driver);
        String driverCreateResponse = restTemplate.postForObject(resourceUrl, request, String.class);

        System.out.println(driverCreateResponse);
    }


}
