package ConditionStatement;
import java.util.Scanner;

public class pb1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pr = sc.nextInt();
        int years = sc.nextInt();
        sc.nextLine(); 
        String departmentType = sc.nextLine();
        double baseSalary = sc.nextDouble();

        int bp = 0;
        String status = "Not Eligible";

        if (pr >= 3) {
            status = "Eligible";
            if (departmentType.equals("Critical")) {

                if (pr == 5 && years >= 5) {
                    bp = 25;
                } 
                else if (pr == 4 && years >= 10) {
                    bp = 22;
                } 
                else if (pr == 4) {
                    bp = 15;
                } 
                else if (pr == 3) {
                    bp = 10;
                }

            } else if (departmentType.equals("Non-Critical"))    {

                if (pr == 5) {
                    bp = 18;
                } 
                else if (pr == 4) {
                    bp = 12;
                } 
                else if (pr == 3) {
                    bp = 8;
                }
            }
        }
        double bonusAmount = baseSalary * bp / 100.0;

        System.out.println("Performance Rating: " + pr);
        System.out.println("Years of Service: " + years);
        System.out.println("Department: " + departmentType);
        System.out.println("Bonus Percentage: " + bp + "%");
        System.out.println("Bonus Amount: $" + bonusAmount);
        System.out.println("Status: " + status);
    }
}
