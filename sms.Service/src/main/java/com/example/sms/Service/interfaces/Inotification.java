/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.Service.interfaces;

import models.Message;

/**
 *
 * @author devyo
 */
public interface Inotification<T> {
       public T sendNotification(String[] target, Message message);

}


