package dsa.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums= Arrays.stream(sc.nextLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        if((nums[0]*nums[0])+(nums[1]*nums[1])==(nums[2]*nums[2])){
            System.out.println(true);
        }else if((nums[1]*nums[1])+(nums[2]*nums[2])==(nums[0]*nums[0])){
            System.out.println(true);
        }else if((nums[0]*nums[0])+(nums[2]*nums[2])==(nums[1]*nums[1])){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
