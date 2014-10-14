//Keith Runes
//hw06 - Root.java
/*
  This program uses the bisection method to compute the square root of any int given by the user.
  The user's value is within the range [low,high], where the inital values of low and high are 0 and (1+x), respectively.
  The middle value, which is in the middle of the interval, is taken. If the square of the middle is greater than x, 
  then the high value is changed to the middle value; otherwise, the low value is changed. this process is repeated until
  the difference between the values of low and high is less than 0.0000001(1.00+x). The result, which is the square root of x,
  is printed.
*/
//import Scanner class
import java.util.Scanner;

    //define the class
    public class Root{
        
       //define the main method
        public static void main(String args[]){

//---------------------------------------------------------------            
            
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a double: ");
            
            //intial check of user's value. If user's input is a double value, the program continues
            if(input.hasNextDouble())
            {double x = input.nextDouble();
                
                //second check of user's value. If user's input is a double value > 0, theprogram continues
                if(x > 0)
                {
                   //Variables are delcared and initialized
                   double low = 0.00;
                   double high = (1.00+x);
                   double middle = ((low+high)/2.00);
                   double difference = (1.00+x);
                   
//---------------------------------------------------------------
                   
                   while(difference >= (0.0000001*(1.00+x)))
                   {    
                        //If the square of the middle is greater than x, 
                        //then the high value is changed to the middle value
                        if((middle*middle) > x)
                        {
                            high = middle;
                        }
                        //If the square of the middle is less than or greater than x, 
                        //then the low value is changed to the middle value
                        else
                        {
                            low = middle;
                        }
                        
                        //'middle' and 'difference' are recalculated until 
                        //the value of 'difference' >= (0.0000001*(1.00+x))
                        middle = ((low+high)/2.00);
                        difference = (high-low);
                   }
                   //Results are printed here:
                   System.out.println("Approximate square root: " +((low+high)/2));
                }
                //If user's input is not a double value > 0, this is printed and the program ceases to continue.
                else
                {System.out.println("You did not enter a positive double value.");
                 return;}
            }
            //If user's input is not a double, this is printed and the program ceases to continue.
            else
            {System.out.println("You did not enter a double value.");
             return;}
    }
}

   