package com.cg.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
 
import com.cg.Entity.Customer;
 
public interface CustomerRepository extends JpaRepository<Customer,Long>{
 
}

