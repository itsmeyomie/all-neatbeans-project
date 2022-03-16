/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.interfaces;

import com.example.sms.models.SmsNotification;

/**
 *
 * @author devyo
 * @param <T>
 */
public interface ISendSMSAction<T> {

    public void sendSms(SmsNotification sms);
}
