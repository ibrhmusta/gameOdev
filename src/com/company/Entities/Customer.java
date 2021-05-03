package com.company.Entities;

import com.company.Interfaces.EntityBase;

public class Customer implements EntityBase {

    private int id;
    private String fullName;
    private String nationalIdentity;
    private String birthdayDate;

    public Customer(){

    }
    public Customer(int id, String fullName, String nationalIdentity, String birthdayDate) {
        this.id = id;
        this.fullName = fullName;
        this.nationalIdentity = nationalIdentity;
        this.birthdayDate = birthdayDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }
}
