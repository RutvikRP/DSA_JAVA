package dsa.Patterns;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int previousNum = 1;
        int currentNum = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print(1);
                } else if (i == 2) {
                    System.out.print(1);
                    System.out.print("\t");
                    continue;
                } else {
                    System.out.print(previousNum + currentNum);
                    System.out.print("\t");
                    int temp=currentNum;
                    currentNum=currentNum+previousNum;
                    previousNum=temp;
                }
            }
            System.out.println();
        }
    }
}
//        1
//        1	1
//        2	3 5
//        8	13 21 34
//        55 89	144	233	377