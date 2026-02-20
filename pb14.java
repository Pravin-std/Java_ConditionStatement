package ConditionStatement;
import java.util.Scanner;
public class pb14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mem = sc.nextLine();
        int con_mon = sc.nextInt();
        sc.nextLine();
        String acc_lel = sc.nextLine();
        String addOns = sc.nextLine();

        double mon_fee = 0.0;
        if(mem.equals("Basic"))
        {
            mon_fee = 40;
        }else if(mem.equals("Premium"))
        {
            mon_fee = 80;
        }else if(mem.equals("Elite"))
        {
            mon_fee = 120;
        }else if(mem.equals("VIP"))
        {
            mon_fee = 150;
        }

        int dis = 0;
        if(con_mon==1)
        {
            dis = 0;
        }else if(con_mon == 6)
        {
                dis = 10;
        }else if(con_mon == 12)
        {
            dis = 15;
        }else if(con_mon == 24)
        {
            dis = 25;
        }

        double acc_fee = 0.0;
        if(acc_lel.equals("Single-Location"))
        {
            acc_fee = 0;
        }else  if(acc_lel.equals("Regional"))
        {
            acc_fee = 20;
        }else  if(acc_lel.equals("Nationalwide"))
        {
            acc_fee = 50;
        }

        double addonfee = 0.0;
        if(addOns.equals("None"))
        {
            addonfee = 0;
        }else if(addOns.equals("Personal-Training"))
        {
            addonfee = 100;
        }else if(addOns.equals("classes"))
        {
            addonfee = 50;
        }else if(addOns.equals("Full-Package"))
        {
            addonfee = 200;
        }

        double disbase = mon_fee * (1 - dis / 100.0);
        double montotal = disbase + acc_fee + addonfee;
        double contotal = montotal * con_mon;
        double savings = (mon_fee + acc_fee + addonfee) * con_mon - contotal;


        String membership = "Premium";
        if(con_mon == 1)
        {
            membership = "Budget";
        }
        else if(con_mon == 6)
        {
            membership = "standrard";
        }else if(con_mon == 12)
        {
            membership = "Premium";
        }else if(con_mon == 24)
        {
            membership = "Luxuary";
        }

        System.out.println("Membership Tier: " + mem);
        System.out.println("Contract Length: " +con_mon);
        System.out.println("Access Level: " +acc_lel);
        System.out.println("Add-Ons: " + addOns);
        System.out.println("Base Monthly Fee: $" + mon_fee);
        System.out.println("Contract Discount : "+dis+"%");
        System.out.println("Access Fee: $" +acc_fee);
        System.out.println("Add-On Fee: $" + addonfee);
        System.out.println("Monthly Total : $"+montotal);
        System.out.println("Contract Total: $"+contotal);
        System.out.println("Savings vs Month-to-Month: $"+savings);
        System.out.println("Membership category : " + membership);







    }
}
