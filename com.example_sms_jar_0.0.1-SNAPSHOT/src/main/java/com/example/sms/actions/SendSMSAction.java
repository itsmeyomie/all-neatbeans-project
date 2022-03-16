/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.actions;

import com.example.sms.entities.Sms;
import com.example.sms.interfaces.IDatabaseService;
import com.example.sms.interfaces.ISendSMSAction;
import com.example.sms.interfaces.ISendSMSService;
import com.example.sms.models.Person;
import com.example.sms.models.SmsNotification;
import com.example.sms.services.AfricaStalkingSendSMSService;
import com.example.sms.services.SmsDatabaseService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.example.sms.services.TestSendSMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author devyo
 */
@Component
public class SendSMSAction implements ISendSMSAction {

    @Autowired
    ISendSMSService sendSMSService;

    @Autowired
    IDatabaseService databaseService;

    @Override
    public void sendSms(SmsNotification smsNotification) {

        //my validations
//        if (sms.getMessage().getText().isEmpty()) {
//            throw (new NullPointerException("message cannot be empty"));
//        }
        //call the service
        boolean smsSent = sendSMSService.sendSms(smsNotification);

        List<Person> persons = smsNotification.getPersons();
        String message = smsNotification.getMessage().getText();
        List<Sms> smsList = new ArrayList<>();
        for (Person person : persons) {
            Sms sms = new Sms();           
            sms.setPhoneNumber(Long.parseLong(person.getNumber().replace("+", "")));
            sms.setNotification(message);
            sms.setTimeStamp(new Date());

            if (smsSent) {
                sms.setDeliveryReport(1);
            }
            smsList.add(sms);
        }
        System.out.println(Arrays.toString(smsList.toArray()));
        try {
            databaseService.saveAll(smsList);
        } catch (Exception ex) {
            Logger.getLogger(SendSMSAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
