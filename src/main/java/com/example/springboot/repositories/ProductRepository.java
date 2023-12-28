package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// JPA informs what Model is implemented for the repository
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
