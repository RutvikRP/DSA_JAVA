package dsa.arrays;

import java.util.Scanner;

public class FindElement {
    public static int elementIndex(int[] arr,int ele){
        for(int i=0;i<arr.length;i++){
            if(ele==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("Enter element which index you need : ");
        int f=sc.nextInt();
        int index=elementIndex(arr,f);
        System.out.println(index);
    }
}
