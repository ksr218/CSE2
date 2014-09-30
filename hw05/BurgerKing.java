//Keith Runes
//hw05 - BurgerKing.java
//This program prompts the user for the details of an order of either a burger, 
//soda, or fries with the use of switch statements.

//import scanner
import java.util.Scanner;

    //import class
    public class BurgerKing 
    {
        //import main method
        public static void main(String[] args) 
        {

//----------------------------------------------------------------------------            
            
            //First, prompt user for whether he would like to order a burger, soda, or fries
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), or Fries (F or f).");
            
            String order = input.next();
            int orderlength = order.length();
            char orderletter = order.charAt(0);
            
            //Verify whether user's order is a single letter
            switch(orderlength)
            {
                case 1:
                    
                    //Outputs result depending on user's order
                    switch(orderletter)
                    {
                        case 'B':
                        case 'b':
                            
                            //Prompt user again whether he would like additional fixins with the burger
                            Scanner burger = new Scanner(System.in);
                            
                            System.out.print("Enter A or a for all the fixins, C or c for cheese, or N or n for none of the above");
                            
                                String orderburger = burger.next();
                                int burgerlength = orderburger.length();
                                char burgerletter = orderburger.charAt(0);
                                
                                //Verify whether user's order for fixins is a single letter
                                switch(burgerlength)
                                {
                                    case 1:
                                        
                                        //Outputs result depending on user's order for additional fixins
                                        switch(burgerletter)
                                        {
                                            case 'A': 
                                            case 'a': System.out.println("You ordered a burger with all the fixins.");
                                                      break;
                                            case 'C':
                                            case 'c': System.out.println("You ordered a burger with cheese.");
                                                      break;
                                            case 'N':
                                            case 'n': System.out.println("You ordered a burger.");
                                                      break;
                                            default: System.out.println("You did not print any of A, a, C, c, N, n.");
                                                     break;
                                        }
                                        break;
                                    
                                    //If user's order for fixins is not a single letter, the program terminates.
                                    default: System.out.println("A single character is expected.");
                                             break;
                                }
                            break;
                        
                        case 'S':
                        case 's':
                            
                            //Prompt user again on his choice of soda
                            Scanner soda = new Scanner(System.in);
                            
                            System.out.print("Do you want Pepsi (P or p), Coke (C or c), Sprite (S or s) or Mountain Dew (M or m)?");
                            
                                String ordersoda = soda.next();
                                int sodalength = ordersoda.length();
                                char sodaletter = ordersoda.charAt(0);
                                
                                //Verify whether user's input is a single letter
                                switch(sodalength)
                                {
                                    case 1:
                                        
                                        //Outputs result depending on user's choice of soda
                                        switch(sodaletter)
                                        {
                                            case 'P': 
                                            case 'p': System.out.println("You ordered Pepsi.");
                                                      break;
                                            case 'C':
                                            case 'c': System.out.println("You ordered Coke.");
                                                      break;
                                            case 'S':
                                            case 's': System.out.println("You ordered Sprite.");
                                                      break;
                                            case 'M':
                                            case 'm': System.out.println("You ordered Mountain Dew.");
                                                      break;
                                            default: System.out.println("You did not print any of P, p, C, c, S, s, M, m.");
                                                     break;
                                        }
                                        break;
                                    
                                    //If user's order for soda is not a single letter, the program terminates.
                                    default: System.out.println("A single character is expected.");
                                             break;
                                }
                                break;  
                        
                        case 'F':
                        case 'f':
                            
                            //Prompt user again for size of fries order
                            Scanner fries = new Scanner(System.in);
                            
                            System.out.print("Do you want a large or small order of fries (L, l, or S, s)?");
                            
                                String orderfries = fries.next();
                                int frieslength = orderfries.length();
                                char friesletter = orderfries.charAt(0);
                                
                                //Verify whether user's input is a single letter
                                switch(frieslength)
                                {
                                    case 1:
                                        
                                        //Outputs result depending on user's choice of fries order size
                                        switch(friesletter)
                                        {
                                            case 'L': 
                                            case 'l': System.out.println("You ordered large fries.");
                                                      break;
                                            case 'S':
                                            case 's': System.out.println("You ordered small fries.");
                                                      break;
                                            default: System.out.println("You did not print any of L, l, S, s.");
                                                     break;
                                        }
                                        break;
                                    
                                    //If user's order for fries is not a single letter, the program terminates.
                                    default: System.out.println("A single character is expected.");
                                             break;
                                }
                                break;
                        
                        //If user's order is not the following letters, the program terminates.
                        default: System.out.println("You did not enter any of B, b, S, s, F, or f.");
                            
                    }
                    break;
                
                //If user's input is not a  single letter, the program terminates.
                default: System.out.println("A single character is expected.");
                         break;
            }
            
            
            
        }
    }