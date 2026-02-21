package ConditionStatement;
import java.util.Scanner;

public class pb22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int unitsConsumed = sc.nextInt();
        sc.nextLine();
        String customerType = sc.nextLine();
        String season = sc.nextLine();
        String paymentMethod = sc.nextLine();

        double rate1 = 0, rate2 = 0, rate3 = 0, rate4 = 0;

        if (customerType.equals("Residential")) {
            rate1 = 0.10;
            rate2 = 0.15;
            rate3 = 0.25;
            rate4 = 0.30;
        } else if (customerType.equals("Commercial")) {
            rate1 = 0.12;
            rate2 = 0.18;
            rate3 = 0.25;
            rate4 = 0.25;
        } else if (customerType.equals("Industrial")) {
            rate1 = 0.08;
            rate2 = 0.12;
            rate3 = 0.20;
            rate4 = 0.20;
        }

        double tier1Cost = 0, tier2Cost = 0, tier3Cost = 0, tier4Cost = 0;

        if (unitsConsumed > 0) {
            int tierUnits = Math.min(unitsConsumed, 100);
            tier1Cost = tierUnits * rate1;
        }

        if (unitsConsumed > 100) {
            int tierUnits = Math.min(unitsConsumed - 100, 200);
            tier2Cost = tierUnits * rate2;
        }

        if (unitsConsumed > 300) {
            int tierUnits = Math.min(unitsConsumed - 300, 200);
            tier3Cost = tierUnits * rate3;
        }

        if (unitsConsumed > 500) {
            int tierUnits = unitsConsumed - 500;
            tier4Cost = tierUnits * rate4;
        }

        double subTotal = tier1Cost + tier2Cost + tier3Cost + tier4Cost;

        double seasonalPercent = 0;

        if (season.equals("Summer")) {
            seasonalPercent = 15;
        } else if (season.equals("Winter")) {
            seasonalPercent = -10;
        } else if (season.equals("Regular")) {
            seasonalPercent = 0;
        }

        double seasonalAmount = subTotal * seasonalPercent / 100.0;
        double afterSeason = subTotal + seasonalAmount;

        double paymentPercent = 0;

        if (paymentMethod.equals("Auto-Pay")) {
            paymentPercent = 5;
        } else if (paymentMethod.equals("Online")) {
            paymentPercent = 3;
        } else if (paymentMethod.equals("Manual")) {
            paymentPercent = 0;
        }

        double discountAmount = afterSeason * paymentPercent / 100.0;
        double totalBill = afterSeason - discountAmount;

        double averageRate = 0;
        if (unitsConsumed > 0) {
            averageRate = totalBill / unitsConsumed;
        }

        System.out.println("Units Consumed: " + unitsConsumed + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $" + tier1Cost);
        System.out.println("Tier 2 Cost (101-300): $" + tier2Cost);
        System.out.println("Tier 3 Cost (301-500): $" + tier3Cost);
        System.out.println("Tier 4 Cost (501+): $" + tier4Cost);
        System.out.println("Seasonal Adjustment: " + (int)seasonalPercent + "%");
        System.out.println("Payment Discount: " + (int)paymentPercent + "%");
        System.out.printf("Total Bill: $%.2f\n", totalBill);
        System.out.printf("Average Rate: $%.2f/kWh\n", averageRate);
    }
}
