//Keith Runes
//hw05 - BoolaBoola.java
//This program has three boolean variables to each of which the value of true or false is randomly assigned. 
//Then, it randomly combines the three variables with random choices of && and || and stores the result.
//Finally, the program asks the user whether the final result is true or false. I used in this program 
//the values 1 and 0 to represent the Boolean values 'true' and 'false' respectively.

//import Scanner
import java.util.Scanner;

    //import class
    public class BoolaBoola {
        
        //import main method
        public static void main(String[] args) {
     
//---------------------------------------------------------------           
            
            //First declare the Boolean variables. I will be able to change the values in a later stage in the program.
            boolean variable1 = true;
            boolean variable2 = true;
            boolean variable3 = true;
            
            //These variables will store randomly gerenated numbers - the first 3 from 0 - 1, the last from 0 - 3.
            int randomnumber1 = (int)(Math.random() * 2);
            int randomnumber2 = (int)(Math.random() * 2);
            int randomnumber3 = (int)(Math.random() * 2);
            int randomnumber4 = (int)(Math.random() * 4);
            
            //I will now use these numbers as a way to express the two Boolean values, true or false, 
            //depending on the value of the number.
            switch(randomnumber1)
            {
                case 1: 
                    variable1 = false;
                    break;
                
                default:
                    variable1 = true;
                    break;
            }
            
            switch(randomnumber2)
            {
                case 1: 
                    variable2 = false;
                    break;
                
                default:
                    variable2 = true;
                    break;
            }
            
            switch(randomnumber3)
            {
                case 1: 
                    variable3 = false;
                    break;
                
                default:
                    variable3 = true;
                    break;
            }

//--------------------------------------------------------------- 
            
            //This variable 'answernumber' is what the program will use to determine whether the user's input
            //matches the final Boolean result. For now, however, it must be declared and stored as a random value
            //before any changes can be made to its actual value.
            int answernumber = 0;
            
            //As stated before, this variable will have a value between 0 - 3, 
            //and that will determine the different combinations of the Boolean
            //operators, && and ||.
            switch(randomnumber4)
            {   
                //The first (0) case will use a combination of && and &&.
                case 0:
                    
                    Scanner option1 = new Scanner(System.in);
                    
                    System.out.print("Does " +variable1+ " && " +variable2+ " && " +variable3+ " have the value true(t/T) or false(f/F)?");
                    
                    String answer1 = option1.next();
                    char answerletter1 = answer1.charAt(0);
                    
                    
                    switch(answerletter1)
                                        {
                                        
                                        //Depending on the user's input, the program will verify whether his answer 
                                         //is correct by comapring the variable 'answernumber', which is dictated by random
                                         //values of 'randomnumber1', 'randomnumber2' and 'randomnumber3' and the different 
                                         //combination of Boolean operators, to 1 or 0. 
                                            
                                            case 'T': 
                                            case 't': 
                                                      answernumber = randomnumber1 * randomnumber2 * randomnumber3;
                                                      if(answernumber >= 1)
                                                        {
                                                         System.out.println("Correct!");
                                                        }
                                                      else
                                                        {
                                                         System.out.println("Wrong, try again!");
                                                         return;
                                                        }
                                                        break;
                                            case 'F':
                                            case 'f': if(answernumber == 0)
                                                        {
                                                         System.out.println("Correct!");
                                                        }
                                                      else
                                                        {
                                                         System.out.println("Wrong, try again!");
                                                         return;
                                                        }
                                                        break;
                                            default: {
                                                      //If user's input is not 'T','t','F', or 'f',
                                                      //the program prints an error message and terminates.
                                                      System.out.println("Wrong, try again!");
                                                      break;
                                                     }
                                        }
                    break;
                
                //The second (1) case will use a combination of || and ||.
                case 1:
                    
                    Scanner option2 = new Scanner(System.in);
                    
                    System.out.print("Does " +variable1+ " || " +variable2+ " || " +variable3+ " have the value true(t/T) or false(f/F)?");
                    
                    String answer2 = option2.next();
                    char answerletter2 = answer2.charAt(0);
                    
                    switch(answerletter2)
                                        {
                                            case 'T': 
                                            case 't': 
                                                      answernumber = randomnumber1 + randomnumber2 + randomnumber3;
                                                      if(answernumber >= 1)
                                                        {
                                                         System.out.println("Correct!");
                                                        }
                                                      else
                                                        {
                                                         System.out.println("Wrong, try again!");
                                                         return;
                                                        }
                                                        break;
                                            case 'F':
                                            case 'f': if(answernumber == 0)
                                                        {
                                                         System.out.println("Correct!");
                                                        }
                                                      else
                                                        {
                                                         System.out.println("Wrong, try again!");
                                                         return;
                                                        }
                                                        break;
                                            default: {
                                                      System.out.println("Wrong, try again!");
                                                      break;
                                                     }
                                        }
                    break;
                
                //The third (2) case will use a combination of && and ||, respectively.
                case 2:
                    
                    Scanner option3 = new Scanner(System.in);
                    
                    System.out.print("Does " +variable1+ " && " +variable2+ " || " +variable3+ " have the value true(t/T) or false(f/F)?");
                    
                    String answer3 = option3.next();
                    char answerletter3 = answer3.charAt(0);
                    
                    switch(answerletter3)
                                        {
                                            case 'T': 
                                            case 't': 
                                                      answernumber = (randomnumber1 * randomnumber2) + randomnumber3;
                                                      if(answernumber >= 1)
                                                        {
                                                         System.out.println("Correct!");
                                                        }
                                                      else
                                                        {
                                                         System.out.println("Wrong, try again!");
                                                         return;
                                                        }
                                                        break;
                                            case 'F':
                                            case 'f': if(answernumber == 0)
                                                        {
                                                         System.out.println("Correct!");
                                                        }
                                                      else
                                                        {
                                                         System.out.println("Wrong, try again!");
                                                         return;
                                                        }
                                                        break;
                                            default: {
                                                      System.out.println("Wrong, try again!");
                                                      break;
                                                     }
                                        }
                    break;
                
                //The fourth and last case (3) will use a combination of || and &&, respectively.
                case 3:
                    
                    Scanner option4 = new Scanner(System.in);
                    
                    System.out.print("Does " +variable1+ " || " +variable2+ " && " +variable3+ " have the value true(t/T) or false(f/F)?");
                    
                    String answer4 = option4.next();
                    char answerletter4 = answer4.charAt(0);
                    
                    switch(answerletter4)
                                        {
                                            case 'T': 
                                            case 't': 
                                                      answernumber = randomnumber1 + (randomnumber2 * randomnumber3);
                                                      if(answernumber >= 1)
                                                        {
                                                         System.out.println("Correct!");
                                                        }
                                                      else
                                                        {
                                                         System.out.println("Wrong, try again!");
                                                         return;
                                                        }
                                                        break;
                                            case 'F':
                                            case 'f': if(answernumber == 0)
                                                        {
                                                         System.out.println("Correct!");
                                                        }
                                                      else
                                                        {
                                                         System.out.println("Wrong, try again!");
                                                         return;
                                                        }
                                                        break;
                                            default: {
                                                      System.out.println("Wrong, try again!");
                                                      break;
                                                     }
                                        }
                    break;
            }

//---------------------------------------------------------------       

        }//end main method
    }//end class
    