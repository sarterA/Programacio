package com.company.Refactoritzacions_3;

public class Invoice {
    public float totalPrice (float price, float vat, float discount){
        float temp = 0;
        temp = (vat * price) / 100;
        System.out.println("Applied vat: " + temp);
        temp = price + temp;
        System.out.println("total with vat: " + temp);
        return temp - discount;

    }
}
