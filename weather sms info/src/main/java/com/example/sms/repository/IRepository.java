/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sms.repository;

import com.example.sms.entities.Sms;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author devyo
 */
public interface IRepository extends JpaRepository<Sms, Long> {

}
