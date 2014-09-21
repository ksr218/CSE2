//Keith Runes
//hw04
//Time padding program

//imports the Scanner function
import java.util.Scanner;

    //define class
    public class TimePadding{
        
        //add main method
        public static void main(String[] args) {
            
//-------------------------------------------------------

            //Declare the scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            //Ask for user's input
            System.out.print("Enter the time in seconds: ");

//-------------------------------------------------------
            
            //If user's input is an int, it is declared and stored in "totalseconds"
            if(myScanner.hasNextInt()) {
                int totalseconds = myScanner.nextInt();
            
                //If user's input is an int > 0, we can specify certain calculate the time in hours, minutes, and seconds
                if(totalseconds > 0) {
                    int hours = totalseconds / 3600;
                    int minutes = (totalseconds % 3600) / 60;
                    int seconds = totalseconds % 60;
                    
                    
//Prints out the time and formats the hours, minutes and seconds that adds leading 0's                    
System.out.println("The time is " +String.format("%02d", hours)+ ":" +String.format("%02d", minutes)+ ":" +String.format("%02d", seconds));
                
                    }//If user's input is < 0, the program terminates
                    else
                    {System.out.println("The time you entered is not positive.");
                    return;}
                    
            }//If user's input is not an int, the program terminates
            else
            {System.out.println("The time you entered is not an int.");
            return;}
            
        }
}
                