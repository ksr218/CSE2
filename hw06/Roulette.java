//Keith Runes
//hw06 - Roulette.java
/*
  This program carries out 1000 simulations of a 100-spin session of Roulette, mainly through the use of while loops. 
  It records the number of times the bet number, a randomly-generated constant number between 0 and 38, 
  is equal to the roulette spin number, which changes value between 0 and 38 with each spin. The program
  also records the total number of correct guesses, in which the roulette number matches the bet number,
  and also documents the sessions in which no correct guesses were made and the number of times profit was made 
  in all 1000 simulations.
*/

//define the class
public class Roulette 
{
    
    //define the main method
    public static void main(String[] arg)
    {

//---------------------------------------------------------------

        //declare and initialize the 'simulation' variable, which will later be used to control the simulation number.
        int simulation = 1;
        
        //declare and initialize the 'totalwin' and 'completelose' variables, which will later determine the
        //total amount of winnings and the number of simulations in which no correct guesses/winnings were made respectively.
        int totalwin = 0;
        int completelose = 0;
        
        //declare and initialize the 'profit' variable, which will later calculate the number of times profit was made in all 
        //1000 simulations
        int profit = 0;

//---------------------------------------------------------------
        
        //this while loop will mainly control the simulation number. As long as 'simulation' is less than or equal to 1000,
        //the loop will continue to run.
        while(simulation <= 1000)
        {
            
            //These variables are extremely important as they are responisble for resetting a finsihed session of Roulette.
            //The number of rolls will return to 1, and the number of recorded number of wins and losses for a session will
            //return to 0 for the next one.
            int nroll = 1;
            int win = 0;
            
            //The bet number is changed each simulation.
            int bet = (int) (Math.random() * 39); 
            
            //this while loop will mainly control the roll number. When it reaches 100, the loop will stop running and move
            //on to the next part of the 'simulation' loop body.
            while(nroll <= 100)
            {
                
                int roulette = (int) (Math.random() * 39);
                
                //if the bet is correct, the 'win' and 'totalwin' value will increase by 1. Notice how 'totalwin'
                //does not reset to 0 when a simulation is complete.
                if(bet == roulette)
                {win++;
                totalwin++;}
                
                //This increases the roll number by 1, which serves to repeat the loop until 'nroll' reaches 100.
                nroll++;
            }
            
            //this is where complete losses are calculated. If no correct guesses were made, 'completelose' increases by 1
            if(win == 0)
            {completelose++;}
            
            //alternatively, this is where the program calculates the number of times profit is made per simulation. 
            //If 3 or more correct guesses were made in a single simulation, 'profit' increases by 1.
            else if(win >= 3)
            {profit++;}
        
        //This increases the simulation number l by 1, which serves to repeat the loop until 'nsimulation' reaches 1000. 
        simulation++;
        }
        
//---------------------------------------------------------------
        
        //Results are printed here:
        System.out.println("Number of complete losses: " +completelose);
        System.out.println("Total winnings of all simulations: $" +(totalwin * 36));
        System.out.println("Number of times profit was made in all simulations: " +profit);
    
    }
}