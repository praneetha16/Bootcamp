package ATM;
import java.util.Scanner;

public class ATMMachine {
    private static int userBalance = 10000;
    private static int atmBalance = 50000;
    private static int userPIN = 1234;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueUsingATM = true;

        while (continueUsingATM) {
            System.out.print("Enter PIN: ");
            int enteredPIN = sc.nextInt();

            if (enteredPIN == userPIN) {
                boolean validOperation = false;
                while (!validOperation) {
                    System.out.println("Choose an option:");
                    System.out.println("1. Balance Enquiry");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. PIN Change");

                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            balanceEnquiry();
                            validOperation = true;
                            break;
                        case 2:
                            deposit(sc);
                            validOperation = true;
                            break;
                        case 3:
                            withdraw(sc);
                            validOperation = true;
                            break;
                        case 4:
                            changePIN(sc);
                            validOperation = true;
                            break;
                        default:
                            System.out.println("Invalid option. Please choose again.");
                    }
                }
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }

            System.out.print("Do you want to perform another transaction? (yes/no): ");
            String response = sc.next();

            if (!response.equalsIgnoreCase("yes")) {
                continueUsingATM = false;
            }
        }

        System.out.println("Thank you for using the ATM. Goodbye!");
        sc.close();
    }

    private static void balanceEnquiry() {
        System.out.println("Your current balance is: Rs." + userBalance);
    }

    private static void deposit(Scanner sc) {
        System.out.print("Enter the amount to deposit: Rs.");
        int depositAmount = sc.nextInt();

        if (depositAmount > 0) {
            userBalance += depositAmount;
            atmBalance += depositAmount;
            System.out.println("Deposit successful. Your updated balance is: Rs." + userBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: Rs.");
        int withdrawAmount = scanner.nextInt();

        if (withdrawAmount > 0 && withdrawAmount <= userBalance && withdrawAmount <= atmBalance) {
            userBalance -= withdrawAmount;
            atmBalance -= withdrawAmount;
            System.out.println("Withdrawal successful. Your updated balance is: Rs." + userBalance);
        } else if (withdrawAmount > userBalance) {
            System.out.println("Insufficient balance.");
        } else if (withdrawAmount > atmBalance) {
            System.out.println("ATM does not have enough cash.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    private static void changePIN(Scanner sc) {
        System.out.print("Enter your old PIN: ");
        int oldPIN = sc.nextInt();

        if (oldPIN == userPIN) {
            System.out.print("Enter your new PIN: ");
            int newPIN1 = sc.nextInt();
            System.out.print("Confirm your new PIN: ");
            int newPIN2 = sc.nextInt();

            if (newPIN1 == newPIN2) {
                userPIN = newPIN1;
                System.out.println("PIN change successful.");
            } else {
                System.out.println("PINs do not match. Try again.");
            }
        } else {
            System.out.println("Incorrect old PIN.");
        }
    }
}
