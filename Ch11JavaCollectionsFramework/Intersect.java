/*
   Write a method intersect that takes two Maps of strings to integers as parameters and that returns a new map whose contents are the intersection of the two.
   The intersection of two maps is defined here as the set of keys and values that exist in both maps.
   So if some key K maps to value V in both the first and second map, include it in your result.
   If K does not exist as a key in both maps, or if K does not map to the same value V in both maps, exclude that pair from your result.
   
   For example, consider the following two maps:
   
   {Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95}
   {Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87}
   
   Calling your method on the preceding maps would return the following new map (the order of the key/value pairs does not matter):
   
   {Logan=62, Stefanie=80, Jeff=88, Kim=52}
*/

import java.util.*;

public class Intersect
{
   public static void main(String[] args)
   {
      Map<String, Integer> testMap1 = new HashMap<String, Integer>();
      Map<String, Integer> testMap2 = new HashMap<String, Integer>();
      
      testMap1.put("Janet", 87);
      testMap1.put("Logan", 62);
      testMap1.put("Whitaker", 46);
      testMap1.put("Alyssa", 100);
      
      System.out.println(testMap1);
      
      testMap2.put("Logan", 62);
      testMap2.put("Kim", 52);
      testMap2.put("Whitaker", 52);
      testMap2.put("Jeff", 88);
      
      System.out.println(testMap2);
      
      //intersect(testMap1, testMap2);
      
      System.out.println(intersect(testMap1, testMap2));
             
   }
   
   public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2)
   {
      Map<String, Integer> testMap3 = new HashMap<String, Integer>();
      
      Set<String> map1keySet = new HashSet<String>();
      
      map1keySet = map1.keySet();
      
      for(String map1key: map1keySet)
      {
         if(map2.containsKey(map1key) && map2.containsValue(map1.get(map1key)))
         {
            testMap3.put(map1key, map2.get(map1key));   
         }
      }
      
      return testMap3;  
   }
}