package com.java.fundamentals;

    public class HelloWorld {
        public static void main(String[] args) {

            int age,currentYear;
            age=20;
            currentYear=2026;

        System.out.println("My Age:" +  age);
        System.out.println("Current year: "+ currentYear);
        System.out.println("My Age:" +  age + "Current year: "+ currentYear);
    }

}
    class MyFirstJavaClass{
        public static void main(String[] args) {
        System.out.println("practise");
    }

}

    class Conversion{
         public static void main(String[] args){

                 short x =6;
                 int k=x;
          System.out.println(k);//implicit

                  float j=23.6F;
                  long o=(long) j;
          System.out.println(o);//explicit

                   byte h = 89;
                   byte h2 =90;
                   // byte res = (byte) (h + h2);        //byte data type is an 8-bit signed integer with a range from -128 to 127. When arithmetic operations exceed this range, Java performs overflow, causing unexpected results if ywe are not aware.
                   int res =h+h2;
          System.out.println(res);

                   int g1 = 98;
                   int g2 =90;
                   int res1 = g1+g2;
           System.out.println(res1);
    }
}

     class DataTypes {
         public static void main(String[] args) {
             char i = 'j';
             char k = 'k';
             char j = 99; // assigning ascii code so even not in single quote no errors. and result will cme the value of that ascii code not the value that we assigned.


             System.out.println(j);
         }
     }

     class Operaters{
          public static void main(String[] args){

              int a=80;
              int b= 55;

              System.out.println(a+b);
              System.out.println(a-b);
              System.out.println(--a);
              System.out.println(++a); // answer comes 80 only as in --a it

              int a1 = 5;
              int b1 = a1++;  // a is assigned to b first, then incremented

              System.out.println("a1 = " + a1); // Outputs: 6
              System.out.println("b1 = " + b1); // Outputs: 5


        }



     }





