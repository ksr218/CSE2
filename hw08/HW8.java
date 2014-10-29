//Keith Runes
//hw08 - HW8.java
/*
	
	This program calls on three different overloaded versions of getInput() that are outisde the main method.
	
	Calls like getInput(scan,"dEf") forces the user to enter a string from the keyboard that is exactly one 
	character long and that is one of the characters in the string “dEf” and returns the character entered.
	The program should repeatedly prompt the user until the user enters the correct input.
	
	Calls like getInput(scan,"abc",7) forces the user to enter a string that consists of exactly one character 
	that is one of the characters in the string “abc” and returns the character entered, but stops the program and 
	return the character ‘ ‘ if the user fails to enter one of the required characters after 7 attempts. 
	
	Calls like getInput(scan,"Prompt: ","059") uses the string "Prompt: " and forces the user to 
	enter a string with exactly one character that is one of the characters in the string “059” and 
	returns the character entered. The program should repeatedly prompt the user until the user enters the correct input.

*/

//import Scanner class
import java.util.Scanner; 

//define the class
public class HW8
{
  
  //this is the first getInput method that gets called in the main method. 
  //The parameters involved consist of a Scanner and a String.
	public static char getInput(Scanner scan, String choices)
	{
			scan = new Scanner(System.in);
			
			//user enters input as a String, then the program takes the first character of
			//the input and casts it into a char type to be used later for comparison
			String input = scan.next();
			char letter = input.charAt(0);
			
			
			//checks whether user's input is exactly 1 character. If not, the program prints an error 
			//message and calls the getInput(scan, choices) method so the process can start again.
			if(input.length() != 1)
			{
			    System.out.println("You should enter exactly one character; try again:");
			    letter = getInput(scan, choices);
			    return letter;
			}
			
			else
			{
					
			    if(letter == 'C' || letter == 'c')
			    {   
			        return letter;
			    }
					
					//checks whether user's input is one of the correct characters. If not, the program prints an error 
					//message and calls the getInput(scan, choices) method so the process can start again.
			    else
			    {
			        System.out.println("You did not enter a character from the list 'Cc'; try again:");
			        letter = getInput(scan, choices);
			        return letter;
			    }
			}
	}
	
	//this is the sencond getInput method that gets called in the main method. 
  //The parameters involved consist of a Scanner, a String, and an int. 
  //Notice how the parameters are different for each method.
	public static char getInput(Scanner scan, String choices, int ntries)
	{       
	        
	    scan = new Scanner(System.in);
			
			String input = scan.next();
			char letter = input.charAt(0);
			
			//checks whether user's input is exactly 1 character. If not, the program prints an error 
			//message and calls the getInput(scan, choices, ntries) method so the process can start again.
			//However, once the user has entered 5 unacceptable values consecutively 
			//(more than one character, unacceptable value), the program returns a failure 
			//message and returns the output value ' '.
			if(input.length() != 1)
			{
			    System.out.println("You should enter exactly one character; try again:");
			    
			    if(ntries > 0)
			    {   
			        ntries--;
			        letter = getInput(scan, choices, ntries);
			        return letter;
			    }
			    
			    else
			    {   
			        letter = ' ';
			        System.out.println("You failed after 5 tries");
			        return letter;
			    }
			    
			}
			
			else
			{
			
			    if(letter == 'Y' || letter == 'y' || letter == 'N' || letter == 'n')
			    {   
			        return letter;
			    }
					
					//checks whether user's input is an acceptable value. If not, the program prints an error 
					//message and calls the getInput(scan, choices, ntries) method so the process can start again.
					//However, once the user has entered 5 unacceptable values consecutively 
					//(more than one character, unacceptable value), the program returns a failure 
					//message and returns the output value ' '.
			    else
			    {
			        System.out.println("You did not enter a character from the list 'yYnN'; try again:");
			        
			        if(ntries > 0)
			        {
			            ntries--;
			            letter = getInput(scan, choices, ntries);
			            return letter;
			        }
			    
			        else
			        {   
			            letter = ' ';
			            System.out.println("You failed after 5 tries");
			            return letter;
			        }
			    }
			}
	}
	
	//this is the third getInput method that gets called in the main method. 
  //The parameters involved consist of a Scanner, a String, and another String. 
  //Notice how the parameters are different for each method.
	public static char getInput(Scanner scan, String prompt, String choices)
	{   
	    System.out.println(prompt);
	    System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'");
	    
	    scan = new Scanner(System.in);
	    
	    String input = scan.next();
	    char number = input.charAt(0);
	    
	    //checks whether user's input is exactly 1 character. If not, the program prints an error 
			//message and calls the getInput(scan, prompt, choices) method so the process can start again.
	    if(input.length() != 1)
	    {
	        System.out.println("You should enter exactly one character; try again:");
	        number = getInput(scan, prompt, choices);
					return number;
	   	}
	   	
	   	else
			{
					//if input is between 0-9, the value is returned
			    switch(number)
			    {
			    	
			    	case '0':
			    	case '1':
			      case '2':		
						case '3':
			    	case '4':
			    	case '5':
			    	case '6':
			    	case '7':
			    	case '8':
			    	case '9': 
			    		return number;
			    	
			    	//checks whether user's input is an acceptable value. If not, the program prints an error 
						//message and calls the getInput(scan, prompt, choices) method so the process can start again.
			    	default:
			    			System.out.println("You did not enter an acceptable character.");
			        	number = getInput(scan, prompt, choices);
			        	return number;
			    }
			    	
			}
	}
	
	public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
}