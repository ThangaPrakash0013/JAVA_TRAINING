import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int choice;

        do {
            System.out.println("\n1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(balance);
                    break;
                case 2:
                    balance = deposit(scanner, balance);
                    break;
                case 3:
                    balance = withdraw(scanner, balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);

        scanner.close();
    }

    static void checkBalance(int balance) {
        System.out.println("Balance: $" + balance);
    }

    static int deposit(Scanner scanner, int balance) {
        System.out.print("Deposit amount: $");
        int amount = scanner.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Enter an amount greater than zero.");
        }
        return balance;
    }

    static int withdraw(Scanner scanner, int balance) {
        System.out.print("Withdrawal amount: $");
        int amount = scanner.nextInt();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
        return balance;
    }
}