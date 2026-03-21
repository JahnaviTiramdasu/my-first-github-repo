package com.java.fundamentals;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("----Enter Student marks----");

        System.out.print("Enter Telugu Marks:");
        int tel = sc.nextInt();

        System.out.print("Enter Hindi Marks:");
        int hindi = sc.nextInt();

        System.out.print("Enter English Marks:");
        int english = sc.nextInt();

        System.out.print("Enter Maths Marks:");
        int maths = sc.nextInt();

        System.out.print("Enter Science Marks:");
        int science = sc.nextInt();

        System.out.print("Enter Social Marks:");
        int social = sc.nextInt();

        int total = tel + hindi + english + maths+ science+ social;
        double percentage = (total/600.0)*100;
        double averageMarks= total/6.0;

        System.out.println("Telugu:"+ tel);
        System.out.println("Hindi:" + hindi);
        System.out.println("English:" + english);
        System.out.println("Maths:" + maths);
        System.out.println("Science:" + science);
        System.out.println("Social:" + social);

        System.out.println("Total Marks of the Student:" + total);
        System.out.println("Average Marks of the Student:" + averageMarks);
        System.out.println("Percentage :" + percentage);

    }
}


    class Purchase{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("----Purchase Details----");

        System.out.print("Enter price of the product:");
        double cost = sc.nextDouble();
        double discountAmount = cost * 0.10;
        double priceAfterDiscount =  cost - discountAmount;

        double cgstAmount =priceAfterDiscount *0.025;
        double sgstAmount=priceAfterDiscount* 0.030;
        double totalTax = cgstAmount +sgstAmount;
        double finalPrice =  priceAfterDiscount+ totalTax;

        System.out.println("---Purchase Details---" );
        System.out.println("Price After Discount: " + cost);
        System.out.println("Discount Amount: " + priceAfterDiscount);
        System.out.println("Tax CGST(2.5%): " +cgstAmount);
        System.out.println("Tax SGST(3.0%): " + sgstAmount);
        System.out.println("Final price:" + finalPrice);
    }
    }

    //Product Price:1000
//Discount Percentage:10
//Quantity:2

class ProductPurchase{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("----Purchase Details----");

        System.out.print("Enter price of the product:");
        double cost = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discountAmount = sc.nextDouble();
        discountAmount= (cost * discountAmount)/100.0;

        double priceAfterDiscount =  cost - discountAmount;

        System.out.print("Enter Quantity: ");
        int quanity = sc.nextInt();

        double cgstAmount =(priceAfterDiscount *0.025)*quanity;
        double sgstAmount=(priceAfterDiscount* 0.030)*quanity;
        double totalTax = cgstAmount +sgstAmount;
        double finalPrice =  (priceAfterDiscount)*quanity+ totalTax;

        System.out.println("---Purchase Details---" );
        System.out.println("Total Cost of the products: " + cost*quanity );
        System.out.println("Total Discount Amount: " + discountAmount*quanity);
        System.out.println("Price After Discount: " + priceAfterDiscount*quanity);

        System.out.println("Tax CGST(2.5%): " +cgstAmount);
        System.out.println("Tax SGST(3.0%): " + sgstAmount);
        System.out.println("Final price:" + finalPrice);
    }
}