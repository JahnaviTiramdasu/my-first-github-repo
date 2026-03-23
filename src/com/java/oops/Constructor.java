package com.java.oops;


public class Constructor {

    int id;
    String name;
    int age;
    String mailId;
    String address;
    String productName;
    double price;

    //no args constructor
    Constructor() {
        this.id = 0;
        this.name = "jahnavi";
        this.age = 10;
        this.address = "Hyderabad";
        this.mailId = "jahnavi@gmail.com";
        this.productName = "lAPTOP";
        this.price = 20000;
    }

    //args constructor
    Constructor(int id, String name, int age, String address, String mailId, String productName, double price) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.mailId = mailId;
        this.productName = productName;
        this.price = price;

    }

}
