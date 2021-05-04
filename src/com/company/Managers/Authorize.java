package com.company.Managers;

import com.company.Entities.Customer;
import com.company.Interfaces.AuthorizeService;

public class Authorize implements AuthorizeService {

    private String nationalIdentity=("12345678910");
    private String fullName=("İbrahim Usta");
    private String birthdayDate=("05.05.1999");

    @Override
    public boolean verify(Customer customer) {
        if((this.nationalIdentity.equals(customer.getNationalIdentity()))&&(this.fullName.equals(customer.getFullName()))&&(this.birthdayDate.equals(customer.getBirthdayDate()))) {
            return true;
        }
        else {
            return false;
        }
    }
}
