package com.company.Interfaces;

import com.company.Entities.Customer;

public interface CustomerService {

    void login(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
}
