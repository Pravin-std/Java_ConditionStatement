package ConditionStatement;
import java.util.Scanner;

public class pb2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int creditScore = sc.nextInt();
        double annualincome = sc.nextDouble();
        double ratio = sc.nextDouble();
        sc.nextLine();
        String Loantype = sc.nextLine();

        String type;

        if (creditScore >= 750)
            type = "Excellent";
        else if (creditScore >= 700)
            type = "Good";
        else if (creditScore >= 650)
            type = "Fair";
        else
            type = "Poor";

        String val;

        if (ratio <= 30)
            val = "Low";
        else if (ratio >= 31 && ratio <= 40)
            val = "Moderate";
        else
            val = "High";

        String loan = "Rejected";
        double loanamt = 0.0;

        if (creditScore < 600 || ratio > 50) {
            loan = "Rejected";
        }
        else {
            if (Loantype.equals("Home")) {

                if (type.equals("Excellent") && val.equals("Low")) {
                    loan = "Approved";
                    loanamt = annualincome * 4;
                }
                else if ((type.equals("Good") && val.equals("Moderate")) ||
                         (type.equals("Fair") && val.equals("Moderate"))) {
                    loan = "Needs Review";
                    loanamt = annualincome * 3;
                }
            }

            else if (Loantype.equals("Personal")) {

                if (type.equals("Excellent") && val.equals("Low")) {
                    loan = "Approved";
                    loanamt = annualincome * 1;
                }
                else if (type.equals("Fair") && val.equals("Moderate")) {
                    loan = "Needs Review";
                    loanamt = annualincome * 0.5;
                }
            }

            else if (Loantype.equals("Business")) {

                if ((type.equals("Excellent") || type.equals("Good")) &&
                    (val.equals("Low") || val.equals("Moderate"))) {

                    loan = "Approved";
                    loanamt = annualincome * 3;
                }
            }
        }
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualincome);
        System.out.println("Debt-to-Income Ratio: " + ratio + "%");
        System.out.println("Loan Type: " + Loantype);
        System.out.println("Decision: " + loan);
        System.out.println("Maximum Loan Amount: $" + loanamt);
    }
}
