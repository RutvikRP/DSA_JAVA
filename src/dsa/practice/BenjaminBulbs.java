package dsa.practice;

import java.util.Scanner;

public class BenjaminBulbs {
//    1.
//    public static int findNumberOfBulbOn(int nob){
//        int person=1;
//        int factor =0;
//        int onBulb=0;
//        for(int i=1;i<=nob;i++){
//            factor=0;
//            for(int j=1;j*j<=i;j++){
//                if(i%j==0){
//                    factor++;
//                    if(i/j!=j){
//                        factor++;
//                    }
//                }
//
//            }
//            if(factor%2==1){
//                System.out.println("Bulb "+i+" is on");
//                onBulb++;
//            }
//        }
//        return onBulb;
//    }
//    2.
    public static int findNumberOfBulbOn(int nob){
        int onBulb=0;
        for(int i=1;i*i<=nob;i++){
            System.out.println("Bulb "+i*i+" is on");
            onBulb++;
        }
        return onBulb;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfBulb=sc.nextInt();
        int onBulb=findNumberOfBulbOn(numberOfBulb);
        System.out.println(onBulb);
    }
}
