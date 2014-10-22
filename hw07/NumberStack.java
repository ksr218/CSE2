//Keith Runes
//hw08 - NumberStack.java
/*
  This program forces the user to enter an integer between 1 and 9, inclusive, and then prints out displays 
  a 'number stack' depending on the value entered. The program is executed by 3 methods of loops: for loops, while loops,
  and do-while loops.
*/

//import Scanner
import java.util.Scanner;
    
    //define the class
    public class NumberStack
    {
        
        //define main method
        public static void main(String[] arg)
        {
        
        //declare and initialise variables. Throughout the program these variables will be re-initialised to
        //run the loops properly.
        int base = 0;
        int space = 0;
        int nline = 0;
        int ncount = 0;
        int dash = 0;
        
//------------------------------------------------------------------------------
        //This section of the code checks whether the user's entered value is one that is valid for the program
        //to run. If the value does not meet the conditions, the program will discontinue and exit.
        Scanner input = new Scanner(System.in);
        
            System.out.print("Enter a number between 1 and 9: ");
            
            if(input.hasNextInt())
            {
                int number = input.nextInt();
                
                if(number >= 1 && number <= 9)
                {

//------------------------------------------------------------------------------                   
//For loops                    
                    
                    System.out.println("Using for loops: ");
                    
                    //the variable 'base' will determine what number will be printed
                    for(base = 1; base <= number; base++)
                    {   
                        //the variable 'line' will print a number of lines equal to the current value of base
                        for(nline = 1; nline <= base; nline++)
                        {
                            //this variable is mainly responsible for the 'pyramid stack' result of the program.
                            //As the value of base increases, the value of 'space' decreases, giving the number stack 
                            //its pyramid shape.
                            for(space = 8; space >= base; space--)
                            {
                                System.out.print(" ");
                            }
                            //this is where the value of base is printed. It's printed an odd number of times to give 
                            //the result a pyramid shape.
                            for(ncount = 1; ncount <= ((base*2)-1); ncount++)
                            {
                                System.out.print(base);
                            }
                            
                        System.out.println();
                        }
                        
                        //Similair to above
                        for(space = 8; space >= base; space--)
                        {
                            System.out.print(" ");
                        }
                        
                        //this is where the dashes are printed at the end of each number stack, following the 
                        //odd-numbered print result similair to above.
                        for(dash = 1; dash <= ((base*2)-1); dash++)
                        {
                            System.out.print("-");
                        }
                    
                    //Prints out the next line right before base is incremented by 1 to start the loop again
                    System.out.println();
                    }
                    
//------------------------------------------------------------------------------
//While loops
        
        //While loops follow a similar pattern to for loops, except the variables are initialised before the loops begins
        //and the value of the affected variable is changed withing the loop itself. Everything else follows the same pattern
        //as before.
        System.out.println("Using while loops: ");
        
                    base = 1;
                    while(base <= number)
                    {
                        
                        nline = 1; 
                        while(nline <= base)
                        {
                            
                            space = 8;
                            while(space >= base)
                            {   
                                System.out.print(" ");
                                space--;
                            }
                            
                            ncount = 1; 
                            while(ncount <= ((base*2)-1))
                            {
                                System.out.print(base);
                                ncount++;
                            }
                        
                        System.out.println();
                        nline++;
                        }
                        
                        space = 8;
                            while(space >= base)
                            {   
                                System.out.print(" ");
                                space--;
                            }
                            
                        dash = 1;   
                        while(dash <= ((base*2)-1))
                        {
                            System.out.print("-");
                            dash++;
                        }
                    System.out.println();
                    base++;
                    }
                
//------------------------------------------------------------------------------
//Do-While loops
            
            //Do-while loops work like while loops, except it always executes the body of the loop before 
            //checking/incrementing the affected variable.
            System.out.println("Using do-while loops: ");
            
                    base = 1;
                    do
                    {
                        nline = 1; 
                        do
                        {
                            space = 9;
                            do
                            {   
                                System.out.print(" ");
                                space--;
                            }
                            while(space >= base);
                            
                            ncount = 1; 
                            do
                            {
                                System.out.print(base);
                                ncount++;
                            }
                            while(ncount <= ((base*2)-1));
                        
                        System.out.println();
                        nline++;
                        }
                        while(nline <= base);
                        
                        space = 9;
                        do
                        {   
                            System.out.print(" ");
                            space--;
                        }
                            while(space >= base);
                        
                        dash = 1;
                        do
                        {
                            System.out.print("-");
                            dash++;
                        }
                        while(dash <= ((base*2)-1));
                    
                    System.out.println();
                    base++;
                    }
                    while(base <= number);

//------------------------------------------------------------------------------
                
                }
            
                else
                {
                    System.out.println("You did not enter an int between 1 and 9.");
                }
            }
            
            else
            {
                System.out.println("You did not enter ant int.");
                return;
            }
            
//------------------------------------------------------------------------------
            
        }
    }

