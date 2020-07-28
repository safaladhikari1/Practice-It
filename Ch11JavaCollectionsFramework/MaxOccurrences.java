/*
   Write a method maxOccurrences that accepts a List of integers as a parameter and returns the number of times the most frequently occurring integer (the "mode") occurs in the list.
   Solve this problem using a Map as auxiliary storage. If the list is empty, return 0.
*/

import java.util.*;

public class MaxOccurrences
{
   public static void main(String[] args)
   {
      List<Integer> myList = new ArrayList<Integer>();
      myList.add(2);
      myList.add(1);
      myList.add(6);
      myList.add(2);
      myList.add(3);
      myList.add(2);
      
      System.out.println(myList);
      
      System.out.println(maxOccurrences(myList));
         
   }
   
   public static int maxOccurrences(List<Integer> list)
   {
      Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
      
      int mostOccurrences = 0;
      
      for(int num: list)
      {              
         if(myMap.containsKey(num))
         {
            myMap.put(num, myMap.get(num) + 1);
         }
         else
         {
            myMap.put(num, 1);   
         }
         
         if(myMap.get(num) > mostOccurrences)
         {
            mostOccurrences = myMap.get(num);
         }
      }
      
      return mostOccurrences;    
   }
}