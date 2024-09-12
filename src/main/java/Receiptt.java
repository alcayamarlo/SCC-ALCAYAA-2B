
package main.java;

import java.util.Scanner;

public class Receiptt {
    public static void getReceiptt() {
        Scanner input = new Scanner(System.in);
        String customerName, productName;
        int quantity, price, cash, total, change;

        System.out.println("Customer name:");
        customerName = input.nextLine();

        System.out.println("Product Name:");
        productName = input.nextLine();

        System.out.println("Quantity:");
        quantity = input.nextInt();

        System.out.println("Price:");
        price = input.nextInt();

        System.out.println("Cash:");
        cash = input.nextInt();

        total = quantity * price;
        change = cash - total;

        Receipt rcpt = new Receipt();
        rcpt.getReceipt(customerName, productName, quantity, price, cash); 
        rcpt.viewReceipt();

        input.close(); 
    }
}
