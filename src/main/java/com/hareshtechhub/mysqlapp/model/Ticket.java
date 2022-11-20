package com.hareshtechhub.mysqlapp.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue
    @Column(name = "ticket_id")
    private int id;

    @Column(name = "ticket_name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "ticket_category")
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
