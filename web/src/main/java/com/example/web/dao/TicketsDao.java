/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web.dao;

import com.example.web.model.Tickets;

import org.springframework.data.repository.CrudRepository;




/**
 *
 * @author devyo
 */
public interface TicketsDao extends CrudRepository<Tickets,Integer> {

    
    
}
