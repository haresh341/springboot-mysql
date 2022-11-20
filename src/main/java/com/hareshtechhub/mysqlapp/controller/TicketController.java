package com.hareshtechhub.mysqlapp.controller;

import com.hareshtechhub.mysqlapp.model.Ticket;
import com.hareshtechhub.mysqlapp.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/get")
    public ResponseEntity<List<Ticket>> getTickets() {
        List<Ticket> tickets = ticketService.getTickets();
        return ResponseEntity.status(HttpStatus.OK).body(tickets);
    }

    @PostMapping("/book")
    public ResponseEntity<Integer> bookTickets(@RequestBody List<Ticket> tickets) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ticketService.bookTickets(tickets));
    }
}
