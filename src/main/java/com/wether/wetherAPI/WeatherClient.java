package com.wether.wetherAPI;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "weatherClient", url = "${weather.api.url}")
public interface WeatherClient {
    @GetMapping
    WeatherResponse getWeather(@RequestParam("q") String city, @RequestParam("appid") String apiKey);
}