package com.java.fundamentals;

import java.util.Scanner;

public class ProductManagement {


        public static void main(String[] args){

            Scanner scanner =new Scanner(System.in);

            System.out.println("Enter Product Id: ");
            int productId= scanner.nextInt();

            System.out.println( "Enter Category  Code");
            char categoryCode =scanner.next().charAt(0);

            System.out.println("Enter Quantity Available");
            short quantity = scanner.nextShort();

            System.out.println("Enter Unit Price");
            double unitPrice = scanner.nextDouble();

            System.out.println("Enter Discount Percentage");
            float discount = scanner.nextFloat();

            System.out.println("Enter Supplier Contact");
            long number =scanner.nextLong();

            System.out.println("Enter Is Product  Available");
            boolean isAvailable = scanner.nextBoolean();

            System.out.println("Enter Product Rating");
            byte rating =scanner.nextByte();

            System.out.println();
            System.out.println("----Enter Product Details---");
            System.out.println("Product Id: " +  productId);
            System.out.println( "Category  Code" + categoryCode);
            System.out.println("Quantity " + quantity);
            System.out.println("Price" + unitPrice);
            System.out.println("Discount" + discount);
            System.out.println("Suplier Contact" + number);
            System.out.println("Available " + isAvailable);
            System.out.println("Performance Rating" + rating);

        }
    }



