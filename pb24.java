package ConditionStatement;
import java.util.Scanner;
public class pb24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dismil = sc.nextDouble();
        double orderval = sc.nextDouble();
        sc.nextLine();
        String timeslot = sc.nextLine();
        String weathercon = sc.nextLine();

        double bdfee = 3.0;

        double dis_sur = dismil * 1.00;

        double peak_time = 0.0;
        if(timeslot.equals("Breakfast")) peak_time = 0;
        else if(timeslot.equals("Lunch")) peak_time = 2.50;
        else if(timeslot.equals("Dinner")) peak_time = 2.00;
        else if(timeslot.equals("Late-Night")) peak_time = 1.50;

        double weather = 0.0;
        if(weathercon.equals("Clear")) weather = 0;
        else if(weathercon.equals("Rain")) weather = 2;
        else if(weathercon.equals("Snow")) weather = 3;
        else if(weathercon.equals("Strom")) weather = 5;

        double order_val_dis = 0.0;
        if(orderval >=30 && orderval <= 49.99) order_val_dis = 1;
        else if(orderval >=50 && orderval <= 74.99) order_val_dis = 3;
        else if(orderval >=75) order_val_dis = 5;

        double finalfee = bdfee + peak_time + weather - order_val_dis;

        int est_del_time = (int)dismil * 8;

        String order = "";
        if(orderval >= 60) order = "Express";
        else if((timeslot.equals("Dinner") ||(timeslot.equals("Lunch"))))
        {
            order = "High";
        }else
        {
            order = "Standard";
        }
        System.out.println("Delivery Distance :"+dismil);
        System.out.println("Order Value: $"+orderval);
        System.out.println("Time Slot: "+timeslot);
        System.out.println("Weather Condition: "+weathercon);
        System.out.println("Base Delivery Fee: $"+bdfee);
        System.out.println("Distance Surcharge: $"+dis_sur);
        System.out.println("Peak Time Surcharge: $"+peak_time);
        System.out.println("Weather surcharge : $"+weather);
        System.out.println("Order Value Discount : $"+order_val_dis);
        System.out.println("Final Delivery Fee: $"+finalfee);
        System.out.println("Estimated Delivery Time: "+est_del_time+"Minutes");
        System.out.println("Service Priority :"+order);

    }
}
