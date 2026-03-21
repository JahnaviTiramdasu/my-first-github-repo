package com.java.fundamentals;

import java.util.Scanner;

public class MembershipAssignment {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Your Name:");
        String name =sc.nextLine();
        System.out.print("Enter Age:");
        int age = sc.nextInt();
        System.out.print("Enter Mobile Number:");
        int num = sc.nextInt();
        System.out.print("Enter Product Cost:");
        double cost = sc.nextDouble();
        System.out.print("Enter Mail Id: ");
        String mail =sc.nextLine();
        System.out.println("select memberShip:");
        System.out.println("1. Diamond");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
        int choice = sc.nextInt();
     //  sc.nextLine();
         switch (choice){
             case 1:System.out.println("You have selected Diamond Membership");
             break;
             case 2:System.out.println("You have selected Gold Membership");
                 break;
             case 3:System.out.println("You have selected Silver Membership");
                 break;
             default:System.out.println("You don't have any valid MemberShip");
         }
            double discount;
            if(age > 50 && (choice ==3)){
                discount = 40;
            } else if (age > 50 &&(choice==2)) {
                discount =50;
            }else if (age > 50 && (choice ==1)){
                discount=60;
            }else {
                discount=10;
            }

      double discountAmount = (cost*discount)/100.0;

       double priceAferDiscount = cost - discountAmount;
      double  cgst = priceAferDiscount *0.025;
      double sgst = priceAferDiscount*(2.5/100);
      double totalTax = cgst+ sgst;
      double finalPrice = totalTax+ priceAferDiscount;

      System.out.println("---Prodoct details--");
      System.out.println("Customer Name: " + name);
      System.out.println("Age:" + age);
      System.out.println("Membership type: " + choice);
      System.out.println("Cost of the Product: " + cost);
      System.out .println("Price After Discount: " + priceAferDiscount);
      System.out.println("Discount Amount:" + discountAmount);
      System.out.println("CGST Tax Amount:" + cgst);
      System.out.println("SGST Amount:" + sgst);
      System.out.println("Final cost of the product:" + finalPrice);

    }
}
