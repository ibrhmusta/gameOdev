package com.company.Entities;

import com.company.Interfaces.EntityBase;

public class Sale implements EntityBase {

    private int id;
    private String creditCardNo;

    public Sale(){

    }
    public Sale(int id, String creditCardNo) {
        super();
        this.id = id;
        this.creditCardNo = creditCardNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
}
