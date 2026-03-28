package com.java.oops;

public class Payment {

    int id;
    double totalOrderAmount;
    double paidAmount;
    PaymentType paymentType;
    OrderStatus orderStatus;
    boolean isPaid;

    public Payment(int id, double totalOrderAmount, double paidAmount, PaymentType paymentType, OrderStatus orderStatus, boolean isPaid) {
        this.id = id;
        this.totalOrderAmount = totalOrderAmount;
        this.paidAmount = paidAmount;
        this.paymentType = paymentType;
        this.orderStatus = orderStatus;
        this.isPaid = isPaid;
    }

    public Payment() {
    }

    //assignment 11
    boolean initiatePayment(double totalOrderAmount, PaymentType paymentType) {
        if (this.isPaid) {
            System.out.println("payment Alrady Completed.");
            return false;
        } else if (paidAmount != totalOrderAmount) {
            System.out.println("Please pay correct amount");
            return false;
        } else {
            this.paidAmount = paidAmount;
            this.paymentType = paymentType;
            this.isPaid = true;
            System.out.println("Payment successful using:" + paymentType);
            return true;
        }

    }

    //assignment 12
    boolean validatePayement(double paidAmount) {
        if (paidAmount == totalOrderAmount) {
            return true;
        }
        return false;
    }

    //assignment 13
    boolean processPayment(PaymentType paymentType) {
        if (paymentType == PaymentType.UPI || paymentType == PaymentType.CARD || paymentType == PaymentType.NET_BANKING) {
            this.paymentType = paymentType;
            System.out.println("Payment processesd using:" + paymentType);
            return true;

        } else {
            System.out.println("Incorect PaymentType");
            return false;
        }

    }

    //assignment 14
    boolean refundPayment() {
        if (orderStatus == OrderStatus.CANCELLED && isPaid) {
            isPaid = false;
            System.out.println("Refund Done.");
            return true;
        } else {
            System.out.println("Refund Not possible.");
            return false;
        }
    }

    //assignment 15
    boolean verifyPaymentStatus(int id) {
        if (!isPaid) {
            System.out.println("Payment haven't Initiated");
            return true;
        } else if (paymentType == PaymentType.UPI || paymentType == PaymentType.CARD || paymentType == PaymentType.NET_BANKING) {
            System.out.println("Payment Status:" + paymentType);
            return true;
        } else {
            return false;
        }

    }

}





