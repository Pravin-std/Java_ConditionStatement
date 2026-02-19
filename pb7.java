package ConditionStatement;
import java.util.Scanner;
public class pb7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        sc.nextLine();
        String bp = sc.nextLine();
        Double temp = sc.nextDouble();
        sc.nextLine();
        String sym = sc.nextLine();

        String[] parts = bp.split("/");
        int systolic = Integer.parseInt(parts[0]);
        int diastolic = Integer.parseInt(parts[1]);

        String priority = "";
        int waitTime = 0;
        String action = "";

        if (hr < 50 || hr > 130 || systolic > 180 || systolic < 90 ||temp > 103 || temp < 96 || sym.equalsIgnoreCase("Life-Threatening")) {

            priority = "Critical";
            waitTime = 0;
            action = "Immediate Emergency Care";
        }



 else if ((hr >= 50 && hr <= 60) || (hr >= 110 && hr <= 130) ||
                (systolic >= 160 && systolic <= 180) ||
                (systolic >= 90 && systolic <= 100) ||
                (temp >= 101 && temp <= 103) ||
                (temp >= 96 && temp <= 97) ||
                sym.equalsIgnoreCase("Severe")) {

            priority = "Urgent";

            if (hr < 60 || systolic < 100)
                waitTime = 20;
            else
                waitTime = 15;

            action = "Priority Medical Attention";
        }

        else if (sym.equalsIgnoreCase("Moderate")) {
            priority = "Standard";
            waitTime = 45;
            action = "Standard Examination";
        }

        else {
            priority = "Non-Urgent";
            waitTime = 90;
            action = "Routine Check-up";
        }

        System.out.println("Heart Rate: " + hr + " bpm");
        System.out.println("Blood Pressure: " + bp);
        System.out.println("Temperature: " + temp + "°F");
        System.out.println("Symptom Severity: " + sym);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);

    }
}


    
