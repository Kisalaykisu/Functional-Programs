/* Q-4). Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)

*/


package com.bridgelabz;  //package

import java.util.Scanner; // Import Scanner

public class FunctionalPrograms {
    public static void main(String[] args){   //Entry Point of Program

        Scanner scanner = new Scanner(System.in);  //mAKE Scanner obj
        System.out.println("Enter the coefficients a,b,c of the quadratic equation : ");
        int a = scanner.nextInt();  // Input Int
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double delta = b*b - 4*a*c;
        double root1 = (-b + Math.sqrt(delta))/(2*a);  //Quadratic Equation
        double root2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("The roots are: " +root1+ " and "+ root2);

    }

}

