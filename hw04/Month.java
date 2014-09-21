//Keith Runes
//hw04
//This program tells you how many days there are in a month, depending on which month number you input.

//imports the Scanner function
import java.util.Scanner;

    //define class
    public class Month{
        
        //add main method
        public static void main(String[] args){

//------------------------------------------------------------------------

            //Declare and construct the scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
           
            //Asks for user's input
            System.out.print("Enter an int giving the number of the month (1 - 12 ): ");

//------------------------------------------------------------------------          
            
            //If user's input is an int, it is declared and stored into "MonthNumber"
            if(myScanner.hasNextInt()) {
            int MonthNumber = myScanner.nextInt();
            
                //Condition for months with 30 days
                if(MonthNumber == 4 || 
                   MonthNumber == 6 || 
                   MonthNumber == 9 || 
                   MonthNumber == 11)
                   {System.out.println("This month has 30 days.");}
                
                //Condition for months with 31 days
                else if(MonthNumber == 1 ||
                        MonthNumber == 3 ||
                        MonthNumber == 5 ||
                        MonthNumber == 7 ||
                        MonthNumber == 8 ||
                        MonthNumber == 10 ||
                        MonthNumber == 12)
                   {System.out.println("This month has 31 days.");}
                
                //Condition for February
                else if(MonthNumber == 2)
                
                //Creates new Scanner
                {Scanner myScanner2;
                 myScanner2 = new Scanner(System.in);
                 System.out.print("Enter an int giving the year: ");
                 
                    //If user's input is an int, it is declared and stored into "Year"
                    if(myScanner2.hasNextInt()) {
                    int Year = myScanner2.nextInt();
                    
                        //If user's input for Year > 0, the program can continue
                        if(Year > 0)
                        {
                        
                        //Verifies if user's input for Year is a multiple of 4
                        if(Year%4 == 0 )
                        {System.out.println("The month has 29 days.");}
                        else
                        {System.out.println("The month has 28 days.");}
                        
                            
                        }//If user's input for Year is < 0 , the program terminates
                        else
                        {System.out.println("You did not enter an int > 0.");
                        return;}
                    
                        
                    }//If user's input for Year is not an int, the program terminates
                    else
                    {System.out.println("You did not enter an int.");
                     return;}
                
                }//If user's input for Month is not between 1 and 12, the program terminates
                else
                {System.out.println("You did not enter an int between 1 and 12.");
                return;}
            }
            
           
        
    }
}
