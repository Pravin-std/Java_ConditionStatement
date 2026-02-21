package ConditionStatement;
import java.util.Scanner;
public class pb19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String mf = sc.nextLine();
    String st = sc.nextLine();
    String sect = sc.nextLine();
    String custype = sc.nextLine();

    double btp = 0.0;
    if(mf.equals("4DX")) btp = 12.00;
    else if(mf.equals("IMAX")) btp = 12.00;
    else if(mf.equals("2D")) btp = 12.00;
    else if(mf.equals("3D")) btp = 12.00;

    double fst = 0.0;
    if(mf.equals("4DX")) fst = 10.0;
    else if(mf.equals("IMAX")) fst = 8.0;
    else if(mf.equals("2D")) fst = 0.0;
    else if(mf.equals("3D")) fst = 5.0;

    double suf = 0.0;
    if(sect.equals("Standard")) suf = 0.0;
    else if(sect.equals("Premium")) suf = 4.0;
    else if(sect.equals("Recliner")) suf = 7.0;
    
    int tba = 0;
    if(st.equals("Matinee")) tba = -30;
    else if(st.equals("Evening")) tba = 0;
    else if(st.equals("Prime-Time")) tba = 20;
    else if(st.equals("Late-Night")) tba = -20;

    int cusdis = 0;
    if(custype.equals("Adult")) cusdis = 0;
    else if(custype.equals("Senior")) cusdis = 25;
    else if(custype.equals("Student")) cusdis = 15;
    else if(custype.equals("Child")) cusdis = 30;

    double bws = btp + fst + suf;
    double adjprice = bws * (1 + cusdis / 100.0);
    double finalprice = adjprice * (1-cusdis/100.0);

    String voc = "NO";
    if(st.equals("Matinee"))
        voc = "Yes";


    String cat = "Value";
    if(finalprice > 10)
    {
        cat = "Premium";
    }else if(finalprice > 30)
    {
        cat = "Luxury";
    }


    System.out.println("Movie Format: "+mf);
    System.out.println("Show Time: "+st);
    System.out.println("Seat Category: "+sect);
    System.out.println("Customer Type: "+custype);
    System.out.println("Base Ticket Price: $"+btp);
    System.out.println("Format Surcharge: $"+fst);
    System.out.println("Seat Upgrade Fee: $"+suf);
    System.out.println("Time-Based Adjustment: "+tba+"%");
    System.out.println("Customer Discount: "+cusdis+"%");
    System.out.println("Final Ticket Price: $"+finalprice);
    System.out.println("Concession Voucher: "+voc);
    System.out.println("Pricing Category: "+cat);







  }  
}
