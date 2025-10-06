package dsa.Patterns;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int value=1;
            for(int j=0;j<=i;j++){
                System.out.print(value+"\t");
//                (i)C(j+1)=(i)C(j)*(i-j)/(j+1);
                value=value*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
//        1
//        1 1
//        1	2 1
//        1	3 3	1
//        1	4 6	4 1