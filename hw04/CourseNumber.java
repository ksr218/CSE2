//Keith Runes
//hw04
//

//imports the Scanner function
import java.util.Scanner;

    //define class
    public class CourseNumber{
        
        //add main method
        public static void main(String[] args) {
            
//-------------------------------------------------------

            //Declare the scanner
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            
            //Ask for user's input
            System.out.print("Enter a six digit number giving the course semester: ");

//-------------------------------------------------------
            
            //If user's input is an int, it is stored and declared in "CourseNumber"
            if(myScanner.hasNextInt()) {
                int CourseNumber = myScanner.nextInt();
                 
                //If user's input is between 186510 and 201440, then the program can continue
                if(CourseNumber >= 186510 && CourseNumber <= 201440)
                {
                //The year is calculated by dividing CourseNumber and casting it into an int, which removes the decimals
                int year = CourseNumber/100;
                //The semester is calculated by using % 100, which takes the two last digits of CourseNumber 
                int Semester = CourseNumber % 100;
                
                    //The different results that can be printed depending on user's input:
                    
                    if(Semester == 10)
                    {System.out.println("The course was offered in the spring semester of " +year+ ".");}
                    
                    if(Semester == 20)
                    {System.out.println("The course was offered in the summer 1 semester of " +year+ ".");}
                    
                    if(Semester == 30)
                    {System.out.println("The course was offered in the summer 2 semester of " +year+ ".");}
                    
                    if(Semester == 40)
                    {System.out.println("The course was offered in the fall semester of " +year+ ".");}
                    
                    else
                    {System.out.println(Semester+ " is not a legitimate semester.");}
                
                
                }//If user's input is not between 186510 and 201440, the program terminates
                else
                {System.out.println("The number was outside the range [186510,201440].");
                return;
                }
                   
                
                
            }//If user's input is not an int, the program terminates.
            else
                {System.out.println("The number you entered is not a valid course number.");
                 return;}
            }
            
            
        }
    