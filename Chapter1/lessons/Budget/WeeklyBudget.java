/**
 * Weekly Budget
 * Rohan Grover
 * Last Updated: 8-21-2026
 */

import java.util.Scanner;

public class WeeklyBudget
{
    // Calculate weelky lunch spending and remaining money
    public static void main(String[] args){
        String name; 
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
        // Instantiate the Scanner object to read from the keyboard
        Scanner scan = new Scanner(System.in);
        
        //Read a String (Object)
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        //Read doubles (floating point number)
        System.out.print("Enter your weekly allowance: $");
        allowance = scan.nextDouble();
        
        System.out.print("Enter the price of one school lunch: $");
        lunchPrice = scan.nextDouble();
        
        //Read an integer
        System.out.print("Enter the number of school lunches you ordered this week");
        lunchesPerWeek = scan.nextInt();
    }
}