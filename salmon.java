import java.io.*;
import static java.lang.System.*;
import java.util.*;
import java.util.Scanner;

class Salmon
{

   public static void main (String str[]) throws IOException 
   {
     
      
      //Initialize the rooms, numbers, and distances
      ArrayList<Room> Rooms = new ArrayList<Room>();
      
      Room room101 = new Room(101,10); 
         
      
      
      Stairway one = new Stairway("1"); // Stairway #2
      Stairway two = new Stairway("2"); // Stairway # 5
      Stairway three = new Stairway("3"); // Stairway #8
      Stairway four = new Stairway("4"); // Stairway #16
     
     
      
     //Read array for student directions
     //Array syntax: each collumn is a student's schedule for two periods (by room number). 
      
     //calculate distances from room to room via different stairs
     for(int i = 0; i < schedule[0].length; i++)
     {
        if(schedule[0][i].getFloor() == 1 && schedule[1][i].getFloor() == 2)
        {
           //subtract from accumulator 
           one.subDistance( schedule[0][i].getDist1() + schedule[1][i].getDist1() );
           two.subDistance( schedule[0][i].getDist2() + schedule[1][i].getDist2() );
           three.subDistance( schedule[0][i].getDist3() + schedule[1][i].getDist3() );
           four.subDistance( schedule[0][i].getDist4() + schedule[1][i].getDist4() );
        }
        else if(schedule[0][i].getFloor() == 2 && schedule[1][i].getFloor() == 1)
        {
           //add to accumulator
           one.addDistance( schedule[0][i].getDist1() + schedule[1][i].getDist1() );
           two.addDistance( schedule[0][i].getDist2() + schedule[1][i].getDist2() );
           three.addDistance( schedule[0][i].getDist3() + schedule[1][i].getDist3() );
           four.addDistance( schedule[0][i].getDist4() + schedule[1][i].getDist4() );
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
      
      int biggest = totalDist.get(3);
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
          }  
                
       int biggest2 = totalDist.get(2);
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
      
      System.out.println("Stairway #1: " + one.up);
      System.out.println("Stairway #2: " + two.up);
      System.out.println("Stairway #3: " + three.up);
      System.out.println("Stairway #4: " + four.up);
      
   }
          
  
}


