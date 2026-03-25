package com.java.oops;

public class ConstuctorLogic {

    public static void main(String[] args) {

        //no args constructor
        Constructor con = new Constructor();
        System.out.println("id:" + con.id);
        System.out.println("name:" + con.name);
        System.out.println("Age:" + con.mailId);
        System.out.println("Address:" + con.address);
        System.out.println("MailID:" + con.mailId);
        System.out.println("ProductName:" + con.productName);
        System.out.println("Price:" + con.finalprice);

        System.out.println("--Customer Details--");
         //args constructer
        Constructor customer1 = new Constructor(1,"Jahnavi",34,"Hyderabad","jahnavi@gmail.com","laptop",30000);
        Constructor customer2 = new Constructor(2,"vynavi",24,"Waranal","vynavi@gmail.com", "Mobile",20000);
        Constructor customer3 = new Constructor(3,"shyamu",29,"Guntur","shyamu@gmail.com","Tab", 15000);
        Constructor customer4 = new Constructor(4,"Sreeja",14,"Nalgonda","sreeja@gmail.com","Sunsreen",1000);
        Constructor customer5 = new Constructor(5,"Kala",39,"Vijayawada","kala@gmail.com", "Conditioner", 1500);

        printCustomer(customer1);
        printCustomer(customer2);
        printCustomer(customer3);
        printCustomer(customer4);
        printCustomer(customer5);
    }

    public static void printCustomer(Constructor con){
        System.out.println("id:" + con.id);
        System.out.println("name:" + con.name);
        System.out.println("Age:" + con.mailId);
        System.out.println("Address:" + con.address);
        System.out.println("MailID:" + con.mailId);
        System.out.println("ProductName:" + con.productName);
        System.out.println("Price:" + con.finalprice);


    }

}
