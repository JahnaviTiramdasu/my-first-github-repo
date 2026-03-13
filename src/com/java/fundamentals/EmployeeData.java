package com.java.fundamentals;
import java.util.Scanner;


public class EmployeeData {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Employee ID: ");
            int employeeId = sc.nextInt();

            System.out.print("Enter Age: ");
            byte age = sc.nextByte();

            System.out.print("Enter Department Code: ");
            char departmentCode = sc.next().charAt(0);

            System.out.print("Enter Monthly Salary: ");
            double monthlySalary = sc.nextDouble();

            System.out.print("Enter years of Experience: ");
            short exp = sc.nextShort();

            System.out.print("Enter Mobile Number: ");
            long mNum = sc.nextLong();

            System.out.print("Is Permanent Employee(true/false): ");
            boolean isPermanentEmployee = sc.nextBoolean();

            System.out.print("Enter Performance Rating: ");
            float rating = sc.nextFloat();

           //output Section
            System.out.println();
            System.out.println("---Employee Details---");
            System.out.println("Employee ID:" + employeeId);
            System.out.println("Age: " + age);
            System.out.println("Department Code:" + departmentCode);
            System.out.println("Monthly Salary:" + monthlySalary);
            System.out.println("Experience:" + exp);
            System.out.println("Mobile Number:" + mNum);
            System.out.println("Is Permanent Employee:" + isPermanentEmployee);
            System.out.println("Performance Rating: " + rating);

        }
}
         class StudentDataManagement{

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

        class ProductManagement{

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



