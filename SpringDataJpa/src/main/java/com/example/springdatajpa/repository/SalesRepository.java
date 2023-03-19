package com.example.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springdatajpa.data.entity.Sales;

public interface SalesRepository extends CrudRepository<Sales, Long> {

}
