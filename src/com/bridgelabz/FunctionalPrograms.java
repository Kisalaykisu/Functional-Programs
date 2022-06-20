/* Q-2. Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.

*/


package com.bridgelabz;  //package

import java.util.Arrays;  //Import arrays
import java.util.Scanner; // Import Scanner

public class FunctionalPrograms {
    static void findTriplets(int[] arr, int n)  //Initialize with function with 2 parameters.
    {
        int numberOfDistinctTriples = 0;
        boolean found = false;     // Initialize condition
        for (int i=0; i<n-2; i++)     // Nested for loop
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    if (arr[i]+arr[j]+arr[k] == 0)
                    {
                        System.out.print(arr[i]+" ");  // 1st element
                        System.out.print(arr[j]+" ");  // 2nd element
                        System.out.print(arr[k]+" "+"\n"); //3rd element
                        numberOfDistinctTriples++;

                        found = true;
                    }
                }
            }
        }
        if (found == false) {
            System.out.println(" not exist ");
        }
        System.out.println("number of distinct triples = "+numberOfDistinctTriples);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Make Scanner Obj
        System.out.println("Enter no of integers in the array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Enter the integer values in the array: ");
        for (int i=0; i<N;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(array)); //TypeCasting

        findTriplets(array, N);  //Calling Function with 2 Parameters
    }

}

