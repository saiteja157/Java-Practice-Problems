/*Conversion from kg to grams

write a program to convert kg values into gram values?

Constraints:
Input : First line of input contains a decimal value represent weight in kgs

Output : Print weight in grams

Example:
Input : 5.6

Output : 5600 Grams

Explanation:
in the above example we have to convert the 5.6kg to grams so you have to print 5600Grams.*/

Code : 
import java.util.Scanner;

class Main
{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        double kg = sc.nextDouble();
        
        int grams = (int)(kg * 1000);
        
        System.out.print(grams + " Grams");
        
        
    }
}
