/*  Q-1.) 2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.
*/



package com.bridgelabz;   //Package

import java.util.Arrays;    // import Array
import java.util.Scanner;   // import Scanner


public class FunctionalPrograms {
    public static void main(String[] args){  // Entry point of Program

        Scanner scanner = new Scanner(System.in);  // Initialize Scanner Obj
        System.out.println("Enter the number of rows and columns of 2D array: ");
        int x=scanner.nextInt();  // Input int
        int y= scanner.nextInt();

        int[][] arr = new int[x][y];

        System.out.println("Enter the " + x*y + " items of the 2D array");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        for (int k=0;k<y;k++)
            System.out.println(Arrays.toString(arr[k]));  //typecasting

    }
}
