package com.dscatalog.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dscatalog.backend.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {

}
