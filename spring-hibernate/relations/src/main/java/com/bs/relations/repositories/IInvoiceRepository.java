package com.bs.relations.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bs.relations.entities.Invoice;

public interface IInvoiceRepository extends  CrudRepository<Invoice, String>{

}
