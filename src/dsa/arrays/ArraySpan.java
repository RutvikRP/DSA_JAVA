package dsa.arrays;

import java.util.Scanner;

public class ArraySpan {
    public static int findSpan(int[] arr){
        int span=0;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        span=max-min;
        return span;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        int [] arr={1,3,5,2,4,1,8,9,11};
        int span=findSpan(arr);
        System.out.println(span);
    }
}
