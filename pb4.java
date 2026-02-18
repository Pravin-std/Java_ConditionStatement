package ConditionStatement;
import java.util.Scanner;
public class pb4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bd = sc.nextLine();
        double cartvalue = sc.nextDouble();
        sc.nextLine();
        String product = sc.nextLine();
        String membership = sc.nextLine();

        int val = 0;
        if(bd.equals("Bronze"))
        {
            val = 5;
        }else if(bd.equals("Silver"))
        {
            val = 8;
        }else if(bd.equals("Gold"))
        {
            val = 12;
        }else if(bd.equals("Platinum"))
        {
            val = 15;
        }


        int ad = 0;
        if(cartvalue >= 500 && cartvalue <=999)
        {
            ad = 3;
        }else if(cartvalue >= 1000 && cartvalue <=1999)
        {
            ad = 5;
        }else if(cartvalue >= 2000)
        {
            ad = 7;
        }


        int bonus = 0;
        if(product.equals("Electronics"))
        {
            if(membership.equals("Prime"))
            {
                bonus = 5;
            }
        }else if(product.equals("Fashion"))
        {
            bonus = 3;
        }else if(product.equals("Books"))
        {
            if(membership.equals("Prime"))
            {
                bonus = 5;
            }
        }else if(product.equals("Groceries"))
        {
            if(cartvalue > 300){
            bonus = 2;
            }
        }


        double totaldis = val + (ad + bonus);
        double finalprice = cartvalue *( 1- totaldis / 100);
        double savings = cartvalue - finalprice;



       System.out.println("Loyalty Tier: " + bd);
       System.out.println("Cart Value: $" + cartvalue);
       System.out.println("Product Category: " + product);
       System.out.println("Membership: " + membership);
        System.out.println("Base discount :"+val+"%");
        System.out.println("Additional Discount: "+(ad + bonus) + "%");
        System.out.println("Total Discount: "+totaldis + "%");
        System.out.println("Final Price: $"+finalprice);
        System.out.println("Savings: $"+savings);
    }

}
