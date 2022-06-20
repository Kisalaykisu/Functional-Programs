/* Q-3. Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

*/


package com.bridgelabz;  //package

import java.util.Scanner; // Import Scanner

public class FunctionalPrograms {
    public static void main(String[] args){   //Entry Point of Program

        Scanner scanner = new Scanner(System.in);   // Make Scanner Obj
        System.out.println("Enter the co-ordinates x,y: ");
        int x = scanner.nextInt();  // Input Int
        int y = scanner.nextInt();

        double distance = Math.sqrt(x*x+y*y);  //Mathematical Formula
        System.out.println("The Euclidean Distance of the point from origin is = "+ distance);


    }

}

