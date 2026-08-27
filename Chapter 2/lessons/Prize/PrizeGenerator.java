/**
 * Generate a random cash prize.
 *
 * Rohan Grover
 * Date Modified: 8/27/2026 
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class PrizeGenerator
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("Welcome to the APSCA Prize Simulator");
        System.out.println("------------------------------------");
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        
        System.out.print("How much money do you have: $");
        double startBalance = scan.nextDouble(); 
        
        // Generate a random cash prize from $10 - $100
        // Math.random generates a number between 0 (inclusive) and 1 (exculsive)
        // (Math.random() * 91) generates a number between 0 and 90.9999999999999
        // (int)(Math.random() * 91) generates a number 0 and 90
        // 10 + (int)(Math.random() * 91) generates a number between 10 and 90
        int prizeAmount = 10 + (int)(Math.random() * 91);   
        
        // Generate a random fee between $1 and $5
        int fee = 1 + (int)(Math.random() * 5);
        
        // int values are automatically promoted to double
        // this is allowed because no information is lost
        
        double finalBalance = startBalance + prizeAmount - fee;
        
        System.out.println("\n Congratulations " + name + "! Here is your statement");
        System.out.println("=================================================");
        
        System.out.printf("%-25s %s%n", "Starting Balance", money.format(startBalance));
        System.out.printf("%-25s %s%n", "Prize Money ", money.format(prizeAmount));
        System.out.printf("%-25s %s%n", "Processing Fee", money.format(fee));
        System.out.println("----------------------------------------");
        System.out.printf("%-25s %s%n", "Final Balance", money.format(finalBalance));
        System.out.println("=================================================");    
        
    }    
}