/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.interfaces;

import com.example.sms.entities.Sms;
import java.util.List;

/**
 *
 * @author devyo
 * @param <T>
 */
public interface IDatabaseService<T> {

    public boolean save(Sms sms);

    public boolean saveAll(List<Sms> smsList);
    
    //    public void edit(T t);
    //
    //    public void deleteById();
    //
    //    public void get();

}
