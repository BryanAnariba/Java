package com.di.facturas.di_facturas.controllers;

import com.di.facturas.di_facturas.models.Client;
import com.di.facturas.di_facturas.models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/invoices")
public class InvoiceController {
  
  @Autowired()
  private Invoice invoice;
  
  // http://localhost:3500/api/invoices/details
  @GetMapping("/details")
  public Invoice getInvoiceDetails () {
    Invoice invoiceOne = new Invoice();
    Client client = new Client();
    client.setClientFirstName(invoice.getClient().getClientFirstName());
    client.setClientLastName(invoice.getClient().getClientLastName());
    invoiceOne.setClient(client);
    invoiceOne.setInvoiceDescription(invoice.getInvoiceDescription());
    invoiceOne.setItems(invoice.getItems());
    return invoiceOne;
  }
}
