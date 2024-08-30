package com.wether.wetherAPI;

public class WeatherResponse {
    private String name;
    private Main main;

    public static class Main {
        private double temp;
        private int humidity;

        public int getHumidity() {
            return humidity;
        }

        public double getTemp() {
            return temp;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}