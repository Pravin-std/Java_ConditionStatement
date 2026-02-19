package ConditionStatement;
import java.util.Scanner;
public class pb9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double revenue = sc.nextDouble();
        sc.nextLine();
        String btype = sc.nextLine();
        double dexp = sc.nextDouble();
        double taxcredit = sc.nextDouble();

        double income = revenue - dexp;

        double tax_rate = 0.0;
        if(btype.equals("C-Corp"))
        {
            if(income < 500000)
            {
                tax_rate = 21;
            }else if(income >= 500000 && income < 1000000)
            {
                tax_rate = 24;
            }else if(income >= 1000000 && income < 2000000)
            {
                tax_rate = 28;
            }else if(income >= 2000000)
            {
                tax_rate = 30;
            }
        }else if(btype.equals("S-Corp"))
        {
            if(income < 500000)
            {
                tax_rate = 20;
            }else if(income >= 500000 && income < 1000000)
            {
                tax_rate = 25;
            }else if(income >= 1000000)
            {
                tax_rate = 28;
            }
        }else if(btype.equals("LLC"))
        {
            if(income < 200000)
            {
                tax_rate = 15;
            }else if(income >= 200000 && income < 500000)
            {
                tax_rate = 18;
            }else if(income >= 500000)
            {
                tax_rate = 22;
            }
        }else if(btype.equals("Partnership"))
        {
            if(income < 300000)
            {
                tax_rate = 18;
            }else if(income >= 300000 && income < 800000)
            {
                tax_rate = 22;
            }else if(income >= 800000)
            {
                tax_rate = 26;
            }
        }

        double gross_tax = income * (tax_rate / 100);

        double net_tax = gross_tax - taxcredit;

        double eff_rate = (net_tax / revenue) * 100;

        System.out.println("Annual Revenue: " + revenue);
        System.out.println("Business Type: " +btype);
        System.out.println("Deductible Expenses: $" +dexp);
        System.out.println("Tax Credits: $" +taxcredit);
        System.out.println("Taxable Income : $" +income);
        System.out.println("Tax Rate: " +(int)tax_rate+"%");
        System.out.println("Gross Tax: $" +gross_tax);
        System.out.println("Net Tax After Credits: $" + net_tax);
        System.out.printf("Effective Tax Rate: %.2f" ,eff_rate+"%");

     }
}
