/*public class DSAday1 {

    static void print3largest(int arr[], int arr_size) {
        int i, first, second, third;

        if (arr_size < 3) {
            System.out.println("invalid input");
            return;
        }
        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];

            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third)
                third = arr[i];
        }
        System.out.println("three largest elements are" + first + " " + second + " " + third);
    }
        public static void main(String[] args){
            int arr[] = { 12,13,1,10,34,1};
            int n = arr.length;
            print3largest(arr, n);

        }
    }


 */

//Move all zeros to end of array
/*public class DSAday1{
    static void pushZerosToEnd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < n)
            arr[count++] = 0;
    }
        public static void main(String[]args){
            int arr[]= {1,2,0,4,3,0,5,0};
            int n = arr.length;
            pushZerosToEnd(arr,n);
            System.out.println("array after pushing zeros to back  ");
            for(int i =0; i<n; i++)
                System.out.println(arr[i] + " ");
        }


}

 */
// Java Program to move all zeros to the end
/*import java.util.*;

public class DSAday1 {
    public static void main(String[] args)
    {
        int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
        int n = A.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) {
                // Swap - A[j] , A[i]
                swap(A, j , i); // Partitioning the array
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " "); // Print the array
        }
    }

    // Utility function to swap two elements of an array
    public static void swap(int[] A, int a, int b)
    {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}

 */

// Java code to count the number of possible triangles using
// brute force approach
import java.io.*;
import java.util.*;

class GFG {

    // Function to count all possible triangles with arr[]
    // elements
    static int findNumberOfTriangles(int arr[], int n)
    {
        // Sort the array
        Arrays.sort(arr);
        // Count of triangles
        int count = 0;
        // The three loops select three different values
        // from array
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for (int k = j + 1; k < n; k++)
                    if (arr[i] + arr[j] > arr[k])
                        count++;
        return count;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        int size = arr.length;

        // Function call
        System.out.println(
                "Total number of triangles possible is "
                        + findNumberOfTriangles(arr, size));
    }
}


