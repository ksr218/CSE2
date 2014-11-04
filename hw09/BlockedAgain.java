//Keith Runes
//hw09 - MethodCalls.java
/*
    This program involves the usage of seven different methods outside the main method, which will
    ultimately print out a pyramid of numbers, similar to that in NumberStack.java in hw07. Calls can go 
    back and forth depending on the user's input. If the input does not meet certain conditions, 
    the program will continue to ask the user for input until the conditions are properly met.
*/

//import Scanner class
import java.util.Scanner;

//define the class
public class BlockedAgain
{

//-----------------------------------------------------------------------

//This is the first method that only gets called from within the main method. 
//It prompts the user for a value, then returns that value to the second method, scan().
public static int getInt()
{   
    System.out.print("Enter an in int between 1 and 9, inclusive: ");
    int result = scan();
    return result;
}

public static int scan()
{
    Scanner scan = new Scanner(System.in);
    
    //the int variable 'result' will be used to call the next method in the process, checkInt().
    int result = checkInt(scan);
    return result;
}

//-----------------------------------------------------------------------

//This is the third method that gets called from scan(). Its input type is a Scanner type,
//due to the fact that this method's purpose is to evaluate the user's input from the Scanner
//value received from the previous method.
public static int checkInt(Scanner scan)
{   
    int number;
    int result;
    
    //user's input is first evaluated here. If it holds an int value, then the variable 'number'
    //will hold that value while the variable 'result' is used to call the next method, checkRange().
    if(scan.hasNextInt())
    {
        number = scan.nextInt();
        result = checkRange(number);
        return result;
    }
    
    
    //If it does not hold an int value, then the program prints out an error message and 'result'
    //calls the second method, scan(), which repeats the program from there and forces the user to input another value.
    else
    {   
        System.out.print("You did not enter an int; try again: ");
        result = scan();
        return result;
    }
}

//-----------------------------------------------------------------------

//This is the fourth method that gets called from checkInt(). This method will check whether the user's input,
//which was evaluated as in int in the previous method checkInt(), is a value between 1 and 9, inclusive. It returns
//the value of number to the main method, which will later be used in the method allBlocks().
public static int checkRange(int number)
{   
    if(number >= 1 && number <= 9)
    {
        return number;
    }
    
    //If it does not hold a value between 1 and 9, then the program prints out an error message and 'number'
    //calls the second method, scan(), which repeats the program from there and forces the user to input another value.
    else
    {
        System.out.print("You did not enter an int in [1,9]; try again: ");
        number = scan();
        return number;
    }
}

//-----------------------------------------------------------------------

//This is the fifth method that gets called from the main method. It has no return type since the method is void, 
//but instead calls the method block(), which is responsible for printing the number stack.
public static void allBlocks(int number)
{   
    block(number);
}

//-----------------------------------------------------------------------

public static void block(int number)
{
    //the variable 'base' will determine what number will be printed
    for(int base = 1; base <= number; base++)
    {   
        //the variable 'line' will print a number of lines equal to the current value of base
        for(int nline = 1; nline <= base; nline++)
        {
            //this variable is mainly responsible for the 'pyramid stack' result of the program.
            //As the value of base increases, the value of 'space' decreases, giving the number stack 
            //its pyramid shape.
            for(int space = 8; space >= base; space--)
            {
                System.out.print(" ");
            }
            //this is where the value of base is printed. It's printed an odd number of times to give 
            //the result a pyramid shape.
            for(int ncount = 1; ncount <= ((base*2)-1); ncount++)
            {
                System.out.print(base);
            }
                            
        System.out.println();
        }
    //line() method is called, which is resposnible for printing out the dashes
    line(base);
    }
}

//-----------------------------------------------------------------------

public static void line(int base)
{
        //Similair to above
        for(int space = 8; space >= base; space--)
        {
            System.out.print(" ");
        }
                        
        //this is where the dashes are printed at the end of each number stack, following the 
        //odd-numbered print result similair to above.
        for(int dash = 1; dash <= ((base*2)-1); dash++)
        {
            System.out.print("-");
        }
        
    //Prints out the next line right before base is incremented by 1 to start the loop again
    System.out.println();
}

//-----------------------------------------------------------------------

//main method
public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);
}
}