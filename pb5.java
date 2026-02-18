package ConditionStatement;
import java.util.Scanner;
public class pb5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double gpa = sc.nextDouble();
        double familyincome = sc.nextDouble();
        int extra_cari_act = sc.nextInt();
        sc.nextLine();
        String scholarship  = sc.nextLine();

        double amt = 0.0;
        String val = "None";
        String check = "Not Eligible";

        if(gpa >2.8)
        {
            check = "Eligible";
            if(scholarship.equals("Merit"))
            {
                if(gpa >=3.8 && extra_cari_act >=80)
                {
                    amt = 25000.0;
                    val = "Full";
                }else if(gpa >=3.5 && extra_cari_act >=70)
                {
                    amt = 15000.0;
                    val = "Partial";
                }else if(gpa >=3.0 && extra_cari_act >=60)
                {
                    amt = 8000.0;
                    val = "Minimal";
                }
            }else if(scholarship.equals("Need-Based"))
            {
                if(familyincome <= 30000 && gpa >= 3.5)
                {
                    amt = 30000.0;
                    val = "Full";
                }else if(familyincome <= 50000 && gpa >= 3.0)
                {
                    amt = 18000.0;
                    val = "Partial";
                }else if(familyincome <= 70000 && gpa >= 2.8)
                {
                    amt = 10000;
                    val = "Minimal";
                }
            }else if(scholarship.equals("Sports"))
            {
                if(extra_cari_act >= 85 && gpa >= 3.0)
                {
                    amt = 22000.0;
                    val = "Full";
                }else if(extra_cari_act >= 75 && gpa >= 2.8)
                {
                    amt = 20000.0;
                    val = "Partial";
                }else if(extra_cari_act >= 65 && gpa >= 2.5)
                {
                    amt = 12000.0;
                    val = "Minimal";
                }
            }
        }

        System.out.println("GPA :" +gpa);
        System.out.println("Family Income: $" + familyincome);
        System.out.println("Extracurricular Score :" + extra_cari_act);
        System.out.println("scholarship Type :" + scholarship);
        System.out.println("Eligiblity : "+ check);
        System.out.println("Award Amount : $"+amt);
        System.out.println("Award Category :" +val);





    }
}
