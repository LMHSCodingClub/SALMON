import java.io.*;
import static java.lang.System.*;
import java.util.*;
import java.util.Scanner;

class Salmon
{

   public static void main (String str[]) throws IOException 
   {
     
      double acc1 = 0;
      double acc2 = 0;
      double acc3 = 0;
      double acc4 = 0;
      //Initialize the rooms, numbers, and distances
     InitializeRooms();
      
     //Read array for student directions
     //Array syntax: each collumn is a student's schedule for two periods (by room number). 
      
     //calculate distances from room to room via different stairs
     for(int i = 0; i < schedule[0].length; i++)
     {
        if(schedule[0][i].getFloor() == 1 && schedule[1][i].getFloor == 2)
        {
           //subtract from accumulator 
           acc1 -= schedule[0][i].getDist1() + schedule[1][i].getDist1();
           acc2 -= schedule[0][i].getDist2() + schedule[1][i].getDist2();
           acc3 -= schedule[0][i].getDist3() + schedule[1][i].getDist3();
           acc4 -= schedule[0][i].getDist4() + schedule[1][i].getDist4();
        }
        else if(schedule[0][i].getFloor() == 2 && schedule[1][i].getFloor == 1)
        {
           //add to accumulator
           acc1 += schedule[0][i].getDist1() + schedule[1][i].getDist1();
           acc2 += schedule[0][i].getDist2() + schedule[1][i].getDist2();
           acc3 += schedule[0][i].getDist3() + schedule[1][i].getDist3();
           acc4 += schedule[0][i].getDist4() + schedule[1][i].getDist4();
        }
        else
        {
        //if they're on the same floor, no stairs are used.
        }
     }
      
     //compare. Maybe make a tree map???
     TreeSet<Integer> totalDist = new TreeSet<Integer>();
      totalDist.add(one.getDistance());
      totalDist.add(two.getDistance());
      totalDist.add(three.getDistance());
      totalDist.add(four.getDistance());
      
      //get biggest two
      //make them "up"
      
      int biggest = totalDist.get(0);
          switch (biggest) {
            case one.getDistance():  
                     one.setDirection("up");
                     break;
            case two.getDistance():  
                     two.setDirection("up");
                     break;
            case three.getDistance():   
                     three.setDirection("up");
                     break;
            case four.getDistance(): 
                     four.setDirection("up");
                     break;
             default:
                     break;
                
     //output
   }
      
      int biggest2 = totalDist.get(1);
           switch (biggest2) {
             case one.getDistance():  
                     one.setDirection("up");
                     break;
            case two.getDistance():  
                     two.setDirection("up");
                     break;
            case three.getDistance():   
                     three.setDirection("up");
                     break;
            case four.getDistance(): 
                     four.setDirection("up");
                     break;
              default:
                     break;
         
   }
           
   void InitalizeRooms()
   {
    //we initialize every room          
              
   }
  
}


