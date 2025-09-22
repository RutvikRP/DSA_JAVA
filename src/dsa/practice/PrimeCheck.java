package dsa.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrimeCheckFun(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many no you want to enter : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Number " + i + " : ");
            nums[i - 1] = sc.nextInt();
        }
        List<Integer> result = new ArrayList<>();


        boolean isPrime = false;
        for (int num : nums) {
            isPrime = isPrimeCheckFun(num);
            if (isPrime) {
                result.add(num);
                System.out.println(num + " is PRIME");
            } else {
                System.out.println(num + " is NOT PRIME");
            }


        }

        System.out.println("All prime in entered " + n + " numbers is:" + result);
    }
}
