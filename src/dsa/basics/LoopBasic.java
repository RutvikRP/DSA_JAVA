package dsa.basics;

import java.util.Arrays;

public class LoopBasic {
    public static void main(String[] args) {
        // ===== 1) for loop =====
        System.out.println("For loop from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ===== 2) while loop =====
        System.out.println("While loop from 1 to 5:");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println("\n");

        // ===== 3) do-while loop =====
        System.out.println("Do-While loop (runs at least once):");
        int k = 6;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5); // condition is false but loop runs once
        System.out.println();

        // ===== 4) Enhanced for-each loop (arrays/collections) =====
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println("For-each loop:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // ===== 5) Nested loops =====
        System.out.println("Nested loop example (Multiplication Table up to 3x3):");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // ===== 6) Pattern Printing =====
        System.out.println("Pattern: Right Triangle of *");
//        Pattern: Right Triangle of *
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *


        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern: Inverted Triangle of *");
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern: Pyramid");
        for (int row = 1; row <= n; row++) {
            // spaces
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            // stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // ===== 7) break and continue =====
        System.out.println("Break Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break; // exits loop completely
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Continue Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // skip iteration
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ===== 8) Infinite loop (careful!) =====
        System.out.println("Infinite loop with break condition:");
        int count = 1;
        while (true) {
            if (count > 5) break;
            System.out.print(count + " ");
            count++;
        }
        System.out.println("\n");

        // ===== 9) Labeled break/continue (Advanced) =====
        System.out.println("Labeled break example:");
        outerLoop:
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                if (a == 2 && b == 2) break outerLoop; // break outer loop
                System.out.println("a=" + a + ", b=" + b);
            }
        }
        System.out.println();

        System.out.println("Labeled continue example:");
        outer:
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                if (b == 2) continue outer; // skip to next outer loop
                System.out.println("a=" + a + ", b=" + b);
            }
        }
        System.out.println();

        // ===== 10) Looping with Arrays/Strings =====
        String str = "Java";
        System.out.println("Looping over String characters:");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println("\n");

        System.out.println("Enhanced for loop on String chars:");
        for (char ch : str.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\n");

        // ===== 11) Advanced: Streams (Java 8+) =====
        System.out.println("Using Java 8 streams to loop:");
        Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
