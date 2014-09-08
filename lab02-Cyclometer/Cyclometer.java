//Keith Runes
//ksr218@lehigh.edu
//09/03/14
//CSE02 110


//This program is a cyclometer. It should be able to:
//  -print the number of minutes for each trip
//  -print the number of counts for each trip
//  -print the distance of each trip in miles
//  -print the distance for the two trips combined


//Let's get started and stuff. 


//Define the class.
public class Cyclometer{

    
    //Define main method.
    public static void main(String[] args){
        
        //Input data.
        int secsTrip1=480; //Stores the number of seconds in Trip 1
        int secsTrip2=3220; //Stores the number of seconds in Trip 2
        int countsTrip1=1561; //Stores the rotation count of Trip 1
        int countsTrip2=9037; //Stores the rotation count of Trip 2
        
        double wheelDiameter=27.0,
        PI=3.14159, 
        feetPerMile=5280, 
        inchesPerFoot=12, 
        secondsPerMinute=60; 
        double distanceTrip1, distanceTrip2,totalDistance; 
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+ " counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+ " counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        //Converts the revolution count into inches then miles 
        
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
            
        
    }//DONE WITH METHOD!
   
}//DONE WITH CLASS! 
    
    

    
    
    
