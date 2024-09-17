import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double balance = 1000.0;

        System.out.println("ATM Menu:");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.printf("Your balance is: %.2f%n", balance);
                break;
            case 2:
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = scan.nextDouble();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.printf("You have successfully deposited %.2f. Your new balance is: %.2f%n", depositAmount, balance);
                } else {
                    System.out.println("Deposit amount must be positive!");
                }
                break;
            case 3:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = scan.nextDouble();
                if (withdrawAmount > 0 && withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.printf("You have successfully withdrawn %.2f. Your new balance is: %.2f%n", withdrawAmount, balance);
                } else {
                    System.out.println("Invalid withdrawal amount!");
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        scan.close();
    }
}
