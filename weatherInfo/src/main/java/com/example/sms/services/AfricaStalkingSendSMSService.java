/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.services;

import com.africastalking.AfricasTalking;
import com.africastalking.SmsService;
import com.example.sms.models.SmsNotification;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import com.example.sms.interfaces.ISendSMSService;

/**
 *
 * @author devyo
 */
@Service
public class AfricaStalkingSendSMSService implements ISendSMSService {

    private final String API_USERNAME = "hashmy";
    private final String API_KEY = "20324778043145deec5eb08d77d2b6d237032950d9636ebad70b443d8c45e966";

    private static SmsService smsService;

    @Override
    public boolean sendSms(SmsNotification sms) {
        String Msg = sms.getMessage().getMessage();
        try {
            smsService.send(Msg, getPhoneNumbers(sms), true);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(AfricaStalkingSendSMSService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private String[] getPhoneNumbers(SmsNotification sms) {
        String[] phoneNumbers = new String[sms.getPersons().size()];
        for (int i = 0; i < sms.getPersons().size(); i++) {
            String incomingPhoneNumber = sms.getPersons().get(i).getNumber();            
            String phoneNumber = "+254" + incomingPhoneNumber.substring(incomingPhoneNumber.length() - 9);
            phoneNumbers[i] = phoneNumber;
        }
        return phoneNumbers;
    }

    public AfricaStalkingSendSMSService() {
        AfricasTalking.initialize(API_USERNAME, API_KEY);
        smsService = AfricasTalking.getService(AfricasTalking.SERVICE_SMS);
    }

}
