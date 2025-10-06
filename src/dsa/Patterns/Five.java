package dsa.Patterns;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i=i-2){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i+1;j++){
                if(j%2==0){
                    System.out.print(" * ");
                }else{
                System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=n-2;i>0;i=i-2){
            for(int k=0;k<n-i+1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                if(j%2==0){
                    System.out.print(" * ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
//                *
//              * * *
//            * * * * *
//              * * *
//                *
