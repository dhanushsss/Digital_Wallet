package com.example.digital_wallet.holders.repository;

import com.example.digital_wallet.holders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    boolean existsCustomerByEmail(String email);
    boolean existsPersonWithId(Integer customerId);
}
