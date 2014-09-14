//imports the Scanner function
import java.util.Scanner;

    //define class
    public class Bicycle{
        
        //add main method
        public static void main(String[] args) {
            
            //declares, constructs the Scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            //Takes user's input for revolution count and declares and stores it as an int variable
            System.out.print("Enter the number of revolution counts: ");
            int ncounts = myScanner.nextInt();
            
            //Takes user's input for time in seconds and declares and stores it as an int variable
            System.out.print("Enter the time in seconds during which the counts occured: " );
            int nseconds = myScanner.nextInt();
            
            //Record some important values
            double wheelDiameter = 27.0;
            double PI = 3.14159;
            int feetPerMile = 5280; 
            int inchesPerFoot = 12; 
            int secondsPerMinute = 60; 
            
            //Declare the distance and compute it
            double distance = ncounts * wheelDiameter * PI / inchesPerFoot / feetPerMile;
            
            //Change the distance to two decimal places
            distance = distance * 100;
            distance = (double)((int)(distance)) / 100;
           
            //Declare the time and compute it
            double nminutes = nseconds / 60;
            double nhours = nminutes / 60;
            
            System.out.println("The distance was " + distance + " miles and took " + nminutes +" minutes.");
            
            //Declare the speed and compute it
            double speed = distance / nhours;
            
            //Change the speed to two decimal places
            speed = speed * 100;
            speed = (double)((int)(speed)) / 100;
            
            System.out.println("The average speed was " + speed + " mph.");
            
            }
    }