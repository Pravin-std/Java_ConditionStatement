package ConditionStatement;
import java.util.Scanner;
public class pb6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String bc = sc.nextLine();
        int dud = sc.nextInt();
        double sa = sc.nextDouble();
        sc.nextLine();
        String rt = sc.nextLine();

        double price = 0.0;

        if(bc.equals("Economy"))
        {
            if(rt.equals("Domestic"))
            {
                price = 200;
            }else if(rt.equals("Int-Short"))
            {
                price = 500;
            }else if(rt.equals("Int-Long"))
            {
                price = 800;
            }
        }else if(bc.equals("Business"))
        {
            if(rt.equals("Domestic"))
            {
                price = 600;
            }else if(rt.equals("Int-Short"))
            {
                price = 1500;
            }else if(rt.equals("Int-Long"))
            {
                price = 2500;
            }
        }else if(bc.equals("First"))
        {
            if(rt.equals("Domestic"))
            {
                price = 1000;
            }else if(rt.equals("Int-Short"))
            {
                price = 3000;
            }else if(rt.equals("Int-Long"))
            {
                price = 5000;
            }
        }

        double val = 0.0;
        String category = "High Demand";
        if(sa < 30.0 && dud < 14)
        {
            val = 1.8;
            category = "High Demand";
        }else if(sa < 50.0 && dud < 30)
        {
            val =  1.5;
            category = "High Demand";
        }else if(sa < 60.0 || dud > 30 && dud < 60)
        {
            val = 1.0;
            category = "Moderate";
        }else if(sa >= 60.0 && dud > 60)
        {
            val = 0.8;
            category = "Low Demand";
        }


        
        double final_price = price * val;





        System.out.println("Booking Class: " + bc);
        System.out.println("Days Until Departure: " + dud);
        System.out.println("Seat Availability: " + sa + "%");
        System.out.println("Route Type: " + rt);
        System.out.println("Base Price: $" + price);
      System.out.println("Demand Multiplier: " + val + "x");
      System.out.println("Final Ticket Price: $" + final_price);
        System.out.println("Pricing Category: " + category);
    }
}
