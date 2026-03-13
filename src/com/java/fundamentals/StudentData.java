package com.java.fundamentals;

import java.util.Scanner;

public class StudentData {


        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);

            System.out.println("Enter Employee Id: ");
            int employeeId= scanner.nextInt();

            System.out.println( "Enter Age");
            byte age =scanner.nextByte();

            System.out.println("Enter Department Code");
            char departmentCode = scanner.next().charAt(0);

            System.out.println("Enter Monthly Salary");
            double monthlySal =scanner.nextDouble();

            System.out.println("Enter years of Experience");
            short exp = scanner.nextShort();

            System.out.println("Enter Mobile Number");
            long number =scanner.nextLong();

            System.out.println("Enter Is Permenant Employee");
            boolean isPermanent = scanner.nextBoolean();

            System.out.println("Enter Is Performance Rating");
            float performance =scanner.nextFloat();

            System.out.println();
            System.out.println("----Enter Student Details---");
            System.out.println(" Employee Id: " +  employeeId);
            System.out.println( "Age" + age);
            System.out.println("Department Code" + departmentCode);
            System.out.println("Monthly Salary" + monthlySal);
            System.out.println("Total years of Experience" + exp);
            System.out.println("Mobile Number" + number);
            System.out.println("Permenant " + isPermanent);
            System.out.println("Performance Rating" + performance);









        }

    }
