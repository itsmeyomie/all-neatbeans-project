/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.controllers;

import com.example.sms.actions.SendSMSAction;
import com.example.sms.interfaces.ISendSMSAction;
import java.io.IOException;
import com.example.sms.models.SmsNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author devyo
 */
@RestController
public class SendSMSController {

    @Autowired
    ISendSMSAction<SendSMSAction> sendSMSAction;

//    ISendSMSService sendSMS;
//
//    public SendSMSController() {
//        sendSMS = new AfricaStalkingSendSMSService();
//    }    
    @PostMapping("/sendSms")
    public void sendingSms(@RequestBody SmsNotification sms) throws IOException {
        sendSMSAction.sendSms(sms);

    }

}
