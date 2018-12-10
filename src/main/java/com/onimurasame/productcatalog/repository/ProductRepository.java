package com.onimurasame.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import com.onimurasame.productcatalog.data.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
