/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.controllers;

import com.example.Rest.weather.models.GlobalWeather;
//import com.example.sms.actions.SendSMSAction;
import com.example.sms.entities.Sms;
import com.example.sms.interfaces.IDatabaseService;
//import com.example.sms.interfaces.ISendSMSAction;
import com.example.sms.interfaces.ISendSMSService;
import com.example.sms.interfaces.IgetWeather;
import com.example.sms.models.Message;
import com.example.sms.models.Person;
import com.example.sms.models.Sender;
import com.example.sms.models.SmsNotification;
import com.example.sms.services.AfricaStalkingSendSMSService;
import com.example.sms.services.SmsDatabaseService;
import com.example.sms.services.WeatherService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author devyo
 */
@RestController
public class SendSMSController {

//    @Autowired
//    ISendSMSAction<SendSMSAction> sendSMSAction;
    @Autowired
    ISendSMSService<AfricaStalkingSendSMSService> sendSms;

    @Autowired
    IgetWeather<WeatherService> igetWeather;

    @Autowired
    IDatabaseService<SmsDatabaseService> database;

//   ISendSMSService sendSMS;
//   
//   public void SendSMSController() {
//       sendSMS = new AfricaStalkingSendSMSService();
//  }    
    @GetMapping("/global-weather")
    public ResponseEntity<GlobalWeather> sendWeatherInfo(@RequestBody Sender send) {
        GlobalWeather globalWeather = igetWeather.getWeather(send.getLat(), (int) send.getLon());
        String message = message(globalWeather);

        SmsNotification smsNotification = new SmsNotification();
        Message msg = new Message();
        msg.setText(message);
        smsNotification.setMessage(msg);
      

        ArrayList<Person> persons = new ArrayList<>();
        Person person = new Person();
        person.setNumber(send.getNumber());
        persons.add(person);
        smsNotification.setPersons(persons);
        
         sendSms.sendSms(smsNotification);


        List<Sms> smsList = new ArrayList<>();
        Sms sms = new Sms();
        sms.setPhoneNumber(Long.parseLong(send.getNumber().replace("+", "")));
        sms.setNotification(message);
        sms.setTimeStamp(new Date());
        database.save(sms);

        
        
        boolean smsSent = sendSms.sendSms(smsNotification);
        if (smsSent) {
            sms.setDeliveryReport(1);
        }
        smsList.add(sms);

        System.out.println(Arrays.toString(smsList.toArray()));
        try {
            database.saveAll(smsList);
        } catch (Exception ex) {
            Logger.getLogger(SendSMSController.class.getName()).log(Level.SEVERE, null, ex);
        }

//     
        return new ResponseEntity(globalWeather, HttpStatus.OK);
    }

    public String message(GlobalWeather globalWeather) {
        String message = "wind speed " + globalWeather.getWind().getSpeed() + " humidity "
        + globalWeather.getMain().getHumidity() + " temp " + globalWeather.getMain().getTemp() + " and there are  ";
        return message;
    }

}
