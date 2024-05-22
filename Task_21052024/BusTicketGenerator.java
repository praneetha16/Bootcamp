package busticket;
import java.util.Scanner;

public class BusTicketGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Boarding Stop: ");
        int boardingStop = sc.nextInt();

        System.out.print("Enter Destination Stop: ");
        int destinationStop = sc.nextInt();

        System.out.print("Enter Number of Adult Passengers: ");
        int adultPassengers = sc.nextInt();

        System.out.print("Enter Number of Child Passengers: ");
        int childPassengers = sc.nextInt();

        // Calculating number of stops
        int numberOfStops = destinationStop - boardingStop;

        // Calculating cost
        double adultCost = numberOfStops * 10 * adultPassengers;
        double childCost = numberOfStops * 5 * childPassengers;
        double totalCost = adultCost + childCost;

        // Applying discounts based on the number of adult passengers
        double discount = 0.0;
        if (adultPassengers >= 5) {
            discount = 0.20 * totalCost;
        } else if (adultPassengers == 4) {
            discount = 0.15 * totalCost;
        } else if (adultPassengers == 3) {
            discount = 0.10 * totalCost;
        } else if (adultPassengers == 2) {
            discount = 0.05 * totalCost;
        }

        double discountedCost = totalCost - discount;

        // Applying tax
        double tax = 0.10 * discountedCost;
        double finalCost = discountedCost + tax;

        // Displaying the details
        System.out.println("\nBus Ticket Details:");
        System.out.println("Boarding Stop: " + boardingStop);
        System.out.println("Destination Stop: " + destinationStop);
        System.out.println("Number of Stops: " + numberOfStops);
        System.out.println("Number of Adult Passengers: " + adultPassengers);
        System.out.println("Number of Child Passengers: " + childPassengers);
        System.out.println("Total Cost (before discount and tax): Rs." + totalCost);
        System.out.println("Discount Applied: Rs." + discount);
        System.out.println("Cost after Discount: Rs." + discountedCost);
        System.out.println("Tax (10%): Rs." + tax);
        System.out.println("Total Price of Ticket: Rs." + finalCost);

        sc.close();
    }
}
