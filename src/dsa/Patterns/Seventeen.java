package dsa.Patterns;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int st=1;
        for(int i=1;i<=n;i++){
            if(i!=n/2+1){
                for(int k=1;k<=n-(n/2+1);k++){
                    System.out.print("\t");
                }
                for (int j = 1; j <= st; j++) {
                    System.out.print("*\t");
                }
            }else{
                for(int m=1;m<=n;m++){
                    System.out.print("*\t");
                }
            }
            if(i<=n/2){
                st++;
            }else{
                st--;
            }
            System.out.println();
        }
    }
}
//        9
//         *
//         * *
//         * * *
//         * * * *
// * * * * * * * * *
//         * * * *
//         * * *
//         * *
//         *