package dsa.Patterns;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        for(int i=0;i<n;i++){
//            for(int k=i;k<n-1;k++){
//                System.out.print("\t");
//            }
//            System.out.print("*\t");
//            System.out.println();
//        }
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
                System.out.println();
        }
    }
}

//	                *
//              *
//          *
//      *
//  *