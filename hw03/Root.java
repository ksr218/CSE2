//imports the Scanner function
import java.util.Scanner;

    //define class
    public class Root{
        
        //add main method
        public static void main(String[] args){
            
            //Declare and construct the scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            //Take user's input
            System.out.print("Enter a double, and I will print its cube root: ");
            double x = myScanner.nextDouble();
            
            double guess = x/3;
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            guess = (2*guess*guess*guess+x)/(3*guess*guess);
            
            System.out.println("The cube root is: " +guess+ ".");
            System.out.println(+guess+ "*" +guess+ "*" +guess+ "=" +(guess*guess*guess)+ ".");
            
        }
    }
        
