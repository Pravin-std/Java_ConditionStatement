package ConditionStatement;

import java.util.Scanner;

public class pb20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int storageCapacity = sc.nextInt();
        int userCount = sc.nextInt();
        sc.nextLine();
        String backupFrequency = sc.nextLine();
        String supportTier = sc.nextLine();

        double baseStorageCost = 0;

        if (storageCapacity <= 100) {
            baseStorageCost = storageCapacity * 0.05;
        } 
        else if (storageCapacity <= 500) {
            baseStorageCost = (100 * 0.05) + (storageCapacity - 100) * 0.04;
        } 
        else if (storageCapacity <= 2000) {
            baseStorageCost = (100 * 0.05) + (400 * 0.04) + (storageCapacity - 500) * 0.03;
        } 
        else {
            baseStorageCost = (100 * 0.05) + (400 * 0.04) + (1500 * 0.03) + (storageCapacity - 2000) * 0.02;
        }

        double perUserFee = 0;

        if (userCount <= 10) {
            perUserFee = userCount * 5;
        } 
        else if (userCount <= 50) {
            perUserFee = userCount * 4;
        } 
        else {
            perUserFee = userCount * 3;
        }

        double backupPremium = 0;

        if (backupFrequency.equals("Daily")) {
            backupPremium = 0;
        } 
        else if (backupFrequency.equals("Hourly")) {
            backupPremium = 15 + (0.5 * userCount);
        } 
        else if (backupFrequency.equals("Real-Time")) {
            backupPremium = 50 + (1 * userCount);
        }

        double supportFee = 0;

        if (supportTier.equals("Community")) {
            supportFee = 0;
        } 
        else if (supportTier.equals("Standard")) {
            supportFee = 20;
        } 
        else if (supportTier.equals("Priority")) {
            supportFee = 75;
        } 
        else if (supportTier.equals("Enterprise")) {
            supportFee = 200;
        }

        double monthly = baseStorageCost + perUserFee + backupPremium + supportFee;
        double annual = monthly * 12 * 0.9;

        String recommendedPlan = "";
        String features = "";

        if (userCount == 1) {
            recommendedPlan = "Personal";
            features = "Basic storage, file sync";
        } 
        else if (userCount <= 20) {
            recommendedPlan = "Team";
            features = "Version history, file sharing, basic analytics";
        } 
        else if (userCount <= 100) {
            recommendedPlan = "Business";
            features = "Advanced sharing, team analytics, priority support";
        } 
        else {
            recommendedPlan = "Enterprise";
            features = "Advanced security, compliance tools, dedicated support, API access";
        }

        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("User Count: " + userCount);
        System.out.println("Backup Frequency: " + backupFrequency);
        System.out.println("Support Tier: " + supportTier);
        System.out.println("Base Storage Cost: $" + baseStorageCost);
        System.out.println("Per-User Fee: $" + perUserFee);
        System.out.println("Backup Premium: $" + backupPremium);
        System.out.println("Support Fee: $" + supportFee);
        System.out.println("Monthly Subscription: $" + monthly);
        System.out.println("Annual Subscription: $" + annual + " (save 10%)");
        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Included Features: " + features);
    }
}
