package dsa.arrays;

import java.util.Scanner;

public class GcdAndLcm {
    public static int getGCD(int num1, int num2) {
        while (num2 != 0) {
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        return num1;
    }

    public static int getLCM(int num1, int num2, int gcm) {
        return (num1 * num2) / gcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcm = getGCD(num1, num2);
        int lcm = getLCM(num1, num2, gcm);

        System.out.println("GCM : " + gcm);
        System.out.println("LCM : " + lcm);


    }
}
