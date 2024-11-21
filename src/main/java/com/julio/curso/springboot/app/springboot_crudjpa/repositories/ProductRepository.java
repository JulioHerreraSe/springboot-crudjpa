package com.julio.curso.springboot.app.springboot_crudjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.julio.curso.springboot.app.springboot_crudjpa.models.Product;

public interface ProductRepository extends CrudRepository<Product ,Long>{
    boolean existsBySku(String sku);
}
