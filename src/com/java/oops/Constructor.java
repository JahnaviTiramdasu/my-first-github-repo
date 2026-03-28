package com.java.oops;


public class Constructor {

    int id;
    String name;
    int age;
    String mailId;
    String address;
    double maxRetailPrice;
    String productName;
    double finalprice;
    int number;

    //no args constructor
    Constructor() {
        this.id = 0;
        this.name = "jahnavi";
        this.age = 10;
        this.address = "Hyderabad";
        this.mailId = "jahnavi@gmail.com";
        this.productName = "lAPTOP";
        this.finalprice = 20000;

    }

    //args constructor
    Constructor(int id, String name, int age, String address, String mailId, String productName, double finalprice) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.mailId = mailId;
        this.productName = productName;
        this.finalprice = finalprice;

    }

    //Assignment 2
    void updateAddress(int id) {
        System.out.println("Update address:" + address);
    }

    //Assignment 3
    boolean verifyCustomerStatus(int id) {
        return true;
    }

    //Assignment 4
    void deactiveAccount(String name) {
        System.out.println(name + "  Account has been deActivated");
    }

    //assignment 5
    boolean verifyCustomerMobileNumber(int id) {
        return false;
    }
}
