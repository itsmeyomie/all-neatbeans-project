 
 
package com.example.Rest.weather.services;

import com.example.Rest.weather.Interfaces.IgetWeather;

import com.example.Rest.weather.models.GlobalWeather;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService implements IgetWeather {
    

    @Value("${weather.endpoint}")
    String endpoint;

    @Value("${weather.appid}")
    String appid;

    @Override
    public GlobalWeather getWeather(float lat, int lon) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("%s?lat=%f&lon=%d&appid=%s", endpoint, lat, lon, appid);
        System.out.println(url);
        GlobalWeather globalWeather = restTemplate.getForObject(url, GlobalWeather.class);
//        System.out.println(globalWeather.getMain().getHumidity());
        System.out.println(getMessage());
      
           return globalWeather;
}
   GlobalWeather weather;
public String getMessage() {
        String message = "your wind speed is 5"  + " " + "humidity is "+weather.toString();
                

        return message;

    }

}
