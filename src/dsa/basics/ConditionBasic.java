package dsa.basics;

import java.util.Scanner;

public class ConditionBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== 1) if statement =====
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {  // condition must be boolean
            System.out.println("You are an adult.");
        }

        // ===== 2) if-else =====
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        // ===== 3) if-else if-else =====
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        // ===== 4) Nested if =====
        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();

        if (salary > 50000) {
            if (salary > 100000) {
                System.out.println("You are rich!");
            } else {
                System.out.println("You earn well.");
            }
        } else {
            System.out.println("Keep working hard.");
        }

        // ===== 5) Ternary Operator (short form of if-else) =====
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);

        // ===== 6) switch statement (Java 7+ supports String too) =====
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // exit switch
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // if none matches
                System.out.println("Invalid day number");
        }

        // ===== 7) switch expression (Java 14+ feature) =====
        // cleaner, no break needed
        System.out.print("Enter grade (A/B/C): ");
        String grade = sc.next();

        String feedback = switch (grade) {
            case "A" -> "Excellent!";
            case "B" -> "Good job!";
            case "C" -> "Keep improving!";
            default -> "Invalid grade";
        };
        System.out.println(feedback);

        sc.close();
    }
}
