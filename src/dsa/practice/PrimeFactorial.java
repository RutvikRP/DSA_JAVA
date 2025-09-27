package dsa.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorial {
    //    24
//    2 12
//    2 6
//    2 3
//    1 3
    public static ArrayList<Integer> getPrimeFactorial(int num) {
        int divider = 2;
        ArrayList<Integer> resultList = new ArrayList<>();
        while (divider * divider<=num) {
            while (num % divider == 0) {
                resultList.add(divider);
                num = num / divider;
            }
            divider++;
        }
        if(num>1){
            resultList.add(num);
        }
        return resultList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> ansList = getPrimeFactorial(num);
        System.out.println(ansList);
    }
}
