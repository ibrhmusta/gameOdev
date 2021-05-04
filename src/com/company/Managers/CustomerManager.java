package com.company.Managers;

import com.company.Entities.Customer;
import com.company.Interfaces.AuthorizeService;
import com.company.Interfaces.CustomerService;

public class CustomerManager implements CustomerService {
    AuthorizeService authorizeService;

    public CustomerManager(AuthorizeService authorizeService) {
        this.authorizeService = authorizeService;
    }

    @Override
    public void login(Customer customer) {
        if (authorizeService.verify(customer))
        {
            System.out.println("Müşteri Girişi Başarılı!");

        }
        else {
            System.out.println("Kullanıcı girişi başarısız!");
        }
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFullName()+" isimli kullanıcısı güncellemesi yapıldı.");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFullName()+" isimli kullanıcı silindi.");
    }
}
