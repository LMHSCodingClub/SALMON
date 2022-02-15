import java.io.*;
import static java.lang.System.*;
import java.util.*;
//import java.util.Scanner;

public class Room
{
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
        //calculate distances
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
