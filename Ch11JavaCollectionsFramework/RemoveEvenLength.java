/*
   Write a method removeEvenLength that takes a Set of strings as a parameter and that removes all of the strings of even length from the set.
   For example, if your method is passed a set containing the following elements:
   
   ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
   
   Your method should modify the set to store the following elements (the order of the elements does not matter):
   
   ["foo", "bar", "spoon", "!"]
*/

import java.util.*;

public class RemoveEvenLength
{
   public static void removeEvenLength(Set<String> set)
   {
      Iterator<String> itr = set.iterator();
      
      while(itr.hasNext())
      {
         if(itr.next().length() % 2 == 0)
         {
            itr.remove();
         }
      }   
   }
}