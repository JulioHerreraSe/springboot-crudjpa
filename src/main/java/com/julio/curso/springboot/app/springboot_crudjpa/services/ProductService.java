package com.julio.curso.springboot.app.springboot_crudjpa.services;

import java.util.List;
import java.util.Optional;

import com.julio.curso.springboot.app.springboot_crudjpa.models.Product;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    Optional<Product> delete(Product product);

}
