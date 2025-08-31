/*
Problem: Conversion from Celsius to Fahrenheit
---------------------------------------------
Write a program to convert temperature from degree Celsius (C) to Fahrenheit (F).

Formula: F = (C × 9/5) + 32

Example:
Input  : 96
Output : 204.8F
*/

import java.util.Scanner;

class CelsiusToFahrenheit 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int celsius = sc.nextInt();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
      
        System.out.printf("%.1fF", fahrenheit);
    }
}
