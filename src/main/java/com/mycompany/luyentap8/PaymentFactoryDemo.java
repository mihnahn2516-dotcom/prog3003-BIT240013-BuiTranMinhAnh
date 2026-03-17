
package com.mycompany.luyentap8;
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Credit Card: " + amount);
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng PayPal: " + amount);
    }
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Tiền mặt: " + amount);
    }
}

class PaymentFactory {
    public static Payment getPayment(String type) {
        switch (type.toLowerCase()) {
            case "creditcard": return new CreditCardPayment();
            case "paypal": return new PayPalPayment();
            case "cash": return new CashPayment();
            default: throw new IllegalArgumentException("Invalid payment type");
        }
    }
}

public class PaymentFactoryDemo {
    public static void main(String[] args) {
        Payment p1 = PaymentFactory.getPayment("creditcard");
        p1.pay(1000);

        Payment p2 = PaymentFactory.getPayment("paypal");
        p2.pay(500);

        Payment p3 = PaymentFactory.getPayment("cash");
        p3.pay(200);
    }
}

