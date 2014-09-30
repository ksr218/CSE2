//imports the Scanner function
import java.util.Scanner;

    //define class
    public class RandomGames{
    
        //add main method        
        public static void main(String[] args) {
            
 //------------------------------------------------------------------------           
            
            //Declare and construct the scanner
            Scanner input = new Scanner(System.in);
            
            //Asks for user's input, input is declared and stored as "gameletter", a string variable.
            System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
            String gameletter = input.next();
            int gameletterlength = gameletter.length();
            
            
            int number = (int) (Math.random() * 37);
            int die1 = (int) ((Math.random() * 6) + 1);
            int die2 = (int) ((Math.random() * 6) + 1);
            char letter = gameletter.charAt(0);
            int cardtype = (int)((Math.random() * 4) + 1);
            int cardnumber = (int)((Math.random() * 13) + 1);
            
            
            switch(gameletterlength)
            {
                case 1:
                    
                    switch(letter)
                    {
                        case 'R':
                        case 'r':
                    
                            switch(number)
                            {
                            case 0: System.out.println("Roulette: 00");
                                    break;
                            default: System.out.println("Roulette: " +(number-1));
                                    break;
                            }
                        
                        case 'C':
                        case 'c':
                            
                            System.out.println("Craps: " + die1 + "+" + die2 + "=" + (die1 + die2) );
                            break;
                            
                        case 'P':
                        case 'p':
                            
                        String card = "";
                        String cnumber = "";
            
                            switch(cardtype)
                            {
                            case 1: card = "Hearts";
                                    break;
                            case 2: card = "Diamonds";
                                    break;
                            case 3: card = "Spades";
                                    break;
                            default: card = "Clubs";
                                    break;
                            }
                            
                            switch(cardnumber)
                                {
                                case 1: cnumber = "Ace";
                                         break;
                                case 2: cnumber = "2";
                                         break;
                                case 3: cnumber = "3";
                                         break;
                                case 4: cnumber = "4";
                                         break;
                                case 5: cnumber = "5";
                                         break;
                                case 6: cnumber = "6";
                                         break;
                                case 7: cnumber = "7";
                                         break;
                                case 8: cnumber = "8";
                                         break;
                                case 9: cnumber = "9";
                                         break;
                                case 10: cnumber = "10";
                                         break;
                                case 11: cnumber = "Jack";
                                         break;
                                case 12: cnumber = "Queen";
                                         break;
                                case 13: cnumber = "King";
                                         break;
                                default: break;
                                }
            
                            System.out.println(cnumber+ " of " +card);
                            break;
                            
                    }   
                    break;  
                
                    default:
                    System.out.println("A single character is expected.");
                    break;
            }
    }
}





