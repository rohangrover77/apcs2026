/**
 * Write a description of class LedgerProcessor here.
 *
 * Rohan Grover
 * 9/30/2026
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class LedgerProcessor
{
    //Adding throws allows Java to handle an error
    public static void main(String[] args) throws FileNotFoundException
    {
        //Connet Scanner to an external file
        //The file MUST be in the same folder as the project
        File dataFile = new File("transactions.txt");
        Scanner fileScan = new Scanner(dataFile);
        
        NumberFormat money = NumberFormat.getCurrencyInstance();    
    
        //Counter and accumulator vars
        int count = 0;
        double totalSales = 0.0;
        
        System.out.println("=== Daily Transaction Ledger ===");
        
        //The loop will run while there is another line in the file
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            double price = Double.parseDouble(line); //Convert a string to a double
            
            //Update out counter and accumlator
            count++;
            totalSales += price;
            
            System.out.println("Transaction #" + count + ": " + money.format(price));
        }
        
        //Always close file streams when finished
        fileScan.close();
        
        double averageSales = totalSales / count;
        
        System.out.println("Total Items Sold: " + count);
        System.out.println("Total Revenue: " + money.format(totalSales));
        System.out.println("Average Transaction: " + money.format(averageSales));
    }
}