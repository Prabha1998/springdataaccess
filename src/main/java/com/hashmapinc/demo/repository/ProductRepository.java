package com.hashmapinc.demo.repository;

import com.hashmapinc.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
