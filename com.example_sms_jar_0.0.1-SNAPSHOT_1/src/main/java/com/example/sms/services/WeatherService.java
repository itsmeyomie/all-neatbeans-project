package com.example.sms.services;

import com.example.Rest.weather.models.GlobalWeather;
import com.example.sms.interfaces.IgetWeather;
import com.example.sms.models.SmsNotification;
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

        
        
        
     
      

     

        System.out.println(messages(globalWeather));

        return globalWeather;
    }

    public WeatherService() {
    }

    public String messages(GlobalWeather globalWeather) {

        String msg = "wind speed " + globalWeather.getWind().getSpeed() + " humidity "
                + globalWeather.getMain().getHumidity() + " temp " + globalWeather.getMain().getTemp() + " and there are  " + getWeather(globalWeather);

        return msg;
    }

    public String getWeather(GlobalWeather globalWeather) {
        String weth = globalWeather.getWeather().get(0).getDescription();
        return weth;
    }

}
