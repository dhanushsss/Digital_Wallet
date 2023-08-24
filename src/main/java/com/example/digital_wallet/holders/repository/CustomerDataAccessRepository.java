package com.example.digital_wallet.holders.repository;

import com.example.digital_wallet.holders.dao.CustomerDao;
import com.example.digital_wallet.holders.model.Customer;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessRepository implements CustomerDao {

    private final CustomerRepository customerRepository;


    public CustomerDataAccessRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public void getCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public boolean existsPersonWithEmail(String email) {
        return customerRepository.existsCustomerByEmail(email);
    }

    @Override
    public boolean existsPersonWithId(Integer customerId) {
        return customerRepository.existsPersonWithId(customerId);
    }

    @Override
    public void deleteCustomerById(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void customerUpdate(Customer customer) {
        customerRepository.save(customer);
    }
}