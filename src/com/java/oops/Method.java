package com.java.oops;

import java.util.List;

public class Method {

    int id;
    String customerName;
    String productName;
    boolean isavailable;
    double totalAmount;
    double discountAmount;
    double finalPrice;

    // no Args constructor

    Method() {
        this.id = 1;
        this.customerName = "Venky";
        this.productName = "laptop";
        this.isavailable = true;
        this.totalAmount = 25000;
        this.discountAmount = 1000;
        this.finalPrice = 2300.0;


    }

    public Method(int id, String customerName, String productName, boolean isavailable, double totalAmount, double discountAmount, double finalPrice) {
        this.id = id;
        this.customerName = customerName;
        this.productName = productName;
        this.isavailable = isavailable;
        this.totalAmount = totalAmount;
        this.discountAmount = discountAmount;
        this.finalPrice = finalPrice;

    }

    //Method Declaration
    void displayProductDetails() {
        System.out.println("Id:" + id);
        System.out.println("CustomerName:" + customerName);
        System.out.println("Product Name:" + productName);
        System.out.println("IS product Available:" + isavailable);
        System.out.println("Max Retail Price:" + totalAmount);
        System.out.println("Discount Amount:" + discountAmount);
        System.out.println("Final Price:" + finalPrice);


    }

    void displayProductByCompanyName(String companyName) {
        System.out.println("Company Name:" + companyName);
    }

    void displayProductByYear(int year) {
        System.out.println("Year:" + year);
    }

    void displayProductByCompanyNameAndYear(String companyName, int year) {
        System.out.println("Name of the Company:" + companyName);
        System.out.println("Manufacturing Year:" + year);

    }

    int getTotalProductCount() {
        return 5;

    }

    Method getProductByRating() {
        return new Method();
    }

    //return a list of products
    List<Method> getProductsBasedOnRating() {
        return null;
    }

    //return Based on min and maxPrice
    List<Method> getProductsBasedOnMinAndMaxPrice(int minPrice, int maxPrice) {
        return null;
    }
}

