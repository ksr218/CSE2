//imports the Scanner function
import java.util.Scanner;

    //define class
    public class BigMacAgain{
        
        //add main method
        public static void main(String[] args){

//------------------------------------------------------------------------

            //Declare and construct the scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            //Asks for user's input
            System.out.print("Enter the number of Big Macs: ");
            double BigMacPrice = 2.22;
            
            //Use "hasNextInt" method to provide a respond to user's input
            
            // - If user's input is an int, it is stored within the variable "nBigMac"
            if(myScanner.hasNextInt()) {
            int BigMac = myScanner.nextInt();
            
                if(BigMac > 0){ // - Verifies whether input > 0
                double BigMacTotal = BigMac*BigMacPrice;
                //Changes
                BigMacTotal = BigMacTotal*100;
                BigMacTotal = (int)(BigMacTotal) / 100;
            
                System.out.println("You ordered " +BigMac+ " Big Macs for a cost of " +BigMac+ "x" +BigMacPrice+ "=" +BigMacTotal);
            
                    //Now ask for french fries.
                    System.out.print("Do you want an order of fries with that? (Y/y/N/n)");
                    
                    if(myScanner.hasNext()) {
                    String answer = myScanner.next();
            
                        if(answer.equals("Y") || answer.equals("y"))
                        {System.out.println("You ordered fries at a cost of $2.15");
                        System.out.println("The total cost of the meal is $" +(BigMacTotal+2.15));}  
                            
                        else if(answer.equals("N") || answer.equals("n"))
                        {System.out.println("The total cost of the meal is $" +BigMacTotal);}
                        
                        else{
                        System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
                        return;
                        }
                        
                        
                        
                    }
                    
                    }    
                else{ // - Terminates if input <= 0
                System.out.println("You did not enter an int > 0.");
                return;    
                }
            
            }
            // - If user's input is not an int, the program terminates
            else{
            System.out.println("You did not enter an int.");
            return;
            }
            
            
            
            
            
            
            
            
           
            
           
        
            
            
        }
    }