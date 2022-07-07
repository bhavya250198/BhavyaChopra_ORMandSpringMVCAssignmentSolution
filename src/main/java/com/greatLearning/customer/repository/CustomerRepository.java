package com.greatLearning.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
