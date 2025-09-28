package Patterns;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int os=n/2;
        int is=-1;
        for(int i=1;i<=n;i++){
            for(int j=os;j>=1;j--){
                System.out.print("\t");
            }

            System.out.print("*\t");
            if(i!=1 && i!=n){
                for(int k=1;k<=is;k++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                os=os-1;
                is = is+2 ;
            }else{
                os=os+1;
                is=is -2;
            }
        }
    }
}
