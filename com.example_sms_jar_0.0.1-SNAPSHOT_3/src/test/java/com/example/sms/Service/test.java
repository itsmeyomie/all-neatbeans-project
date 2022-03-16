/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.Service;

import com.example.sms.models.Message;

/**
 *
 * @author devyo
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Sms sms = new Sms();
        String[] targets = {"+254737507880"};
        Message message = new Message("202101311829", "Hallo from Sprinqle", "241134124324L");
        sms.sendNotification(targets, message);
        System.out.println("Message Sent");
    } 
    }
    

