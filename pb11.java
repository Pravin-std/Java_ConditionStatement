package ConditionStatement;
import java.util.Scanner;
public class pb11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order_type = sc.nextLine();
        String loyallty_Status = sc.nextLine();
        double order_val = sc.nextDouble();
        sc.nextLine();
        String timeslot = sc.nextLine();

       int base_dis = 0;
       if(loyallty_Status.equals("Gold"))
       {
        base_dis = 15;
       }else if(loyallty_Status.equals("Silver"))
       {
        base_dis = 10;
       }else if(loyallty_Status.equals("Bronze"))
       {
        base_dis = 5;
       }else{
        base_dis = 0;
       }

      int time_base = base_dis + 0;
      if(timeslot.equals("Peak"))
      {
        time_base = 0;
      }else if(timeslot.equals("Regular"))
      {
        time_base = 0;
      }else if(timeslot.equals("Late-Night"))
      {
        time_base = -5;
      }

      int service_fee = 0;
      if(order_type.equals("Delivery"))
      {
        service_fee = 10;
      }else if(order_type.equals("Takeout"))
      {
        service_fee = 3;
      }else if(order_type.equals("Dine-In"))
      {
        service_fee = 0;
      }

      double dis_val = order_val * (1- base_dis / 100.0);
      double final_amt = dis_val + service_fee;

      String kitchen = "Medium";
      if(timeslot.equals("Peak") && order_type.equals("Delivery"))
      {
        kitchen = "High";
      }else if(timeslot.equals("Regular"))
      {
        kitchen = "Medium";
      }else if(timeslot.equals("Late-Night"))
      {
        kitchen = "Low";
      }

      int min = 0;
      if(order_type.equals("Dine-In") && kitchen.equals("Medium"))
      {
        min = 25;
      }else if(order_type.equals("Delivery") && kitchen.equals("High"))
      {
        min = 30;
      }else if(order_type.equals("Takeout") && kitchen.equals("Low"))
      {
        min = 15;
      }


      System.out.println("Order Type: " +order_type);
      System.out.println("Loyalty Status: " +loyallty_Status);
      System.out.println("Order Value: $" +order_val);
      System.out.println("Time Slot: " +timeslot);
      System.out.println("Base Discount: " +base_dis+"%");
      System.out.println("Time-based adjustment :"+time_base+"%");
      System.out.println("Service Fee: $"+service_fee);
      System.out.println("Final Amount : $"+(float)final_amt);
      System.out.println("Kitchen Priority: "+kitchen);
      System.out.println("Estimate Prep Time :"+min+"minutes");

      

      







    }
}
