package com.example.uberapp;

public class Passenger {
        private String username;
        private String password;
        private String last_geolocation;
        private boolean isPassengerTaken;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getLast_geolocation() {
            return last_geolocation;
        }

        public void setLast_geolocation(String last_geolocation) {
            this.last_geolocation = last_geolocation;
        }

        public boolean isPassengerTaken() {
            return isPassengerTaken;
        }

        public void setPassengerTaken(boolean passengerTaken) {
            isPassengerTaken = passengerTaken;
        }
    }

