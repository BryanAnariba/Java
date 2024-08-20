package com.bs.relations.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bs.relations.entities.Address;
import com.bs.relations.entities.Client;
import com.bs.relations.entities.Invoice;
import com.bs.relations.repositories.IClientRepository;
import com.bs.relations.repositories.IInvoiceRepository;

@RestController()
@RequestMapping("/api/relations")
public class Relations {

  @Autowired()
  private IClientRepository clientRepository;

  @Autowired()
  private IInvoiceRepository invoiceRepository;


  // Many to One
  @PostMapping(path = "/create/client-and-invoice")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Invoice> createClientAndInvoice() {
    // Creando cliente
    Client client = new Client("Bryan", "Doe");
    this.clientRepository.save(client);

    // Creando Factura
    Invoice invoice = new Invoice("Compra ayuditas pal wz", 1599.99);
    invoice.setClient(client);
    Invoice invoiceSaved = this.invoiceRepository.save(invoice);

    // Retornando factura
    return new ResponseEntity<>(invoiceSaved, HttpStatus.OK);
  }

  // Many to One
  @PostMapping(path = "/create/invoice")
  public ResponseEntity<Invoice> getClientAndCreateInvoice () {
    Optional<Client> existClient = this.clientRepository.findById("af03e6e5-63dd-469a-a084-5c1306cb17db");
    if (existClient.isPresent()) {
      Client client = existClient.orElseThrow();
      Invoice invoice = new Invoice("Compras de super", 1000);
      invoice.setClient(client);
      Invoice invoiceSaved = this.invoiceRepository.save(invoice);
      return new ResponseEntity<>(invoiceSaved, HttpStatus.CREATED);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  // One to Many
  @PostMapping(path = "/create/client-and-addresses")
  public ResponseEntity<Client> createClientWithAddresses () {
    // Creamos cliente
    Client client = new Client("Ronaldo", "Beckan");

    // Creamos las direcciones donde vive el cliente
    Address addressOne = new Address("Fort Laurderdale", 33166);
    Address addressTwo = new Address("LAX USA", 777);
    List<Address> addresses = new ArrayList<>();
    addresses.add(addressOne);
    addresses.add(addressTwo);
    client.setAddresses(addresses);

    // Guardamos
    this.clientRepository.save(client);

    return new ResponseEntity<>(client, HttpStatus.CREATED);
  }

  @PostMapping(path = "/clients/{client_id}")
  public ResponseEntity<Object> getClient (@PathVariable(required=true, name="client_id") String client_id) {
    Optional<Client> optionalClient = this.clientRepository.findById(client_id);
		optionalClient.ifPresent(client -> {
			Address address1 = new Address("El verjel", 1234);
			Address address2 = new Address("Vasco de Gama", 9875);
			client.getAddresses().add(address1);
      client.getAddresses().add(address2);
			// System.out.println("CLIENT::::::::> " + client);
			this.clientRepository.save(client);
	
		});

    
    return new ResponseEntity<>(optionalClient, HttpStatus.CREATED);
  }

  @DeleteMapping(path = "/client/delete-address")
  public ResponseEntity<Object> deleteClientAddress() {
    Client client = new Client("Jean", "Boby");
    Address addressOne = new Address("El verjel", 1234);
		Address addressTwo = new Address("Vasco de Gama", 9875);
    client.getAddresses().add(addressOne);
    client.getAddresses().add(addressTwo);
    Client saved = this.clientRepository.save(client);

    Optional<Client> optionalClient = this.clientRepository.findById(saved.getId());
    optionalClient.ifPresent(cli -> {
      cli.getAddresses().remove(addressOne);
      this.clientRepository.save(cli);
    });

    return new ResponseEntity<>(optionalClient, HttpStatus.OK);
  }

  // Eliminar las direcciones de un cliente
  @DeleteMapping(path = "/client/delete-all-address")
  public ResponseEntity<Object> deleteClientAddresses() {
    Client client = new Client("Videl", "Boby");
    Address addressOne = new Address("El verjel", 1234);
		Address addressTwo = new Address("Vasco de Gama", 9875);
    client.getAddresses().add(addressOne);
    client.getAddresses().add(addressTwo);
    Client saved = this.clientRepository.save(client);

    Optional<Client> optionalClient = this.clientRepository.findOneById(saved.getId());
    optionalClient.ifPresent(cli -> {
      cli.getAddresses().remove(addressTwo);
      this.clientRepository.save(cli);
    });

    return new ResponseEntity<>(optionalClient, HttpStatus.OK);
  }

  // one to many bidireccional
  @PostMapping(path = "/clients/create-client-and-invoice")
  public ResponseEntity<Object> ontToManyBidireccional () {
    Client client = new Client("Gohan", "Boby");
    
    Invoice invoiceOne = new Invoice("Compras de la casa", 999.99);
    Invoice invoiceTwo = new Invoice("Compras de la oficina", 1599.99);

    List<Invoice> invoices = new ArrayList<>();
    invoices.add(invoiceOne);
    invoices.add(invoiceTwo);
    client.setInvoices(invoices);

    invoiceOne.setClient(client);
    invoiceTwo.setClient(client);

    this.clientRepository.save(client);

    return new ResponseEntity<>(client, HttpStatus.CREATED);
  }
}
