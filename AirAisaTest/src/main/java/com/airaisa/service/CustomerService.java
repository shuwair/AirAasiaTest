package com.airaisa.service;

import com.airaisa.entity.Customer;
import com.airaisa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository repository;

    public Customer save(Customer customer) {
        return repository.save(customer);

    }
}
