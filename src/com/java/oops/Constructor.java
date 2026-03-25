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

}