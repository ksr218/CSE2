//Keith Runes
//hw04
//Income Tax Calculator Java Program

//imports the Scanner function
import java.util.Scanner;

    //define class
    public class IncomeTax{
        
        //add main method
        public static void main(String[] args){

//------------------------------------------------------------------------

            //Declare and construct the scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
           
            //Asks for user's input
            System.out.print("Enter an int giving the number of thousands: ");

//------------------------------------------------------------------------           
            
            //If user's input is an int, declare and store it in "intIncome"
            if(myScanner.hasNextInt()) {
            int Income = myScanner.nextInt();
                
                //If user's input is an int > 0, multiply input by 1000 and delare, store it in "RealIncome"
                if(Income > 0) {
                int RealIncome = Income*1000;
                
                    //Tax conditions
                    if(Income < 20)
                    {System.out.println("The tax rate on $" +RealIncome+ " is 5%, and the tax is " +((RealIncome*5)/100));}
                    
                    if(Income >= 20 && Income < 40)
                    {System.out.println("The tax rate on $" +RealIncome+ " is 7%, and the tax is " +((RealIncome*7)/100));}
                    
                    if(Income >= 40 && Income < 78)
                    {System.out.println("The tax rate on $" +RealIncome+ " is 12%, and the tax is " +((RealIncome*12)/100));}
                    
                    if(Income >= 78)
                    {System.out.println("The tax rate on $" +RealIncome+ " is 14%, and the tax is " +((RealIncome*14)/100));}
                    
                    
                }
                //If user's input is not an int > 0, the program terminates
                else
                {System.out.println("You did not enter an int > 0");
                return;}
                
            }
            //If user's input is not and int, the program terminates
            else
            {System.out.println("You did not enter an int");
            return;}
            
           
           
        }
    }
