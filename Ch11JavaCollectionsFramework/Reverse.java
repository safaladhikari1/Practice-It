/*
   Write a method reverse that accepts a Map from integers to strings as a parameter and returns a new Map of strings to integers that is the original's "reverse". 
   The reverse of a map is defined here to be a new map that uses the values from the original as its keys and the keys from the original as its values.
   Since a map's values need not be unique but its keys must be, it is acceptable to have any of the original keys as the value in the result.
   In other words, if the original map has pairs (k1, v) and (k2, v), the new map must contain either the pair (v, k1) or (v, k2).
   
   For example, for the following map:

   {42=Marty, 81=Sue, 17=Ed, 31=Dave, 56=Ed, 3=Marty, 29=Ed}
   
   Your method could return the following new map (the order of the key/value pairs does not matter):
   
   {Marty=3, Sue=81, Ed=29, Dave=31}
*/

import java.util.*;

public class Reverse
{
   public static void main(String[] args)
   {
      Map<Integer, String> myMap = new HashMap<Integer, String>();
      
      myMap.put(42, "Marty");
      myMap.put(81, "Sue");
      myMap.put(17, "Ed");
      myMap.put(31, "Dave");
      myMap.put(56, "Ed");
      myMap.put(3, "Marty");
      myMap.put(29, "Ed");
      
      System.out.println(myMap);
      
      reverse(myMap);
              
   }
   
   public static Map<String, Integer> reverse(Map<Integer, String> map)
   {
      
      Map<String, Integer> myMap2 = new HashMap<String, Integer>();
      
      Set<Integer> oldKeySet = map.keySet();
      
      for(int num: oldKeySet)
      {
         myMap2.put(map.get(num), num);
      }
      
      return myMap2;     
   }
}