/*
   Write a method hasOdd that takes a Set of integers as a parameter and that returns true if the set contains at least one odd integer, and false otherwise.
   If passed the empty set, your method should return false.
*/

import java.util.*;

public class HasOdd
{
   public static boolean hasOdd(Set<Integer> set)
   {      
      Iterator<Integer> itr = set.iterator();
      
      while(itr.hasNext())
      {
         
         if(itr.next() % 2 == 1)
         {
            return true;
         }
      }
      
      return false;   
   }
}