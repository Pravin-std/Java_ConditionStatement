package ConditionStatement;
import java.util.Scanner;
public class pb15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uc = sc.nextInt();
        sc.nextLine();
        String ltype = sc.nextLine();
        String splel = sc.nextLine();
        int conyears = sc.nextInt();

        double baseprice = 0.0;
        if(ltype.equals("Standard"))
        {
            baseprice = 60;
        }
        else if(ltype.equals("Professional"))
        {
            baseprice = 120;
        }else if(ltype.equals("Enterprise"))
        {
            baseprice = 200;
        }

        int vol_dis = 0;
        if(uc >=1 && uc <=50)
        {
            vol_dis = 0;
        }else if(uc >=51 && uc <=200)
        {
            vol_dis = 15;
        }else if(uc >=201 && uc <=500)
        {
            vol_dis = 25;
        }else if(uc >=501 && uc <=1000)
        {
            vol_dis = 25;
        }else if(uc >=1001)
        {
            vol_dis = 35;
        }

        double supfee = 0.0;
        if(splel.equals("Basic"))
        {
            supfee = 10;
        }else if(splel.equals("Priority"))
        {
            supfee = 30;
        }else if(splel.equals("Premium"))
        {
            supfee = 80;
        }

        int mulyeardis = 0;
        if(conyears == 1)
        {
            mulyeardis = 0;
        }else  if(conyears == 2)
        {
            mulyeardis = 5;
        }else  if(conyears == 3)
        {
            mulyeardis = 10;
        }else  if(conyears == 5)
        {
            mulyeardis = 20;
        }

        double disbase = baseprice * (1 - vol_dis / 100.0);
        double apu = (disbase + supfee) * (1-mulyeardis/100.0);
        double total = (apu * uc);
        double cv = total * conyears;

        String pricing = "small";
        if(uc <= 200)
        {
            pricing = "Small Business";
        }else if(uc > 200 && uc <=1000)
        {
            pricing = "Small Business";
        }else if(uc > 1000)
        {
            pricing = "Enterprise";
        }



        System.out.println("User Count: " + uc);
        System.out.println("License Type: " + ltype);
        System.out.println("Support Level: "+splel);
        System.out.println("Contract Duration: "+conyears+"years");
        System.out.println("Base Price Per User: $"+baseprice);
        System.out.println("Volume Discount: "+vol_dis+"%");
        System.out.println("Support Fee Per User: $"+supfee);
        System.out.println("Multi-Year Discount: " + mulyeardis+"%");
        System.out.println("Annual Cost Per User: $"+apu);
        System.out.println("Total Annual Cost: $"+total);
        System.out.println("Total Contract Value: $"+cv);
        System.out.println("Pricing Tier: "+pricing);

    }
}
