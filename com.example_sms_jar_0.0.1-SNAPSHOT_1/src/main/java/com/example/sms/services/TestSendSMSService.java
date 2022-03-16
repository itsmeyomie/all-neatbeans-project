/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.services;

import com.example.sms.interfaces.ISendSMSService;
import com.example.sms.models.SmsNotification;
import java.util.Arrays;

/**
 *
 * @author devyo
 */

public class TestSendSMSService implements ISendSMSService {

    @Override
    public boolean sendSms(SmsNotification sms) {
        System.out.println("Testin sending sms");
        System.out.println("Person =>  " + Arrays.toString(sms.getPersons().toArray()));
       // System.out.println("Message => " + sms.getMessage().messages());
        return true;
    }

}
