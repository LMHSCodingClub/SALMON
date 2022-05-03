import java.io.*;
import static java.lang.System.*;
import java.util.*;
//import java.util.Scanner;

public class Room
{
   final static double TOP_LENGTH = 40.7;
   final static double TOP_WIDTH = 37.7;
   final static double TOP_SPEC_CASE = 6; // for rooms 214 and 221
   
   final static double BOTTOM_LENGTH_SQR = 36.9;
   final static double BOTTOM_LENGTH_HALL = 45;
   final static double BOTTOM_WIDTH = 40.5;

   
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
        //          Lang Hallway
        if ( (number > 120 && number < 129) || (number == 199))
        {
         //calculate distances
         
           //Auditorium
           if (number == 199)
           {
             distance1 += 15.75;
             distance2 += 15.75;
             distance3 += 15.75;
             distance4 += 15.75;
           }

           //Lang Hallway
           else if (number > 122 && number < 129)
           {
             distance1 += 15.75 + 29.55;
             distance2 += 15.75 + 29.55;
             distance3 += 15.75 + 29.55;
             distance4 += 15.75 + 29.55;
           }

           //Music Hall
           else //if (number == 121 || number == 122)
           {
             distance1 += 20;
             distance2 += 20;
             distance3 += 20;
             distance4 += 20;
           }
           
           if (number == 122)
           {
             distance1 += 19;
             distance2 += 19;
             distance3 += 19;  
             distance4 += 19;
           }
           //20, 39  
           
           //account for nexus distances
           distance1 += 80;
           distance2 += 80 + 40.5;
           distance3 += 22 + 40.5;
           distance4 += 22;
        }
        else //any other number on floor 1
        {
           
           final double STAIRCASE_3_4_RIGHT = 22;
           final double STAIRCASE_3_4_LEFT = BOTTOM_LENGTH_SQR - STAIRCASE_3_4_RIGHT;
           final double CAFE_TOP_LEFT = 13;
           final double CAFE_SIDE_TO_HALL = 9;

           // Designators are taken relative to the bottom-left corner of the square
           if(number <= 103)
           {
             distance1 = BOTTOM_LENGTH_HALL - designate;
             distance2 = BOTTOM_LENGTH_HALL + designate + BOTTOM_WIDTH;
             distance3 = STAIRCASE_3_4_LEFT + designate + BOTTOM_WIDTH;
             distance4 = designate + STAIRCASE_3_4_LEFT;
           }
           else if(number == 105) //104 does not exist. MAybe make it the band room?
           {
             distance1 = BOTTOM_LENGTH_HALL + designate;
             distance2 = BOTTOM_LENGTH_HALL + designate + BOTTOM_WIDTH;
             distance3 = STAIRCASE_3_4_LEFT + designate + BOTTOM_WIDTH;
             distance4 = STAIRCASE_3_4_LEFT - designate; 
           }
           else if(number == 106 || number == 108) //106 is the lower art room, which is also 108 for some reason
           {
             distance1 = BOTTOM_LENGTH_HALL + designate;
             distance2 = BOTTOM_LENGTH_HALL - designate + BOTTOM_WIDTH;
             distance3 = STAIRCASE_3_4_LEFT - designate + BOTTOM_WIDTH;
             distance4 = STAIRCASE_3_4_LEFT + designate; 
           }
           else if(number == 107) //107 is the cafeteria. Special case. Designate is width-displacement
           {
             distance1 = BOTTOM_LENGTH_HALL + CAFE_SIDE_TO_HALL;
             distance2 = CAFE_TOP_LEFT;
             distance3 = STAIRCASE_3_4_LEFT + CAFE_SIDE_TO_HALL;
             distance4 = STAIRCASE_3_4_LEFT + BOTTOM_WIDTH + CAFE_SIDE_TO_HALL;
           }
           else if(number == 109)
           {
             distance1 = BOTTOM_LENGTH_HALL + designate;
             distance2 = BOTTOM_LENGTH_HALL + designate + BOTTOM_WIDTH;
             distance3 = STAIRCASE_3_4_LEFT + designate + BOTTOM_WIDTH;
             distance4 = STAIRCASE_3_4_LEFT - designate; 
           }
           else if(number <= 118) // designate reffers to the width dispacement relative to the bottom left corner
           {
             distance1 = BOTTOM_LENGTH_HALL + BOTTOM_LENGTH_SQR + designate;
             distance2 = BOTTOM_LENGTH_HALL + BOTTOM_LENGTH_SQR + BOTTOM_WIDTH - designate;
             distance3 = STAIRCASE_3_4_RIGHT + BOTTOM_WIDTH - designate;
             distance4 = STAIRCASE_3_4_RIGHT + designate; 
           }
           else if(number <= 120) // designate is horizontal displacenent from the left corner. Rooms 119 and 120
           {
             distance1 = BOTTOM_LENGTH_HALL + designate + BOTTOM_WIDTH;
             distance2 = BOTTOM_LENGTH_HALL + designate;
             distance3 = designate - STAIRCASE_3_4_LEFT;
             distance4 = BOTTOM_LENGTH_SQR - designate + BOTTOM_WIDTH + STAIRCASE_3_4_RIGHT; 
           }
           else if(number == 121) //"Planeterium", A.K.A Blair's room -- NOTE: 121 and 122 are music rooms, use different number?
           {
             distance1 = 2 * BOTTOM_LENGTH_HALL + BOTTOM_WIDTH - 3; //3 is Distance from Stair#2 to Blair's room
             distance2 = 3;
             distance3 = BOTTOM_LENGTH_HALL + STAIRCASE_3_4_LEFT - 3;
             distance4 = BOTTOM_LENGTH_HALL + BOTTOM_WIDTH + STAIRCASE_3_4_LEFT - 3;
           }
        }
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
