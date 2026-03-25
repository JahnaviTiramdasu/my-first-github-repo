package com.java.oops;

public class OrderLogic {

    public static void main(String[] args) {

        //no args
        Order order = new Order();
        System.out.println("id:" + order.id);
        System.out.println("CustomerName:" + order.customerName);
        System.out.println("ProductNAme: " + order.productName);
        System.out.println("OrderDate: " + order.isavailable);
        System.out.println("Total amount:" + order.totalAmount);
        System.out.println("Tax :" + order.discountAmount);
        System.out.println("Final Price: " + order.finalPrice);


        //args constructor
        Order order1 = new Order(1, "lakshmi", "Book", false, 300.0, 25.0, 275);
        Order order2 = new Order(2, "Sindhu", "WaterPurifier", true, 10000.0, 2000.0, 8000.0);
        Order order3 = new Order(3, "Meghana", "Air conditioner", true, 450000.0, 5000, 40000);
        Order order4 = new Order(4, "Lahari", "Shampoo", false, 600.0, 50, 550);
        Order order5 = new Order(5, "Krishna", "HAir Dryer", true, 6000.0, 500, 5500);


        print(order1);
        print(order2);
        print(order3);
        print(order4);
        print(order5);



    }

    public static void print(Order o) {
        System.out.println("id:" + o.id);
        System.out.println("CustomerName:" + o.customerName);
        System.out.println("ProductNAme: " + o.productName);
        System.out.println("OrderDate: " + o.isavailable);
        System.out.println("Total amount:" + o.totalAmount);
        System.out.println("Tax :" + o.discountAmount);
        System.out.println("Final Price: " + o.finalPrice);

    }




}
