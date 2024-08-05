package com.di.facturas.di_facturas.models;

// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component()
@RequestScope()
// @JsonIgnoreProperties({"targetSource", "advisors"})
public class Client {
  
  @Value("${client.clientFirstName}")
  private String clientFirstName;
  
  @Value("${client.clientLastName}")
  private String clientLastName;

  public String getClientFirstName() {
    return clientFirstName;
  }

  public void setClientFirstName(String clientFirstName) {
    this.clientFirstName = clientFirstName;
  }

  public String getClientLastName() {
    return clientLastName;
  }

  public void setClientLastName(String clientLastName) {
    this.clientLastName = clientLastName;
  }
  
}
