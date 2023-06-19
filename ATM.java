import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATM {
    private static Map<Integer, Account> accounts;
    public static void main(String[] args) {
        accounts = new HashMap<>();
        accounts.put(1, new Account(1, "Alice", 5000.00, "1234"));
        accounts.put(2, new Account(2, "Bob", 2500.00, "5678"));
        accounts.put(3, new Account(3, "Charlie", 1000.00, "9012"));
        accounts.put(4, new Account(4, "Dave", 750.00, "3456"));
        accounts.put(5, new Account(5, "Eve", 10000.00, "7890"));

        Scanner scanner = new Scanner(System.in);

        int account_no;
        String password;

        do {
            System.out.print("Enter account number: ");
            account_no = scanner.nextInt();
            System.out.print("Enter password: ");
            password = scanner.next();
        } while (!login(account_no, password));

        Account account = accounts.get(account_no);

        char choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("a. Balance");
            System.out.println("b. Withdraw");
            System.out.println("c. Deposit");
            System.out.println("d. Transfer");
            System.out.println("e. Exit");

            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 'b':
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 'c':
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 'd':
                    System.out.print("Enter recipient account number: ");
                    int recipientAccountNo = scanner.nextInt();
                    Account recipient = accounts.get(recipientAccountNo);
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    account.transfer(recipient, transferAmount);
                    break;
                case 'e':
                    System.out.println("Thank you for using our bank account");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'e');

        scanner.close();
    }

    private static boolean login(int account_no, String password) {
        Account account = accounts.get(account_no);

        if (account == null || !account.verifyPassword(password)) {
            System.out.println("Login failed. Please try again.");
            return false;
        }

        return true;
    }
}