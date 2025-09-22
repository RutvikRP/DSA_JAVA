package dsa.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
   //   1.  public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number : ");
//        int n=sc.nextInt();
//        ArrayList<Integer> list=new ArrayList<>();
//        for(int i=0;i<=n;i++){
//            if(i<=1){
//                list.add(1);
//            }else {
//                list.add(list.get(i-2)+list.get(i-1));
//            }
//        }
//        System.out.println("Fibonacci Series to "+n+" : "+list);
//    }
    //2.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
