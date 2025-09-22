import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        int nn=5;
//        for(int i=0;i<nn;i++){
//            for(int j=i;j<nn;j++){
//                System.out.print(" ");
//            }
//            for (int k=0;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//       for(int i=1;i<=nn;i++){
//           for(int j=1;j<=nn-i;j++){
//               System.out.print(" ");
//           }
//           for(int k=1;k<=2*i-1;k++){
//               System.out.print("*");
//           }
//           System.out.println();
//       }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        boolean f=false;
//        if(n%2==0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
//        prime number
//        if (n == 0 || n == 1 || n == 2) {
//            System.out.println("Not prime 0,1,2");
//        } else {
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    f=true;
//                    System.out.println("Not prime");
//                    break;
//                }
//            }
//            if(!f){
//                System.out.println("prime");
//            }
//        }
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String line=bufferedReader.readLine();
        String[] numString=line.split(" ");
        int[] numInt=new int[numString.length];
        for (int i=0;i<numString.length;i++){
        numInt[i]=Integer.parseInt(numString[i]);
        }
        System.out.println("Array:"+ Arrays.toString(numInt));
    }
}