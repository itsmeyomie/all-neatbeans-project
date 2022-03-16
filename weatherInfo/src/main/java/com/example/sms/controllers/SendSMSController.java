/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.controllers;

import com.example.Rest.weather.models.GlobalWeather;
import com.example.sms.actions.SendSMSAction;
import com.example.sms.interfaces.ISendSMSAction;
import com.example.sms.interfaces.IgetWeather;
import com.example.sms.models.Person;
import java.io.IOException;
import com.example.sms.models.SmsNotification;
import com.example.sms.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author devyo
 */
@RestController
public class SendSMSController {

    SmsNotification sms;
    Person person;

    @Autowired
    ISendSMSAction<SendSMSAction> sendSMSAction;

    @Autowired
    IgetWeather<WeatherService> igetWeather;

//    ISendSMSService sendSMS;
//
//    public SendSMSController() {
//        sendSMS = new AfricaStalkingSendSMSService();
//    }    
//    @PostMapping("/sendSms")
//    public void sendingSms(@RequestBody SmsNotification sms) throws IOException {
//        sendSMSAction.sendSms(sms);
//
//    }
    @GetMapping("/fetchSend")
    public ResponseEntity<GlobalWeather> getWeather(@RequestParam float lon, @RequestParam int lat) throws IOException {
        GlobalWeather globalWeather = igetWeather.getWeather(lon, lat);
//        person.setNumber(number);
//        sendSMSAction.sendSms(sms);
        return new ResponseEntity(globalWeather, HttpStatus.OK);

    }

}
