package com.crud.crud.Repository;


import com.crud.crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Product, Integer> {
}
