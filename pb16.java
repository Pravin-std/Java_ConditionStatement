package ConditionStatement;
import java.util.Scanner;
public class pb16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rc = sc.nextLine();
        String season = sc.nextLine();
        int nightsBooks = sc.nextInt();
        sc.nextLine();
        String loyaltytier = sc.nextLine();

        double baserate = 0.0;
        if(rc.equals("Standard"))
        {
            baserate = 150;
        }else if(rc.equals("Deluxe"))
        {
            baserate = 300;
        }else if(rc.equals("Suite"))
        {
            baserate = 500;
        }else if(rc.equals("Presidential"))
        {
            baserate = 1000;
        }
        double sea_mul = 0.0;
        if(season.equals("Off-Peak"))
        {
            sea_mul = 0.7;
        }else if(season.equals("Regular"))
        {
            sea_mul = 1.0;
        }else if(season.equals("Peak"))
        {
            sea_mul = 1.5;
        }else if(season.equals("Holiday"))
        {
            sea_mul = 2.0;
        }

        int esdis = 0;
        if(nightsBooks > 0 && nightsBooks < 5)
        {
            esdis = 0;
        }else if(nightsBooks > 4 && nightsBooks < 8)
        {
            esdis = 5;
        }else if(nightsBooks > 7 && nightsBooks < 15)
        {
            esdis = 10;
        }else if(nightsBooks > 14)
        {
            esdis = 20;
        }

        int lodis = 0;
        if(loyaltytier.equals("None"))
        {
            lodis = 0;
        }else if(loyaltytier.equals("Member"))
        {
            lodis = 10;
        }else if(loyaltytier.equals("Gold"))
        {
            lodis = 15;
        }else if(loyaltytier.equals("Platinum"))
        {
            lodis = 20;
        }

        double sea_rate = baserate * sea_mul;
        double dis_rate = sea_rate * (1-esdis/100.0) * (1-lodis/100.0);
        double total_cost = dis_rate * nightsBooks;

        String cat = "None";
        if((loyaltytier.equals("Member")) && (rc.equals("Suite")))
        {
            cat = "Free breakfast";
        }else if((loyaltytier.equals("Gold")) && (rc.equals("Deluxe")))
        {
            cat = "Free breakfast and spa access";
        }

        System.out.println("Room Category: "+rc);
        System.out.println("Season: "+season);
        System.out.println("Nights Booked: " +nightsBooks);
        System.out.println("Loyalty Tier: " +loyaltytier);
        System.out.println("Base Rate Per Night: $"+baserate);
        System.out.println("Seasonal Multiplier: "+ sea_mul+"x");
        System.out.println("Extended Stay Discount: " + esdis + "%");
        System.out.println("Loyalty Discount: "+lodis + "%");
        System.out.println("Nightly Rate: $" + dis_rate);
        System.out.println("Total Booking Cost: $" + total_cost);
        System.out.println("Complimentary Upgrades: "+cat);
        








    }
}
