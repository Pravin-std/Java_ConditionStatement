package ConditionStatement;
import java.util.Scanner;

public class pb8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String loc = sc.nextLine();
        int sqr = sc.nextInt();
        int property_age = sc.nextInt();
        int amenity_score = sc.nextInt();

        double price = 0.0;

        if(loc.equalsIgnoreCase("Prime")) {
            price = 400.0;
        }
        else if(loc.equalsIgnoreCase("Urban")) {
            price = 300.0;
        }
        else if(loc.equalsIgnoreCase("Suburban")) {
            price = 180.0;
        }
        else if(loc.equalsIgnoreCase("Rural")) {
            price = 100.0;
        }

        double per = 0.0;

        if(property_age <= 5)
            per = 0;
        else if(property_age <= 10)
            per = -5;
        else if(property_age <= 15)
            per = -10;
        else if(property_age <= 30)
            per = -15;
        else
            per = -25;

        double basevalue = sqr * price;

        double adjustedValue = basevalue * (1 + per / 100);

        double amenityBonus = 0.0;

        if(amenity_score >= 80)
            amenityBonus = basevalue * 0.10;
        else if(amenity_score >= 60)
            amenityBonus = basevalue * 0.05;
        else if(amenity_score >= 40)
            amenityBonus = basevalue * 0.02;
        else
            amenityBonus = 0;

        double finalprice = adjustedValue + amenityBonus;

        String market;

        if((loc.equalsIgnoreCase("Prime") || loc.equalsIgnoreCase("Urban")) && property_age < 15)
            market = "Hot";
        else if(loc.equalsIgnoreCase("Suburban"))
            market = "Stable";
        else
            market = "Slow";

        System.out.println("Location Tier: " + loc);
        System.out.println("Square Footage: " + sqr + " sq ft");
        System.out.println("Property Age: " + property_age + " years");
        System.out.println("Amenity Score: " + amenity_score);
        System.out.println("Base Price Per Sq Ft: $" + price);
        System.out.println("Age Adjustment: " + (int)per + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalprice);
        System.out.println("Market Category: " + market);

    }
}
