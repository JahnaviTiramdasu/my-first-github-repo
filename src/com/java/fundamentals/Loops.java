package com.java.fundamentals;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int num = sc.nextInt();

        int n =1;
       while(num >=n){
           if (num %2 ==0){
               System.out.println(num);}
               else {
                   System.out.println("wrong");
               }
               num++;
           }


       }



        }

