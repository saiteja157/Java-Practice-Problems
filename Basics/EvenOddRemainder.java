/*
Case Study

Write a program to perform all these tasks:
a. Store a number in a variable
b. If value is not in range (100-1000) prints WRONG NUMBER else follows the steps
c. Check even or odd
d. If even divide the number by 3 and print the remainder
e. If odd divide the number by 2 and print the remainder.

Constraints:
Input : First line of input contains an Integer n represent number

Example:
Input :   498
Output :  0

Explanation:
In the above example number is in range of 100-1000 and it is even, 
so we divide with 3 and print remainder 0
*/


import java.util.Scanner;

class NumberCheck 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 100 || n > 1000) {
            System.out.println("WRONG NUMBER");
        } 
        else if (n % 2 == 0) { //for even number
            System.out.println(n % 3);
        } 
        else {  //for even number
            System.out.println(n % 2);  
        }
    }
}

