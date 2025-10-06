package dsa.Patterns;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=0;
        int st=n;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=sp;k++){
                System.out.print("\t");
            }
            if(i<(n/2)+1 && st!=n){
                for(int m=1;m<=st;m++){
                    if(m==1 || m==st){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }else{
                for(int j=1;j<=st;j++){
                    System.out.print("*\t");
                }
            }
            if(i<=n/2){
                sp=sp+1;
                st=st-2;
            }else{
                sp=sp-1;
                st=st+2;
            }
            System.out.println();
        }
    }
}
//          5
//          *	*	*	*	*
//              *		*
//                  *
//              *	*	*
//          *	*	*	*	*
