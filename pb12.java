package ConditionStatement;
import java.util.Scanner;
public class pb12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int driver_age  = sc.nextInt();
        sc.nextLine();
        String vechile_type = sc.nextLine();
        String driving_rec = sc.nextLine();
        String coverage_lel = sc.nextLine();

        double base_pre = 0.0;
        if(coverage_lel.equals("Basic"))
        {
            base_pre = 500.0;
        }else if(coverage_lel.equals("Standard"))
        {
            base_pre = 800.0;
        }else if(coverage_lel.equals("Comprehensive"))
        {
            base_pre = 1500.0;
        }

        double age_fact = 0.0;
        if(driver_age  >= 16 && driver_age <= 21)
        {
            age_fact = 1.8;
        }else if(driver_age  >= 22 && driver_age <= 25)
        {
            age_fact = 1.5;
        }else if(driver_age  >= 26 && driver_age <= 40)
        {
            age_fact = 1.0;
        }else if(driver_age  >= 41 && driver_age <= 60)
        {
            age_fact = 0.9;
        }else if(driver_age  >= 61)
        {
            age_fact = 1.1;
        }

       double vec_risk_fact = 0.0;
       if(vechile_type.equals("Sedan"))
       {
        vec_risk_fact = 1.0;
       }else if(vechile_type.equals("SUV"))
       {
        vec_risk_fact = 1.2;
       }else if(vechile_type.equals("Sports"))
       {
        vec_risk_fact = 1.5;
       }else if(vechile_type.equals("Truck"))
       {
        vec_risk_fact = 1.1;
       }

       int rec_adj = 0;
       if(driving_rec.equals("Clean"))
       {
        rec_adj = -10;
       }else if(driving_rec.equals("Minor-Violation"))
       {
        rec_adj = 25;
       }else if(driving_rec.equals("Major-Violation"))
       {
        rec_adj = 50;
       }

       double adj_pre = base_pre * age_fact * vec_risk_fact;

       double final_pre = adj_pre * (1 + rec_adj / 100.0);

       double mon_pre = final_pre / 12;

       String r_f = "Low";
       if(age_fact <=1.0 && vec_risk_fact <=1.2)
       {
        r_f = "Low";
       }else if(age_fact <=1.1 && vec_risk_fact <=1.0)
       {
        r_f = "Medium";
       }else if(age_fact <=1.5 && vec_risk_fact <=1.1)
       {
        r_f = "High";
       }else if(age_fact <=1.8 && vec_risk_fact <=1.5)
       {
        r_f = "Very High";
       }


       System.out.println("Driver Age : "+ driver_age);
       System.out.println("Vechile Type : "+vechile_type);
       System.out.println("Driving Record : " + driving_rec);
       System.out.println("Coverage Level : " + coverage_lel);
       System.out.println("Base Premium : $" +base_pre);
       System.out.println("Age Factor : "+age_fact+"x");
       System.out.println("Vechile Risk Factor : " + vec_risk_fact+"x");
       System.out.println("Record Adjustment : "+rec_adj+"%");
       System.out.println("Monthly Premium : $"+(float) mon_pre);
       System.out.println("Annual Premium : $"+(float)final_pre);
       System.out.println("Risk Category : "+r_f);



    }
}
