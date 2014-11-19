/*
  Keith Runes
  hw10 - FindDuplicates.java
  
  This program includes four methods, the main method and a String-ouput method, which are initially given, and two
  boolean-ouput methods, hasDups() and exactlyOneDup(). The method hasDups() returns true if and only if the 
  input array has at least one repeated entry. The method exactlyOneDup() returns true if and only if there is 
  exactly one repeated entry.
*/

//import Scanner function
import java.util.Scanner;

//define the class
public class FindDuplicates{
  
  //This is the first method hasDups(). Its input is an array, num[], whose values are given 
  //by the user's input in the Scanner scan object. It has an output boolean type.
  public static boolean hasDups(int[] num)
  {
    int test = 0;
    
    //If a number of position 'j' in array num[] has the same value of a number of position 'i'
    //in the same array, then the variable 'test' increases and the iteration continues. 
    //If not, only the iteration continues.
    for(int i = 0; i < 10; i++)
    { 
      int j = 0;
      while(j < 10)
      { 
        if(num[i] == num[j] && (i != j))
        {
           test++;
           j++;
        }
        else
        {
          j++;
        }
      }
    }

    //If 'test' > 2, (not 1, since I took into account the fact that the above loop increases
    //'test' if it compared the value to itself) then the method hasDups() returns true. If not,
    //it returns false.
    if(test > 2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  //This is the second method exactlyOneDup). Its input is an array, num[], whose values are given 
  //by the user's input in the Scanner scan object. It has an output boolean type.
  public static boolean exactlyOneDup(int[] num)
  { 
    int test = 0;
    
    //This part is exactly the same as the above method. If a number of position 'j' in array num[] 
    //has the same value of a number of position 'i'in the same array, then the variable 'test' 
    //increases and the iteration continues. If not, only the iteration continues.
    for(int i = 0; i < 10; i++)
    { 
      int j = 0;
      while(j < 10)
      {
        if(num[i] == num[j] && (i != j))
        {
           test++;
           j++;
        }
        else
        {
          j++;
        }
      }
    }
    
    //If 'test' == 2, (not 1, since I took into account the fact that the above loop increases
    //'test' if it compared the value to itself) then the method exactlyOneDup() returns true. 
    //If not,it returns false.
    if(test == 2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");//User enters input for 10 ints here
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);


System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();


    }while(answer.equals("Y") || answer.equals("y"));

  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
}
