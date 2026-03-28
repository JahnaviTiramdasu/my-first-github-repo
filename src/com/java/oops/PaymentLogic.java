package com.java.oops;

public class PaymentLogic {
    public static void main(String[] args) {
        Payment payment1 = new Payment(1, 2000, 2000, PaymentType.UPI, OrderStatus.PLACED, false);
        Payment payment2 = new Payment(1, 2000, 0, PaymentType.UPI, OrderStatus.PLACED, true);

        //assignment 11
        Payment payment = new Payment();
        payment1.initiatePayment(2000,PaymentType.UPI);

        //assignment 12
        payment.totalOrderAmount=6000;
       boolean isValid= payment.validatePayement(5000);
       System.out.println("AMount valid:"+ isValid);


       //assignment 13
       boolean paymentProcess = payment.processPayment(PaymentType.UPI);

       //assignment 14
        boolean refund =payment1.refundPayment();

        //assignment 15
        boolean paymentStatus = payment2.verifyPaymentStatus(2);
    }
}