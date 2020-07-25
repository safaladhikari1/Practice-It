/*
   Write a method maxLength that takes a Set of strings as a parameter and that returns the length of the longest string in the set.
   If your method is passed an empty set, it should return 0.
*/

import java.util.*;

public class MaxLength
{
   public static int maxLength(Set<String> set)
   {
      int maxCount = 0;
      
      for(String word: set)
      {
         if(word.length() > maxCount)
         {
            maxCount = word.length();
         }
      }
      
      return maxCount;      
   }
}