 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web.controller;

import com.example.web.dao.TicketsDao;
import com.example.web.model.Tickets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author devyo
 */
@RestController
@RequestMapping("/tickets")
public class TicketsController {

    @Autowired
    private TicketsDao dao;

    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody List<Tickets> tickets) {
         dao.saveAll(tickets);
        return "tickets booked:" + tickets.size();
    }

    @GetMapping("/getTickets")
    public List<Tickets> getTickets() {
        return (List<Tickets>) dao.findAll();
    }
}
