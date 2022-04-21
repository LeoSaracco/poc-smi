package ar.com.cdt.springapp.business.services;

import java.util.List;

import ar.com.cdt.business.entities.Product;

public interface ProductManager {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}