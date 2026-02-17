
package ConditionStatement;
import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int age = sc.nextInt();
        sc.nextLine(); 
        String smokingStatus = sc.nextLine();
        String preExisting = sc.nextLine();
        String coverageTier = sc.nextLine();

        double basePremium = 0;
        double riskSurcharge = 0;

 
        if (age >= 18 && age <= 30) { 

            if (coverageTier.equals("Basic"))
                basePremium = 200;
            else if (coverageTier.equals("Standard"))
                basePremium = 300;
            else if (coverageTier.equals("Premium"))
                basePremium = 500;

        } 
        else if (age >= 31 && age <= 50) { 

            if (coverageTier.equals("Basic"))
                basePremium = 250;
            else if (coverageTier.equals("Standard"))
                basePremium = 350;
            else if (coverageTier.equals("Premium"))
                basePremium = 600;

        } 
        else if (age >= 51 && age <= 65) { 

            if (coverageTier.equals("Basic"))
                basePremium = 350;
            else if (coverageTier.equals("Standard"))
                basePremium = 450;
            else if (coverageTier.equals("Premium"))
                basePremium = 700;

        } 
        else if (age >= 66) { 

            if (coverageTier.equals("Basic"))
                basePremium = 400;
            else if (coverageTier.equals("Standard"))
                basePremium = 550;
            else if (coverageTier.equals("Premium"))
                basePremium = 800;
        }

        if (smokingStatus.equals("Smoker") && preExisting.equals("Yes")) {
            riskSurcharge = basePremium * 0.70;
        } 
        else if (smokingStatus.equals("Smoker")) {
            riskSurcharge = basePremium * 0.40;
        } 
        else if (preExisting.equals("Yes")) {
            riskSurcharge = basePremium * 0.30;
        } 
        else {
            riskSurcharge = 0;
        }
        double totalPremium = basePremium + riskSurcharge;

        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smokingStatus);
        System.out.println("Pre-existing Conditions: " + preExisting);
        System.out.println("Coverage Tier: " + coverageTier);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Risk Surcharge: $" + riskSurcharge);
        System.out.println("Total Monthly Premium: $" + totalPremium);

        sc.close();
    }
}
