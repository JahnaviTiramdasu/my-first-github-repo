package com.java.oops;

public class Order {

    int id;
    String customerName;
    String productName;
    boolean isavailable;
    double totalAmount;
    double discountAmount;
    double finalPrice;
    OrderStatus status;

    // no Args constructor

    Order(){
        this.id=1;
        this.customerName ="Venky";
        this.productName="laptop";
        this.isavailable=true;
        this.totalAmount=25000;
        this.discountAmount=1000;
        this.finalPrice=2300.0;
        this.status = OrderStatus.PLACED;



    }

    public Order(int id, String customerName, String productName, boolean isavailable, double totalAmount, double discountAmount, double finalPrice,OrderStatus status ) {
        this.id=id;
        this.customerName=customerName;
        this.productName=productName;
        this.isavailable=isavailable;
        this.totalAmount=totalAmount;
        this.discountAmount=discountAmount;
        this.finalPrice=finalPrice;
        this.status=status;

    }
    //assignment 6
    double calculateFinalAmount(){
        finalPrice= totalAmount-discountAmount;
        return  finalPrice;
    }

    //Assignment 7
    //assignment 7
    void updateOrerStatus(OrderStatus status){
        System.out.println("Updated Status:" + this.status);
    }

    //assignment 8
    boolean isPaid() {
        return this.finalPrice > 0;
    }
    //assignment 9
    void cancelOrder(){
        if(this.status != OrderStatus.DELIVERED){
            this.status=OrderStatus.CANCELLED;
            System.out.println("order cancelled successfully");
        }else{
            System.out.println("Order cannot cancel as its already delivered");
        }
    }

    }



