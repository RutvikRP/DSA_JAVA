package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int length = arr1.length > arr2.length ? arr1.length : arr2.length;
        int[] ansArr = new int[length];
        int a1Length = arr1.length-1;
        int a2Length = arr2.length-1;
        int q = 0;
        for (int k = length-1; k >= 0; k--) {
            int a1 = 0;
            int a2 = 0;
            if (a1Length >= 0) {
                a1 = arr1[a1Length];
                a1Length--;
            }
            if (a2Length >= 0) {
                a2 = arr2[a2Length];
                a2Length--;
            }
            ansArr[k]=(a1+a2+q)%10;
            q=(a1+a2+q)/10;
        }
        System.out.println("sum");
        if(q!=0){
            System.out.println(q);
        }
        for(int v:ansArr){
            System.out.println(v);
        }
    }
}
























































