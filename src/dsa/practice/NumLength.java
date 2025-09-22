package dsa.practice;

import java.util.Scanner;

public class NumLength {
    //  1.  public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter num");
//        int numInt=sc.nextInt();
//        String numStr=String.valueOf(numInt);
//        System.out.println(numStr.length());
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int numInt = sc.nextInt();
        int length=0;
        if(numInt==0) length=1;
        while(numInt>0){
            numInt=numInt/10;
            length++;
        }
        System.out.println(length);
    }
//    if (num == 0) {
//        digits = 1;
//    } else {
//        long absN = Math.abs((long) num);            // handles Integer.MIN_VALUE safely
//        digits = (int) Math.floor(Math.log10(absN)) + 1; // avoids rounding surprises
//    }
}
