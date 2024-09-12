package main.java;

import java.util.Scanner;

public class MainJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary sl = new Salary();
        Account ac = new Account();
        Receipt rc = new Receipt();
        
        String transaction;
        
        System.out.println("Product CRUD System\n");
        
        do {
            System.out.println("1. Salary");
            System.out.println("2. Account");  
            System.out.println("3. Receipt");
            System.out.println("Enter selection: ");
            
            int select = sc.nextInt();

            switch(select) {
                case 1:
                    sl.getSalary();
                    break;
                case 2: 
                    ac.getAccounts();
                    break;
                case 3:
                    rc.getReceipt();
                    break;
                default: 
                    System.out.println("Invalid choice.");
            }
            System.out.print("Make another transaction? (y/n): ");
            transaction = sc.next();
        } while(transaction.equalsIgnoreCase("y")); 
        
        sc.close();
    }
}
