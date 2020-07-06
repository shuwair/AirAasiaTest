package com.airaisa.service;

import com.airaisa.entity.Order;
import com.airaisa.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository repository;

    public Order create(Order order) {

        return repository.save(order);

    }
}
