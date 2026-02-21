package ConditionStatement;

import java.util.Scanner;
public class pb21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loczone = sc.nextLine();
        double parhrs = sc.nextDouble();
        sc.nextLine();
        String vectype = sc.nextLine();
        String mem = sc.nextLine();

        double bhr = 0.0;
        if((loczone.equals("Downtown") || (loczone.equals("Business-District")) || (loczone.equals("Residential")) || (loczone.equals("Airport"))))
        {
            bhr = 5.0;
        }

        int zone_pre = 0;
        if(loczone.equals("Downtown")) zone_pre = 50;
        else if(loczone.equals("Business-District ")) zone_pre = 30;
        else if(loczone.equals("Residential")) zone_pre = 0;
        else if(loczone.equals("Airport")) zone_pre = 100;

        double vec_sur = 0.0;
        if(vectype.equals("Motorcycle")) vec_sur = -2;
        else if(vectype.equals("Compact")) vec_sur = 0;
        else if(vectype.equals("Sedan")) vec_sur = 0;
        else if(vectype.equals("Oversized")) vec_sur = 5;

        double raw = (bhr * (1 + zone_pre/100.0) + vec_sur) * parhrs;
        int memdis = 0;
        if(mem.equals("None")) memdis = 0;
        else if(mem.equals("monthly")) memdis = 20;
        else if(mem.equals("Annual")) memdis = 25;
        else if(mem.equals("VIP")) memdis = 30;

        double finalfee = raw * (1-memdis/100.0);

        String cat = "Standard";
        if((loczone.equals("Downtown") || (loczone.equals("Business-Didtrict"))))
        {
            cat = "Premium";
        }else if(loczone.equals("Airport"))
        {
            cat = "Luxury";
        }

        System.out.println("Location Zone: "+loczone);
        System.out.println("Parking Duration: "+parhrs+"hours");
        System.out.println("Vehicle Type: "+vectype);
        System.out.println("Membership Status: "+mem);
        System.out.println("Base Hourly Rate: $"+bhr);
        System.out.println("Zone Premium: "+zone_pre+"%");
        System.out.println("Vehicle Size Surcharge: $"+vec_sur);
        System.out.println("Membership Discount: "+memdis+"%");
        System.out.println("Total Parking Fee: $"+finalfee);
        System.out.println("Rate Category: "+cat);


    }
}
