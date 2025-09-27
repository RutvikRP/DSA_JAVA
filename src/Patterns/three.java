package Patterns;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int k=0;k<i-1;k++){
                System.out.print("\t");
            }
            for (int j=n;j>=i;j--){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
