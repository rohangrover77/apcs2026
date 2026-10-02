/**
 * Write a description of class WeatherForecast here.
 *
 * Rohan Grover
 * 10/2/2026
 */
public class WeatherForecast
{
    //define an enum for fixed weather categories
    public enum WeatherType{
    Sunny,
    Cloudy,
    Rainy,
    Foggy,
    Windy,
    Snowy
    }

    public static void main(String args[]){
        //creating a counter var to count the number of rainy days
        int rainyDays = 0;
        
        //array of all possible enum constants
        WeatherType[] options = WeatherType.values();
                
        //header parts:
        //initializer (int day = 1)
        //condition (day <= 7)
        //mutator (day++)
        
        for (int day = 1; day <= 7; day++) {
            //pick a random index from 0 to the length of our enum
            int rndIndex = (int) (Math.random() * options.length);
            WeatherType today = options[rndIndex];
            
            //day #: weather
            System.out.println("Day: " + day + " Weather type:" + today);
            
            //enums are used compared using == because they are ints
            if (today == WeatherType.Rainy) {
                rainyDays++;    
            }
        }
        System.out.println("They are " + rainyDays + "days of rain in the forecast.");
        
        System.out.println("All Supported Weather Types:");
        
        //an enhanced for loop (for-each loop)
        //iterates directly through EVERY element in WeatherType.value
        for (WeatherType w: WeatherType.values()) {
            System.out.println("Category: " + w);
        }
    }
}