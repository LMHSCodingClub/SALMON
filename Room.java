import java.io.*;
import static java.lang.System.*;
import java.util.*;
//import java.util.Scanner;

public class Room
{
   final static double TOP_LENGTH = 40.7;
   final static double TOP_WIDTH = 37.7;
   final static double TOP_SPEC_CASE = 6; // for rooms 214 and 221
   
   public int number = 0;
   public int floor = 0;
   
   public double designate = 0; // means something different depending on location
   
   public double distance1 = 0;
   public double distance2 = 0;
   public double distance3 = 0;
   public double distance4 = 0;
   
   Room(int number, double designate)
   {
      this.number = number;

      if(number/100 = 1) // on floor 1
      {
        floor = 1;
        //calculate distances
      }
      else
      {
        floor = 2;
        if(number < 206)
        {
           distance1 = designate;
           distance2 = TOP_WIDTH - designate;
           distance3 = distance2 + TOP_LENGTH;
           distance4 = distance1 + TOP_LENGTH;
        }
         else if (number < 214)
         {
           distance1 = designate;
           distance2 = distance1 + TOP_WIDTH;
           distance4 = TOP_LENGTH - designate;
           distance3 = distance4 + TOP_WIDTH;
         }
         else if (number == 214)
         {
           distance1 = TOPLENGTH + TOP_SPEC_CASE;
           distance2 = distance1 + TOP_WIDTH;
           distance4 = -TOP_SPEC_CASE;
           distance3 = TOP_SPEC_CASE + TOP_WIDTH;
         }
         else if(number < 221)
         {
          distance1 = TOP_LENGTH + designate;
          distance2 = TOP_LENGTH + TOP_WIDTH - desingate;
          distance3 = TOP_WIDTH - designate;
          distance4 = designate;  
         }
         else if(number == 221)
         {
          distance1 = TOP_LENGTH + TOP_WIDTH + TOP_SPEC_CASE;
          distance2 = TOP_LENGTH + TOP_SPEC_CASE;
          distance3 = -TOP_SPEC_CASE;
          distance4 = TOP_WIDTH + TOP_SPEC_CASE;
         }
         else // all other rooms, 222-227
         {
          distance2 = designate;
          distance1 = distance2 + TOP_WIDTH;
          distance3 = TOP_LENGTH - designate;
          distance4 = distance3 + TOP_WIDTH;
         }
      }

   }
   
  public int getRoomNumber()
  {
    return number;
  }
  
  public int getFloor()
  {
    return floor;
  }
  
  public double getDist1()
  {
    return distance1;
  }
  
  public double getDist2()
  {
    return distance2;
  }
  
  public double getDist3()
  {
    return distance3;
  }
  
  public double getDist4()
  {
    return distance4;
  }
  
  
   
   
   

}
