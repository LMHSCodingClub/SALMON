import java.io.*;
import static java.lang.System.*;
import java.util.*;
//import java.util.Scanner;

public class Stairway
{
  public double distance = 0;
  public String name = "Stairway ";
  public boolean up = false;
  
  Stairway(String in_name)
  {
    name += in_name;
  }
  
  public double getDistance()
  {
   return distance; 
  }
  
  public void addDistance(double add)
  {
    distance += add;
  }
  
  public void subDistance(double sub)
  {
    distance -= sub;
  }
  
  public void setDirection(boolean input)
  {
   up = input; 
  }
  
  public void setDirection(String input)
  {
   if(input.equals("up"))
     up = true;
   else
     up = false;
  }
  
}
