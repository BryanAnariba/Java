package com.bs.relations.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity()
@Table(name = "invoices")
public class Invoice {

    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "total", nullable = false, precision = 2)
    private double total;

    @ManyToOne()
    @JoinColumn(name = "client_id")
    private Client client;

    public Invoice() {
    }

    public Invoice(String description, double total) {
        this.description = description;
        this.total = total;
    }

    public Invoice(String id, String description, double total) {
        this.id = id;
        this.description = description;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Invoice {id=" + id + ", description=" + description + ", total=" + total + "}";
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
