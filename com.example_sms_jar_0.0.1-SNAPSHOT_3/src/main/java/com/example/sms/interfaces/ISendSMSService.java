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
public interface ISendSMSService<T> {

    public boolean sendSms(SmsNotification sms);
}
