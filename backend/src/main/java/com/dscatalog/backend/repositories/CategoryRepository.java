package com.dscatalog.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dscatalog.backend.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {

}
