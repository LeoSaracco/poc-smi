package ar.com.cdt.business.repositories;

import org.springframework.data.repository.CrudRepository;

import ar.com.cdt.business.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}