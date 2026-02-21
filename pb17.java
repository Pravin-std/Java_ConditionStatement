package ConditionStatement;
import java.util.Scanner;
public class pb17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ct = sc.nextLine();
        String pc = sc.nextLine();
        double tramt = sc.nextDouble();
        sc.nextLine();
        String prosta = sc.nextLine();

        double bpr = 0.0;
        if((ct.equals("Platinum")) || (ct.equals("Gold")) || (ct.equals("Black")) || (ct.equals("Basic")))
        {
            bpr = 1.0;
        }

        double catbon = 0.0;
        if(pc.equals("Groceries"))
        {
            catbon = 2.0;
        }else if(pc.equals("Dining"))
        {
            catbon = 2.5;
        }else if(pc.equals("Travel"))
        {
            catbon = 3.0;
        }else  if(pc.equals("Gas"))
        {
            catbon = 2.0;
        }else
        {
            catbon = 1.0;
        }

        double tiermul = 0.0;
        if(ct.equals("Basic"))
        {
            tiermul = 1.0;
        }else if(ct.equals("Gold"))
        {
            tiermul = 1.25;
        }else if(ct.equals("Platinum"))
        {
            tiermul = 1.5;
        }else if(ct.equals("Black"))
        {
            tiermul = 2.0;
        }

        double promul = 0.0;
        if(prosta.equals("None"))
        {
            promul = 1.0;
        }else if(prosta.equals("Double-Points"))
        {
            promul = 2.0;
        }else if(prosta.equals("Triple-Points"))
        {
            promul = 3.0;
        }

        double calpoi = tramt * bpr * catbon * tiermul * promul;
        double cash_val = calpoi * 0.01;

        String reward = "None";
        if(ct.equals("Platinum"))
        {
            reward = "Premium";
        }else if(ct.equals("Gold"))
        {
            reward = "Enchanced";
        }else if(ct.equals("Black"))
        {
            reward = "Elite";
        }else if(ct.equals("Basic"))
        {
            reward = "Standard";
        }

        System.out.println("Card Tier: "+ct);
        System.out.println("Purchase Category: "+pc);
        System.out.println("Transaction Amount: $"+tramt);
        System.out.println("Promotional Status :"+prosta);
        System.out.println("Base Points Rate: "+bpr+"points per dollar");
        System.out.println("Category Bonus: "+catbon+"x");
        System.out.println("Tier Multiplier: "+tiermul+"x");
        System.out.println("Promotional Multiplier: "+promul+"x");
        System.out.println("Points Earned: "+calpoi);
        System.out.println("Equivalent Cash Value: $"+cash_val);
        System.out.println("Rewards Tier: "+reward);
    }   
}
