package dsa.practice;

import java.util.Scanner;

public class RotateNumber {
//    1.optimal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter rotation k: ");
        int k = sc.nextInt();

        // Step 1: Find length of number
        int length = (num == 0) ? 1 : (int) Math.log10(Math.abs(num)) + 1;

        // Step 2: Normalize k (handle large k and negative k)
        k = ((k % length) + length) % length; // ensures 0 <= k < length

        // Step 3: Compute divisor and multiplier
        int div = (int) Math.pow(10, k);
        int mul = (int) Math.pow(10, length - k);

        // Step 4: Rotate
        int ans = ((num % div) * mul) + (num / div);

        System.out.println("Rotated Number: " + ans);
    }
//    2.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int num=sc.nextInt();
//        System.out.println("enter Where to rotate :");
//        int k=sc.nextInt();
//
////        1234567
////        k=3
//        int lenght=1;
//        int temp=num;
//        while (temp/10>0){
//            lenght++;
//            temp=temp/10;
//        }
//        //for optimization
//
//        if(k>lenght){
//            k=k%lenght;
//        }
//        if(k<0){
//            k= lenght-k;
//        }
//        //num%div*mul+num/div
//        //div=1000,mul=10000,ans=numdiv*mul+
//        int div=1;
//        int mul=1;
//        int i=1;
//        while(i<=k){
//            div=div*10;
//            i++;
//        }
//        i=1;
//        while(i<=lenght-k){
//            mul=mul*10;
//            i++;
//        }
//        int ans=((num%div)*mul)+(num/div);
//        System.out.println("Rotate Number:");
//        System.out.println(ans);
//    }
}
