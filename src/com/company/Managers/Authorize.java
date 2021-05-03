package com.company.Managers;

import com.company.Interfaces.AuthorizeService;

public class Authorize implements AuthorizeService {

    private String nationalIdentity=("12345678910");
    private String fullName=("İbrahim Usta");
    private String birthdayDate=("05.05.1999");

    @Override
    public boolean verify(String nationalIdentity, String fullName, String birthdayDate) {
        if((this.nationalIdentity.equals(nationalIdentity))&&(this.fullName.equals(fullName))&&(this.birthdayDate.equals(birthdayDate))) {
            return true;
        }
        else {
            return false;
        }
    }
}
