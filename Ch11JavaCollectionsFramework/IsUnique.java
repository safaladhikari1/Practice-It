/*
   Write a method isUnique that accepts a Map from strings to strings as a parameter and returns true if no two keys map to the same value (and false if any two or more keys do map to the same value).
   For example, calling your method on the following map would return true:
   {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
   
   Calling it on the following map would return false, because of two mappings for Perkins and Reges:
   {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
   The empty map is considered to be unique, so your method should return true if passed an empty map.
   
*/

import java.util.*;

public class IsUnique
{
   public static void main(String[] args)
   {
      Map<String, String> testMap1 = new HashMap<String, String>();
      
      testMap1.put("Marty", "Stepp");
      testMap1.put("Stuart", "Reges");
      testMap1.put("Jessica", "Miller");
      testMap1.put("Amanda", "Camp");
      testMap1.put("Hal", "Perkins");
      
      System.out.println(testMap1);
      
      Map<String, String> testMap2 = new HashMap<String, String>();
      
      testMap2.put("Kendrick", "Perkins");
      testMap2.put("Stuart", "Reges");
      testMap2.put("Jessica", "Miller");
      testMap2.put("Bruce", "Reges");
      testMap2.put("Hal", "Perkins");
      
      System.out.println(testMap2);
      
          
      System.out.println(isUnique(testMap1));
           
   }
   
   public static boolean isUnique(Map<String, String> map)
   {
      Set<String> keySet = map.keySet();
      Collection<String> valueCollection = map.values();
      
      // to remove the duplicates we will bring valueCollection to HashSet
      
      HashSet<String> valueNoDuplicates = new HashSet<String>(valueCollection);
      
      // compare the size between keySet.size() and valueNoDuplicates.size()
      
      return keySet.size() == valueNoDuplicates.size();
                     
   }
}