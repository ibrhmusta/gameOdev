package com.company.Interfaces;

import com.company.Entities.Customer;

public interface AuthorizeService {

    boolean verify(Customer customer);
}
