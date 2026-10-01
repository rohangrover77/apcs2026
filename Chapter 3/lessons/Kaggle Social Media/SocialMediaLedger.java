/**
 * Write a description of class KaggleProgram here.
 *
 * Rohan Grover & Adith Bhartur
 * 10/1/2026
 */

//imports
import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Scanner;

public class SocialMediaLedger {
    public static void main(String[] args) throws FileNotFoundException {
        //file initalize
        File dataFile = new File("KaggleSocialMedia.txt");
        Scanner fileScan = new Scanner(dataFile);

        //ai
        NumberFormat percent = NumberFormat.getPercentInstance();

        //initalize vars
        int totalStudents = 0;
        double totalUsage = 0.0;
        double totalSleep = 0.0;
        double totalMentalHealth = 0.0;

        //scan lines
        if (fileScan.hasNextLine()) {
            fileScan.nextLine();
        }

        //header
        System.out.println("--- Social Media Summary ---");

        while (fileScan.hasNextLine()) {
            //ai
            String line = fileScan.nextLine().trim();
            
            //ai
            if (line.isEmpty()) {
                continue;
            }

            //ai
            String[] data = line.split("[\t,]");
            
            //ai
            if (data.length > 13) {
                double dailyUsage = Double.parseDouble(data[5].trim());
                double sleepDuration = Double.parseDouble(data[8].trim());
                double mentalHealth = Double.parseDouble(data[13].trim());

                totalStudents++;
                totalUsage += dailyUsage;
                totalSleep += sleepDuration;
                totalMentalHealth += mentalHealth;
            }
        }

        fileScan.close();

        //print the results of the file
        if (totalStudents > 0) {
            double avgUsage = totalUsage / totalStudents;
            double avgSleep = totalSleep / totalStudents;
            double avgMentalHealth = totalMentalHealth / totalStudents;

            System.out.println("Total Students Analyzed: " + totalStudents);
            
            //ai
            System.out.printf("Average Daily Usage:     %.2f hours%n", avgUsage);
            System.out.printf("Average Sleep Duration:  %.2f hours%n", avgSleep);
            System.out.printf("Average Mental Health:   %.2f / 100%n", avgMentalHealth);
        } 
        //ai
        else {
            System.out.println("No valid data rows were found.");
        }
    }
}