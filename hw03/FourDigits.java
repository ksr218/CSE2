//imports the Scanner function
import java.util.Scanner;

    //define class
    public class FourDigits{
        
        //add main method
        public static void main(String[] args){
            
            //Declare and construct the scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            //Take user's input
            System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
            double x = myScanner.nextDouble();
            
            x = x*10000;
            x = (int)(x);
            
            //12345
            //stores 4th digit
            int digit4 = (int)x % 10;
            
            //makes it 4 digits
            int x4 = (int)x / 10;
            
            //stores 3rd digit
            int digit3 = (int)x4 % 10;
            
            //makes it 3 digits
            int x3 = (int)x4 / 10;
            
            //stores 2nd digit
            int digit2 = (int)x3 % 10;
            
            //makes it 2 digits
            int x2 = (int)x3 / 10;
            
            //stores the 1st digit
            int digit1 = (int)x2 % 10;
            
            System.out.println("The four digits are "+(digit1)+""+(digit2)+""+(digit3)+""+(digit4));
        
            }
    }
        