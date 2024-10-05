package com.chernov.crudstore.services;

import com.chernov.crudstore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {




}
