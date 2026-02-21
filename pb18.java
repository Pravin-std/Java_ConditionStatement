package ConditionStatement;
import java.util.Scanner;
public class pb18 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double pw = sc.nextDouble();
    sc.nextLine();
    String dz = sc.nextLine();
    String ss = sc.nextLine();
    String ps = sc.nextLine();

    double bsr = 0.0;
    if(ss.equals("Economy"))
    {
        bsr = 5;
    }else if(ss.equals("Standard"))
    {
        bsr = 10;
    }else if(ss.equals("Express"))
    {
        bsr = 25;
    }else if(ss.equals("Overnight"))
    {
        bsr = 50;
    }
    
    double ws = pw * 1.0;
    double zmul = 0.0;
    if(dz.equals("Local"))
    {
        zmul = 1.0;
    }else if(dz.equals("Regional"))
    {
        zmul = 1.2;
    }else if(dz.equals("National"))
    {
        zmul = 1.5;
    }else if(dz.equals("International"))
    {
        zmul = 3.0;
    }

    double size_sur = 0.0;
    if(ps.equals("Small"))
    {
        size_sur = 0.0;
    }else if(ps.equals("Medium"))
    {
        size_sur = 5.0;
    }else if(ps.equals("Large"))
    {
        size_sur = 15;
    }else if(ps.equals("Oversized"))
    {
        size_sur = 30;
    }


    double basecost = (bsr + ws) * zmul;
    double totalcost = basecost + size_sur;

    int delTime = 0;
    if(ss.equals("Economy"))
    {
        if(dz.equals("Local")) delTime = 3;
        else if(dz.equals("National")) delTime = 7;
        else if(dz.equals("Regional")) delTime = 5;
        else if(dz.equals("International")) delTime = 14;

    }else if(ss.equals("Standard"))
    {
        if(dz.equals("Local")) delTime = 2;
        else if(dz.equals("National")) delTime = 5;
        else if(dz.equals("Regional")) delTime = 3;
        else if(dz.equals("International")) delTime = 10;

    }else if(ss.equals("Express"))
    {
        if(dz.equals("Local")) delTime = 1;
        else if(dz.equals("National")) delTime = 2;
        else if(dz.equals("Regional")) delTime = 3;
        else if(dz.equals("International")) delTime = 5;

    }else if(ss.equals("Overnight"))
    {
        if(dz.equals("Local")) delTime = 1;
        else if(dz.equals("National")) delTime = 1;
        else if(dz.equals("Regional")) delTime = 1;
        else if(dz.equals("International")) delTime = 1;

    }

    String sl = "Priority";
    if(ss.equals("Express")) sl = "Priority";
    else if(ss.equals("Standard")) sl = "Standard";
    else if(ss.equals("Overnight")) sl = "Premium";
    else if(ss.equals("Economy")) sl = "Budget";


    System.out.println("Package Weight: "+pw);
    System.out.println("Destination Zone: "+dz);
    System.out.println("Shipping Speed: "+ss);
    System.out.println("Package Size: "+ps);
    System.out.println("Base Shipping Rate: $"+bsr);
    System.out.println("Weight Surcharge: $"+ws);
    System.out.println("Zone Multiplier: "+zmul+"x");
    System.out.println("Size Surcharge: $"+size_sur);
    System.out.println("Total Shipping Cost: $"+(float)totalcost);
    System.out.println("Estimated Delivery: "+delTime);
    System.out.println("Estimated Delivery: "+sl+"bussiness days");
    
    








   }
}
