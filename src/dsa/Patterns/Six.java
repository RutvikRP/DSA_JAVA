package dsa.Patterns;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n+2;i>1;i=i-2){
            for(int j=0;j<i/2;j++){
                System.out.print("*");
            }
            for(int k=0;k<(n+2)-(2*(i/2));k++){
                System.out.print(" ");
            }
            for(int m=0;m<i/2;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i<=n+2;i=i+2){
            for(int j=0;j<i/2;j++){
                System.out.print("*");
            }
            for(int k=0;k<(n+2)-(2*(i/2));k++){
                System.out.print(" ");
            }
            for(int m=0;m<i/2;m++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
//        *** ***
//        **   **
//        *     *
//        **   **
//        *** ***