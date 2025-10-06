package dsa.Patterns;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int space=2*n-3;
//        int value=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            for(int k=1;k<=space;k++){
                System.out.print("\t");
            }
            for(int m=i;m>=1;m--){
                if(m==n){
                    continue;
                }
                System.out.print(m+"\t");
            }
            space=space-2;
            System.out.println();
        }
    }
}
//Output
//        n=7
//        1												1
//        1	 2										2	1
//        1	 2	3								3	2	1
//        1	 2	3	4						4	3	2	1
//        1	 2	3	4	5				5	4	3	2	1
//        1	 2	3	4	5	6		6	5	4	3	2	1
//        1	 2	3	4	5	6	7	6	5	4	3	2	1