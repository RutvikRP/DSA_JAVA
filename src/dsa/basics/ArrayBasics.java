package dsa.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Declaration & Initialization
        int[] arr1 = new int[5];                 // default values = 0
        int[] arr2 = {1, 2, 3, 4, 5};            // initialized directly

        System.out.println("arr1 (default values): " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        // 2. Taking input into an array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(arr));

        // 3. Accessing elements
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[n - 1]);

        // 4. Traversing an array
        System.out.print("Using for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Using for-each loop: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 5. Common operations
        int sum = 0, max = arr[0], min = arr[0];
        for (int x : arr) {
            sum += x;
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max + ", Min = " + min);

        // 6. Array utilities
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int key = arr[0]; // take first element as key for demo
        int index = Arrays.binarySearch(arr, key);
        System.out.println("Binary search for " + key + " → index: " + index);

        // 7. Copying arrays
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        // 8. Multidimensional arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        sc.close();
    }
}
