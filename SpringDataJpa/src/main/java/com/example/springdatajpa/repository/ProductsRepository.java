package com.example.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springdatajpa.data.entity.Products;

public interface ProductsRepository extends CrudRepository<Products, Long> {

}
