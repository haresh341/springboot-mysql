package com.hareshtechhub.mysqlapp.service;

import com.hareshtechhub.mysqlapp.model.Ticket;
import com.hareshtechhub.mysqlapp.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Integer bookTickets(List<Ticket> tickets) {
        ticketRepository.saveAll(tickets);
        return tickets.size();
    }
    public List<Ticket> getTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }

}
