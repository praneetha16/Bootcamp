package electricitybill;
import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Service Number: ");
        String serviceNumber = sc.nextLine();

        System.out.print("Enter Previous Reading: ");
        int previousReading = sc.nextInt();

        System.out.print("Enter Current Reading: ");
        int currentReading = sc.nextInt();

        // Calculating units consumed
        int unitsConsumed = currentReading - previousReading;

        // Calculating cost based on units consumed
        double cost = 0.0;
        if (unitsConsumed < 100) {
            cost = unitsConsumed * 1.0;
        } else if (unitsConsumed < 150) {
            cost = unitsConsumed * 1.5;
        } else if (unitsConsumed < 200) {
            cost = unitsConsumed * 2.0;
        } else {
            cost = unitsConsumed * 2.5;
        }

        // Calculating taxes
        double CGST = cost * 0.05; // 5% CGST
        double SGST = cost * 0.15; // 15% SGST

        // Total amount to pay
        double totalAmount = cost + CGST + SGST;

        // Displaying the details
        System.out.println("\nElectricity Bill Details:");
        System.out.println("Service Number: " + serviceNumber);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Cost of Electricity: Rs." + cost);
        System.out.println("CGST (5%): Rs." + CGST);
        System.out.println("SGST (15%): Rs." + SGST);
        System.out.println("Total Amount to Pay: Rs." + totalAmount);

        sc.close();
    }
}