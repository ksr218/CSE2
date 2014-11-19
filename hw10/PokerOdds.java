/*
  Keith Runes
  hw10 - PokerOdds.java
  
  In this program, the main method calls two separate methods, showOneHand() and simulateOdds().The method showOneHand() 
  generates random poker hands, prompting the user if they would like another hand to be generated (it will repeat 
  as long the user desires). The method simulateOdds() randomly generates 10000 hands and count the number of times 
  that a hand with a pair of a specific rank occurs, along with the number of hands that do not have a pair. 
*/

//import Random and Scanner functions
import java.util.Random;
import java.util.Scanner;

//define the class
public class PokerOdds{

//-------------------------------------------------------------------------------
  
  //This is the first method that gets called from the main method. Its output type is void and also does not take 
  //anything as input. Its main function is to generate random poker hands as much as the user desires.
  public static void showHands()
  { 
    //The Scanner object 'scan' and String object 'answer' are declared here. 'answer' has no value yet, since the
    //prompt to run the poker hand generator does not appear until the do-while loop below loops at least once.
    Scanner scan = new Scanner(System.in);
    String answer;
    
    do
    {   
        //the int type array 'deck' has a size 52 and carries the numbers 0 - 51, which will represent the card number.
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++)
        {
          deck[i] = i;
        }
        
        //the int type array 'hand' has a size 5 and represents the "hand" in a poker game. All values at each position
        //equal to -1, and will each be replaced by a randomly chosen card, gdemonstrated by the code below.
        int[] hand = {-1,-1,-1,-1,-1};
      
        
        //the value of 'swap' will be the number of times the program swaps cards between 'deck' and 'hand'.
        for(int swap = 0; swap < hand.length; swap++)
        { 
          //'targe' represents a random card in the deck
          int target = (int)((deck.length-swap) * Math.random() );
          
          //The card/number at position 'swap' in the array 'hand' is replaced by the randonly chosen value
          //of 'target'
          hand[swap] = deck[target];
          
          //for every time we swap a card, the cards/numbers above the target card will have to move down the deck
          //in order to replace the swapped 'target'. The last value of 'deck', therefore, will be attributed to -1, 
          //completing the "swap" between the 'deck' and 'hand'.
          for(int j = target; j < 51-swap; j++)
          {
            deck[j] = deck[j+1];
          }
        
          deck[51-swap] = -1;
        }
        
        //the values of the two String type arrays, 'rank' and 'suit', represent the potential type of card.
        String[] rank = {"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
        String[] suit = {"Clubs: ","Diamonds: ","Hearts: ","Spades: "};
        
        //this section of the code is where the program translates each number of the array 'hand' into its 
        //suit and rank type by using "/13" and "%13", respectively, and prints it out. For example, if one 
        //of the numbers in the array were 17, then 17/13 = 1, meaning that the card belongs to the suit Clubs,
        //since Clubs is the first value of the 'suit' array and 17%13 = 4, which means that the card is a 10 of 
        //Clubs, since 10 is the 4th value of 'rank' array.
        for(int k = 0; k < suit.length; k++)
        {
          System.out.print(suit[k]);
          
          for(int l = 0; l < hand.length; l++)
          {
            if(hand[l]/13 == k)
            {
              System.out.print(rank[(hand[l] % 13)]);
            }
            else
            {
              continue;
            }
          }
      
          System.out.println();
        }
      System.out.println();
      
      //prompt to repeat the loop is found here. If anything but "Y" or "y" is taken as input, the program 
      //discontinues the showHands() method and moves to the next element in the main method, which is the next method, 
      //simulateOdds().
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer = scan.next();
    }
    while(answer.equals("Y") || answer.equals("y"));
  }

//-------------------------------------------------------------------------------
  
  //This is the second method that gets called from the main method. Its output type is also void and also does not take 
  //anything as input. Its main function is to randomly generate 10000 hands and count the number of times 
  //that a hand with a pair of a specific rank occurs, along with the number of hands that do not have a pair.
  public static void simulateOdds()
  {
    //important variables used in this method are declared here. The int type arrays 'deck' and 'hand' and 
    //int type object 'result1' are not initialized with values here, since they will need reset in each of the
    //10000 loops, so they are initialized within that loop. The array 'result2' will represent the number of times 
    //a certain rank in a hand produced a pair (one duplicate), and the int 'result3' will represent how many times 
    //a randomly generated did not produce a single pair.
    int[] deck;
    int[] hand;
    int result1;
    int[] result2 = {0,0,0,0,0,0,0,0,0,0,0,0,0};
    int result3 = 0;
    
    for(int a = 1; a <= 10000; a++)
    {   
        //swapping mechanism similair to previous method
        hand = new int[5];
        for (int x = 0; x < hand.length; x++)
        {
          hand[x] = -1;
        }
        
        deck = new int[52];      
      
        for (int b = 0; b < deck.length; b++)
        {
          deck[b] = b;
        }
   
        for(int swap = 0; swap < hand.length; swap++)
        {
          int target = (int)((deck.length-swap) * Math.random() );
    
          hand[swap] = deck[target];
    
          for(int c = target; c < 51-swap; c++)
          {
            deck[c] = deck[c+1];
          }
        
          deck[51-swap] = -1;
        }
        
        result1 = 0;
        
        //If a number of position 'e' in array hand[] has the same modulo/reminder when divided by 13
        //(which represents the rank) with a number of position 'd' in the same array, then the variable 
        //'result1' increases and the iteration continues. If not, only the iteration continues.
        for(int d = 0; d < hand.length; d++)
        {
          for(int e = 0; e < hand.length; e++)
          {
            if(((hand[d]%13) == (hand[e]%13)) && (d != e))
            { 

              result1++;
            }
            else
            {
              continue;
            }
          }
        }
        //If 'result1' == 2, (not 1, since I took into account the fact that the above loop increases
        //'result1' if it compared the value to itself) then 'result2' of the rank position increases.
        //If not, then 'result3' increases.
        if(result1 == 2)
        {
          for(int f = 0; f < hand.length; f++)
          {
            for(int g = 0; g < hand.length; g++)
            {
              if(((hand[f]%13) == (hand[g]%13)) && (f != g))
              {
                result2[(hand[f]%13)]++;
              }
              else
              {
                continue;
              }
            }
          }
        }
        else
        {
          result3++;
        }
    }
    
    String[] rank = {"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
    System.out.println();
    System.out.println("  Rank   Frequency of Exactly One Pair");
    
    for(int a = 0; a < result2.length; a++)
    {
      System.out.print("  " +rank[a]);
      System.out.println("     " +(result2[a]/2));
    } 
    System.out.println();
    System.out.println("----------------------------");
    System.out.println("Total not exactly one pair: " +result3);
  }

//-------------------------------------------------------------------------------
  
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  
}
