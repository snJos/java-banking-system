package Banking.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        BankAccount account = new BankAccount(name);
        
        while (true) {
            System.out.println("\n--- Bank System Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose one: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Deposit deposit = new Deposit(account);
                    deposit.execute();
                    break;
                case 2:
                    Withdraw withdraw = new Withdraw(account);
                    withdraw.execute();
                    break;
                case 3:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}

