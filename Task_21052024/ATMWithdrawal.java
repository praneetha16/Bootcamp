package ATM;
import java.util.Scanner;

public class ATMWithdrawal {

    public static void main(String[] args) {
        // Initial settings
        int initialBalance = 10000;
        int atmPin = 1234;
        int cashInATM = 8000;

        Scanner sc = new Scanner(System.in);

        // Read the PIN from the user
        System.out.print("Enter your ATM PIN: ");
        int enteredPin = sc.nextInt();

        // Verify the entered PIN
        if (enteredPin == atmPin) {
            // Read the amount to withdraw
            System.out.print("Enter the amount to withdraw: ");
            int withdrawAmount = sc.nextInt();

            // Check if the amount is a multiple of 100
            if (withdrawAmount % 100 == 0) {
                // Check if the amount is less than or equal to the account balance
                if (withdrawAmount <= initialBalance) {
                    // Check if the amount is available in the ATM
                    if (withdrawAmount <= cashInATM) {
                        // Update the balance and ATM cash
                        initialBalance -= withdrawAmount;
                        cashInATM -= withdrawAmount;
                        System.out.println("Transaction successful.");
                        System.out.println("Updated balance: Rs." + initialBalance);
                    } else {
                        System.out.println("Transaction failed. Insufficient cash in the ATM.");
                    }
                } else {
                    System.out.println("Transaction failed. Insufficient balance.");
                }
            } else {
                System.out.println("Transaction failed. Amount must be a multiple of 100.");
            }
        } else {
            System.out.println("Transaction failed. Incorrect PIN.");
        }

        sc.close();
    }
}
