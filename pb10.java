package ConditionStatement;
import java.util.Scanner;
public class pb10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String timeofday = sc.nextLine();
        double power_con = sc.nextDouble();
        double ren_per = sc.nextDouble();
        sc.nextLine();
        String rate_tier = sc.nextLine();

        double base_rate = 0.0;
        if(rate_tier.equals("Basic"))
        {
            base_rate = 0.18;
        }else if(rate_tier.equals("Time-of-Use"))
        {
            base_rate = 0.15;
        }else if(rate_tier.equals("Premium-Green"))
        {
            base_rate = 0.12;
        }

        double rate_mul = 0.0;
        if(timeofday.equals("Peak"))
        {
            rate_mul = 1.5;
        }else if(timeofday.equals("Off-Peak"))
        {
            rate_mul = 0.8;
        }else if(timeofday.equals("Super-Off-Peak"))
        {
            rate_mul = 0.5;
        }

       double ren_cre = (power_con * ren_per / 100) * base_rate;
       
       double cost = (power_con * base_rate * rate_mul) - ren_cre;
       
       System.out.println("Time of Day: " + timeofday);
       System.out.println("Power Consumption: " + power_con+"kWh");
       System.out.println("Renewable Energy :"+ren_per+"%");
       System.out.println("Rate Tier:"+rate_tier);
       System.out.println("Base Rate: " +base_rate+"/kWh");
       System.out.println("Rate Multiplier: " +rate_mul+"x");
       System.out.println("Renewable Credit: $" + ren_cre);
       System.out.println("Total Cost : $"+(float)cost);
    }
}
