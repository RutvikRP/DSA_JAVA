package dsa.Patterns;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            for(int k=0;k<i;k++){
//                System.out.print("\t");
//            }
//            System.out.print("*\t");
//            System.out.println();
//        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
//  *
//      *
//          *
//              *
//                  *