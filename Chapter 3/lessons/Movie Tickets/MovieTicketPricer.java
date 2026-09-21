/**
 * Write a description of class MovieTicketPricer here.
 *
 * Rohan Grover
 * 9/21/2026
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class MovieTicketPricer
{
    public static void main(String[] args){
        // Create constant variables
        // A constant variable CAN'T be changed
        final double REGULAR_PRICE = 12.50;
        final double DISCOUNT_PRICE = 8.00;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("---Movie Ticket Calculator---");
        System.out.print("Enter the customer's age: ");
        int age = scan.nextInt();
        
        // Set matinee to true if the user enters "y"
        System.out.print("Is this matinee showtime? (y/n)" );
        String isMatinee = scan.next();
        boolean matinee = false;
        if (isMatinee.toLowerCase().equals("y")){
            matinee = true;
        }
        
        // Set pass to true if the user enters "y"
        System.out.print("Does the customer have a pass? (y/n)" );
        String hasPass = scan.next();
        boolean pass = hasPass.toLowerCase().equals("y");
        
        double ticketPrice;
        
        // Discount applies if <13, >= 65 OR its a matinee and they have a pass
        if (age < 13 || age >= 65 || (matinee && pass)) {
            ticketPrice = DISCOUNT_PRICE;
            System.out.println("Status: Discount Applied!");
        }
        else {
            ticketPrice = REGULAR_PRICE;
            System.out.println("Status: Regular Rate Applied");
            
        
        }
        System.out.println("Total Due: " + money.format(ticketPrice));
    }
}