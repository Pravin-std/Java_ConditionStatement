package ConditionStatement;
import java.util.Scanner;
public class pb13 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String std_sts = sc.nextLine();
    int cre_hrs = sc.nextInt();
    sc.nextLine();
    String Pro_type = sc.nextLine();
    String res = sc.nextLine();

    double base_tut = 0.0;
    if(Pro_type.equals("Undergraduate"))
    {
        base_tut = 350;
    }else if(Pro_type.equals("Graduate"))
    {
        base_tut = 550;
    }else if(Pro_type.equals("Professional"))
    {
        base_tut = 800;
    }

    double res_mul = 0.0;
    if(res.equals("In-State"))
    {
        res_mul = 1.0;
    }else if(res.equals("Out-of-State"))
    {
        res_mul = 2.5;
    }else if(res.equals("International"))
    {
        res_mul = 3.0;
    }

    double pro_fee = 0.0;
    if(std_sts.equals("Full-Time"))
    {
        if(Pro_type.equals("Undergraduate"))
    {
        pro_fee = 500;
    }else if(Pro_type.equals("Graduate"))
    {
        pro_fee = 750;
    }else if(Pro_type.equals("Professional"))
    {
        pro_fee = 900;
    }
    }
    else if(std_sts.equals("Part-Time"))
    {
        if(Pro_type.equals("Undergraduate"))
    {
        pro_fee = 300;
    }else if(Pro_type.equals("Graduate"))
    {
        pro_fee = 750;
    }else if(Pro_type.equals("Professional"))
    {
        pro_fee = 900;
    }
    }else if(std_sts.equals("Continuing-Education"))
    {
        if((Pro_type.equals("Undergraduate")) || (Pro_type.equals("Graduate")) || (Pro_type.equals("Professional")))
        {
            pro_fee = 150;
        }
    }

    double std_act_fee = 0.0;
    if(std_sts.equals("Full-Time"))
    {
        std_act_fee = 200;
    }else if(std_sts.equals("Part-Time"))
    {
        std_act_fee = 100;
    }else if(std_sts.equals("Continuing"))
    {
        std_act_fee = 50;
    }

    double tution_fee = cre_hrs * base_tut * res_mul;
    double total_fee = tution_fee + pro_fee + std_act_fee;

    String Cat = "Standard";
    if((res.equals("In-State")) || (std_sts.equals("Full-Time")))
    {
        Cat = "Standard";
    }else if((res.equals("Continuing-Education")) || (std_sts.equals("Out-of-State")) || (std_sts.equals("International")))
    {
        Cat = "Premium";
    }

    System.out.println("Student Status: "+ std_sts);
    System.out.println("Credit Hours :" + cre_hrs);
    System.out.println("Program Type: " + Pro_type);
    System.out.println("Residency: " + res);
    System.out.println("Base Tuition Per Credit: $" + base_tut);
    System.out.println("Residency Multiplier: " +res_mul +"x");
    System.out.println("Program Fee: $" + pro_fee);
    System.out.println("Student Activity Fee: $" + std_act_fee);
    System.out.println("Total Registration Fee: $" + total_fee);
    System.out.println("Fee Category: "+Cat);

   } 
}
