package com.example.digital_wallet.holders.service;

import com.example.digital_wallet.holders.dao.CustomerDao;
import com.example.digital_wallet.holders.exception.DuplicateResourceException;
import com.example.digital_wallet.holders.exception.RequestValidation;
import com.example.digital_wallet.holders.exception.ResourceNotFoundException;
import com.example.digital_wallet.holders.model.Customer;
import com.example.digital_wallet.holders.registration.CustomerRegistration;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerDao customerDao ;


    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers(){
        return customerDao.selectAllCustomer();
    }

    public Customer getCustomer(Integer id){
        return customerDao.selectCustomerById(id)
                .orElseThrow(
                        ()->
                                new ResourceNotFoundException("Customer with ID [%s] is not found"
                                        .formatted(id))
                );
    }

    public void addCustomer(CustomerRegistration customerRegistration){
        String email = customerRegistration.customerEmail();
        if(customerDao.existsPersonWithEmail(email)){
            throw new DuplicateResourceException("Email Already Taken");
        }

        Customer customer = new Customer(
                customerRegistration.customerName() ,
                customerRegistration.customerEmail(),
                customerRegistration.customerAddress(),
                customerRegistration.customerPhoneNumber(),
                customerRegistration.customerPassword(),
                customerRegistration.customerUserName(),
                customerRegistration.customerCardNo());

        customerDao.getCustomer(customer);
    }

    public void deleteCustomerById(Integer customerId ){

        if(!customerDao.existsPersonWithId(customerId)){
            throw new ResourceNotFoundException("Customer id [%s] is not found".formatted(customerId));
        }
        customerDao.deleteCustomerById(customerId);
    }

    public void updateCustomerDetails(Integer customerId , CustomerRegistration customerRegistration){

        Customer customer =  getCustomer(customerId);

        boolean changes = false ;

        if(customerRegistration.customerName() != null && !customerRegistration.customerName().equals(customer.getCustomerName())){
            customer.setCustomerName(customerRegistration.customerName());
            changes = true;
        }
        if (customerRegistration.customerEmail() != null && !customerRegistration.customerEmail().equals(customer.getCustomerEmail())){

            if(customerDao.existsPersonWithEmail(customerRegistration.customerEmail())){
                throw new DuplicateResourceException("email is already taken");
            }
            customer.setCustomerEmail(customerRegistration.customerEmail());
            changes = true;
            if (!changes){
                throw new RequestValidation("no data has been changed");
            }
        }
        if (customerRegistration.customerPassword() != null && !customerRegistration.customerPassword().equals(customer.getCustomerPassword())){
            customer.setCustomerPassword(customerRegistration.customerPassword());
            changes = true;
        }
        customerDao.customerUpdate(customer);
    }

}
