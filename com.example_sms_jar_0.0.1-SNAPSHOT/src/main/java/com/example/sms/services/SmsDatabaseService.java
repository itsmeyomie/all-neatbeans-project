/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.services;

import com.example.sms.entities.Sms;
import com.example.sms.interfaces.IDatabaseService;
import com.example.sms.repository.IRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author devyo
 */
@Service
public class SmsDatabaseService implements IDatabaseService {

    @Autowired
    IRepository repository;

    @Override
    public boolean save(Sms sms) {
        try {
            repository.save(sms);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());

        }

        return false;
    }

    @Override
    public boolean saveAll(List smsList) {
        try {
            repository.saveAll(smsList);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }

        return false;
    }

}
