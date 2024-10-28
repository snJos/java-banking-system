package banking.com; // Renamed to follow naming conventions
import java.util.Scanner;

public class Deposit {
    private BankAccount account;

    public Deposit(BankAccount account) {
        this.account = account;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter amount to deposit: ");
            double depositAmount = scanner.nextDouble();

            if (depositAmount > 0) {
                account.deposit(depositAmount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numerical value.");
            scanner.next(); // Clear invalid input
        }
    }
}

