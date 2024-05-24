package BusTicket;
import java.util.Scanner;

public class BusTicketVender {
    private static int ticketsSold = 0;
    private static int amountCollected = 0;
    private static int userPIN = 1234;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueUsingMachine = true;

        while (continueUsingMachine) {
            System.out.print("Enter PIN: ");
            int enteredPIN = sc.nextInt();

            if (enteredPIN == userPIN) {
                boolean validOperation = false;
                while (!validOperation) {
                    System.out.println("Choose an option:");
                    System.out.println("1. Ticket issue");
                    System.out.println("2. Balance collected");
                    System.out.println("3. Number of tickets sold");
                    System.out.println("4. PIN change");

                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            issueTicket(sc);
                            validOperation = true;
                            break;
                        case 2:
                            balanceCollected();
                            validOperation = true;
                            break;
                        case 3:
                            numberOfTicketsSold();
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
                continueUsingMachine = false;
            }
        }

        System.out.println("Thank you for using the Bus Ticket Vending Machine. Goodbye!");
        sc.close();
    }

    private static void issueTicket(Scanner sc) {
        System.out.print("Enter the number of tickets to issue: ");
        int numberOfTickets = sc.nextInt();
        int ticketPrice = 50;

        if (numberOfTickets > 0) {
            int totalCost = numberOfTickets * ticketPrice;

            // Apply discount: 10% discount for buying 5 or more tickets
            if (numberOfTickets >= 5) {
                totalCost -= totalCost * 0.1;
                System.out.println("A 10% discount has been applied.");
            }

            ticketsSold += numberOfTickets;
            amountCollected += totalCost;

            System.out.println(numberOfTickets + " ticket(s) issued. Total cost: Rs." + totalCost);
            System.out.println("Updated number of tickets sold: " + ticketsSold);
            System.out.println("Updated amount collected: Rs." + amountCollected);
        } else {
            System.out.println("Invalid number of tickets.");
        }
    }

    private static void balanceCollected() {
        System.out.println("Total amount collected: Rs." + amountCollected);
    }

    private static void numberOfTicketsSold() {
        System.out.println("Total number of tickets sold: " + ticketsSold);
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
