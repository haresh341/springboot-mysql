package com.hareshtechhub.mysqlapp.repository;

import com.hareshtechhub.mysqlapp.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
