package com.java.oops;

import java.util.List;

public class MethodLogic {

    public static void main(String[] args) {

        Method m = new Method(1, "madhu", "Laptop", true, 45000, 2500.0, 42500);
        Method m2 = new Method(2, "Srinu", "Refrigrator", false, 26000, 2500.0, 24000);
        m.displayProductDetails();
        m2.displayProductDetails();

        m.displayProductByCompanyName("amazon");
        m.displayProductByYear(2022);
        m.displayProductByCompanyNameAndYear("amazon", 2025);


        int totalProductsCount = m.getTotalProductCount();
        System.out.println("No of the Products:" + totalProductsCount);

        Method productByRating = m.getProductByRating();
        System.out.println("Products:" + productByRating);

        List<Method> productList = m.getProductsBasedOnMinAndMaxPrice(100, 1000);



    }
}


