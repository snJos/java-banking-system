import java.util.Scanner;

public class Withdraw {
    private BankAccount account;

    public Withdraw(BankAccount account) {
        this.account = account;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }
}
