package com.wether.wetherAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private final WeatherClient weatherClient;
    private final String apiKey;

    @Autowired
    public WeatherService(WeatherClient weatherClient, @Value("${weather.api.key}") String apiKey) {
        this.weatherClient = weatherClient;
        this.apiKey = apiKey;
    }

    public WeatherResponse getWeatherForCity(String city) {
        return weatherClient.getWeather(city, apiKey);
    }
}