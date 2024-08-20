package com.bs.relations.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity()
@Table(name = "clients")
public class Client {

    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "first_name", length = 100, nullable = false)
    private String first_name;

    @Column(name = "last_name", length = 100, nullable = false)
    private String last_name;

    // SI SE CREA UN CLIENTE, EL CASCADE, orphanRemoval PERMITE QUE SE GUARDE INMEDIATAMENTE LAS DIRECCIONES O SI SE BORRA EL CLIENTE SE BORRAN LAS DIRECCIONES
    // @JoinColumn(name = "client_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) 
    @JoinTable(
        name="client_addresses", 
        joinColumns = @JoinColumn(name = "client_id"),
        inverseJoinColumns = @JoinColumn(name = "address_id"), // estas si se pueden repetir este id
        uniqueConstraints = @UniqueConstraint(columnNames = {"address_id"}) // llaves unicas, no se pueden repetir
    )
    private List<Address> addresses;

    @OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, mappedBy="client")
    private List<Invoice> invoices;

    public Client() {
        this.addresses = new ArrayList<>();
        this.invoices = new ArrayList<>();
    }

    public Client(String first_name, String last_name) {
        this(); // this() es como llamar al constructor por defecto
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Client(String id, String first_name, String last_name) {
        this(); // this es como llamar al constructor por defecto
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public String toString() {
        return "Client {id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", addresses=" + addresses + "}";
    }

}
