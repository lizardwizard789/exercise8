package com.company.jones;

import java.util.Scanner;

public class BusinessContact extends ContactInfo{
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BusinessContact{" + "name='"+this.getName()+ "', email='"+this.getEmail()+ "', phoneNumber='" + phoneNumber + '\'' + '}';
    }
}
