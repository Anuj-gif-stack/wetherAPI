package com.wether.wetherAPI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public String Welcome(){
        return "This is my API";
    }

    @RestController
    @RequestMapping("/api/weather")
    public class WeatherController {
        private final WeatherService weatherService;

        @Autowired
        public WeatherController(WeatherService weatherService) {
            this.weatherService = weatherService;
        }

        @GetMapping
        public ResponseEntity<WeatherResponse> getWeather(@RequestParam String city) {
            WeatherResponse response = weatherService.getWeatherForCity(city);
            return ResponseEntity.ok(response);
        }
    }
}
