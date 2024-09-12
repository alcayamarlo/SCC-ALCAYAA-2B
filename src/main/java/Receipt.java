package main.java;

import java.util.Scanner;

public class Receipt {
  String customerName;
  String productName;
  int quantity;
  int price;
  int cash;
  int total;
  int change;

 
 public void getReceipt(String customerName, String productName, int quantity, int price, int cash) {
       this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.cash = cash;
        this.total = quantity * price;
        this.change = cash - total;
    }

    public void viewReceipt() {
        System.out.println("\n--- Receipt ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
        System.out.println("Cash Given: " + cash);
        System.out.println("Change: " + change);
        System.out.println("---------------\n");
    }
}
