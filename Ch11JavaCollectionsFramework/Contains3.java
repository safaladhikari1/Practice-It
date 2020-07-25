/*
   Write a method contains3 that accepts a List of strings as a parameter and returns true if any single string occurs at least 3 times in the list,
   and false otherwise. Use a map as auxiliary storage.
*/

import java.util.*;

public class Contains3
{
   public static boolean contains3(List<String> list)
   {
      Map<String, Integer> map = new HashMap<String, Integer>();
      
      Iterator<String> itr = list.iterator();
      
      while(itr.hasNext())
      {
         String word = itr.next();
         
         if(map.containsKey(word))
         {
            map.put(word, map.get(word) + 1);
         }
         else
         {
            map.put(word, 1);
         }        
      }
      
      return map.containsValue(3);        
   }
}