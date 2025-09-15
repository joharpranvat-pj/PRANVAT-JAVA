package com.pranvat.day38;
import java.util.*;

public class UserMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered.");
            return;
        }

        System.out.println("Using if-else:");
        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Very Good");
        } else if (marks >= 50) {
            System.out.println("Good");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println("Using switch:");
        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
            case 7:
                System.out.println("Very Good");
                break;
            case 6:
            case 5:
                System.out.println("Good");
                break;
            case 4:
            case 3:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
                break;
        }

        sc.close();
    }
}
