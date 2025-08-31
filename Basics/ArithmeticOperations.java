/*
perform Addition, Subtraction, Multiplication and Division by using Switch condition.(+ , - , * , /, %)?
Write a program to perform Addition, Subtraction, Multiplication and Division of 2 Numbers based on the user inputs by using Switch condition.(+ , - , * , /, %).

Constraints:
Input : First line of input contains an Integer 
        Second line of input contains an Integer 
        Third line of Input Consists of Operator

Output : Print Respective Output.

Constraints : Operators Must accept only one of this Operators( +, -, *, /, % ) only.

Example:
Input  :  30
          10
          +
Output :  40 
*/

import java.util.Scanner;

class Main
{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        char operators = sc.next().charAt(0);
        
        switch(operators){
            case '+':
                System.out.println(n + n1);
                break;
            case '-':
                System.out.println(n - n1);
                break;
            case '*':
                System.out.println(n * n1);
                break;
            case '/':
                System.out.println(n / n1);
                break;
            case '%':
                System.out.println(n % n1);
                break;
            default:
                System.out.println("Invalid Operator");
                
        }
    }
}
