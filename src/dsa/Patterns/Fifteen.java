package dsa.Patterns;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n/2;
        int innerCount=1;
        int value=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++){
                System.out.print("\t");
            }
            int columnValue=value;
            for (int j=1;j<=innerCount;j++){
                System.out.print(columnValue + "\t");
                if(j<=innerCount/2){
                    columnValue++;
                }else {
                    columnValue--;
                }
            }
            if(i<=n/2){
                space=space-1;
                innerCount=innerCount+2;
                value++;
            }else{
                space=space+1;
                innerCount=innerCount-2;
                value--;
            }
            System.out.println();
        }
    }
}
//          1
//        2	3 2
//      3 4 5 4	3
//        2	3 2
//          1