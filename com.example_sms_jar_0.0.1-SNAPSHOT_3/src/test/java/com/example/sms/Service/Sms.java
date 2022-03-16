/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.Service;
import com.africastalking.AfricasTalking;
import com.africastalking.SmsService;
import com.africastalking.sms.Recipient;
import com.example.sms.interfaces.Inotification;
import java.io.IOException;
import java.util.List;
import com.example.sms.models.Message;
/**
 *
 * @author devyo
 */
public class Sms implements Inotification {
    private final String API_USERNAME = "hashmy";
    private final String API_KEY = "20324778043145deec5eb08d77d2b6d237032950d9636ebad70b443d8c45e966";

    private static SmsService sms;

    @Override
    public Boolean sendNotification(String[] target, Message message) {
        try {
            List<Recipient> list = sms.send(message.getText(), target, true);
            list.forEach((recipient) -> {
                recordAction(recipient);
            });
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    
    private Boolean recordAction(Recipient recipient){
        System.out.println(recipient);
        return true;
    }

    public Sms() {
        AfricasTalking.initialize(API_USERNAME, API_KEY);
        sms = AfricasTalking.getService(AfricasTalking.SERVICE_SMS);
    }

    
    

}

    

