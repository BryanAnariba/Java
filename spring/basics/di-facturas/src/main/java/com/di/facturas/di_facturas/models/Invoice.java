package com.di.facturas.di_facturas.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component()
@RequestScope() // Contexto del request, ya que por defecto Invoice Se comparte en todos los usuarios
@JsonIgnoreProperties({"targetSource", "advisors"})
public class Invoice {
  
  @Autowired()
  private Client client;
  
  @Value("${invoice.invoiceDescription}")
  private String invoiceDescription;
  
  @Autowired() // Este llama el listado de AppConfig el listado de productos
  @Qualifier("invoiceItemsOffice")
  private List<Item> items;
  
  @PostConstruct()
  public void init () {
    System.out.println("Creando el componente de la invoice init");
    this.invoiceDescription = "Invoice of the client: " + this.client.getClientFirstName().trim().toUpperCase() + " " + this.client.getClientLastName().trim().toUpperCase();
  }
  
  @PreDestroy()
  public void destroy () {
    System.out.println("Destruyendo el componente invoice");
  }
  
  public Invoice () {
    System.out.println("Creando el componente de la invoice constructor");
    System.out.println("Client Value aqui todavia es null, pero en el init no es null: " + client);
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public String getInvoiceDescription() {
    return invoiceDescription;
  }

  public void setInvoiceDescription(String invoiceDescription) {
    this.invoiceDescription = invoiceDescription;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }
  
  public double getTotalItems () {
    double total = 0f;
//    for (Item item: this.items) {
//      total += item.getTotalItemImport();
//    }
//    return total;
    total = this.items
      .stream()
      .mapToDouble(item -> item.getTotalItemImport())
      .reduce(0, (sum, totalItem) -> sum + totalItem);
    
    return total;
  }
  
}
