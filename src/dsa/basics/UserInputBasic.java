package dsa.basics;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class UserInputBasic {
    public static void main(String[] args) throws IOException {
        // ===== 1) Using Scanner (most common in beginners & DSA) =====
        Scanner sc = new Scanner(System.in);

        // (a) Integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        // (b) Double input
        System.out.print("Enter a decimal number: ");
        double d = sc.nextDouble();
        System.out.println("You entered: " + d);

        // (c) String (single word)
        System.out.print("Enter your name (single word): ");
        String name = sc.next(); // stops at space
        System.out.println("Hello, " + name);

        // (d) String (full line)
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("You wrote: " + sentence);

        // ===== 2) Array input using loop =====
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(arr));

        // ===== 3) Multiple values in one line =====
        System.out.print("Enter two numbers (space separated): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));

        // ===== 4) Character input =====
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // take first char of input
        System.out.println("You entered: " + ch);

        // ===== 5) Input validation (check type before reading) =====
        System.out.print("Enter an integer safely: ");
        if (sc.hasNextInt()) {
            int safeInt = sc.nextInt();
            System.out.println("Safe input = " + safeInt);
        } else {
            System.out.println("That’s not an integer!");
            sc.next(); // consume invalid token
        }

        // ===== 6) BufferedReader (faster for competitive coding) =====
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line using BufferedReader: ");
        String line = br.readLine(); // always reads String
        System.out.println("You entered: " + line);

        // Converting input manually
        System.out.print("Enter an integer using BufferedReader: ");
        int num2 = Integer.parseInt(br.readLine()); // parse String -> int
        System.out.println("You entered: " + num2);

        // ===== 7) Splitting input (common in CP/DSA) =====
        System.out.print("Enter numbers separated by spaces: ");
        String[] tokens = br.readLine().split(" ");
        int[] nums = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }
        System.out.println("Numbers = " + Arrays.toString(nums));

        // ===== 8) Reading until EOF (End of File) =====
        System.out.println("Enter multiple lines (Ctrl+D or Ctrl+Z to stop):");
        String s;
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            System.out.println("Read: " + s);
        }

        sc.close();
        br.close();
    }
}
