/* Q-5. Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:

Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).

*/


package com.bridgelabz;  //package

import java.util.Scanner; // Import Scanner

public class FunctionalPrograms {
    public static void main(String[] args) {   //Entry Point of Program

            int[] arr=UserInput();  //TAke input choice
            int t = arr[0]; //Array initializer
            int v = arr[1];

            while(t>50 || v>120 || v<3){

                arr=UserInput();
                t = arr[0];
                v = arr[1];
            }
            double w = 35.74 + 0.6215*t + (0.4275*t+35.75)*Math.pow(v,0.16);
            System.out.println("The WindChill is : " + w);
        }
        public static int[] UserInput(){

            Scanner scanner = new Scanner(System.in);  //Make Scanner obj
            System.out.println("Enter temperature in F and wind speed in mph : ");
            int t = scanner.nextInt();  //Input Int
            int v = scanner.nextInt();
            int[] arr = new int[2];   // array declaration and initialization
            arr[0]=t;
            arr[1]=v;
            return arr;
        }

}


