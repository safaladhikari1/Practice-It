/*
   Write a method called removeInRange that accepts four parameters: an ArrayList of integers, an element value, a starting index, and an ending index.
   The method's behavior is to remove all occurrences of the given element that appear in the list between the starting index (inclusive) and the ending index (exclusive).
   Other values and occurrences of the given value that appear outside the given index range are not affected.
*/

import java.util.*;

public class RemoveInRange
{
   public static void main(String[] args)
   {
      ArrayList<Integer> test = new ArrayList<>();
      
      test.add(0);
      test.add(4);
      test.add(8);
      test.add(7);
      test.add(3);
      test.add(2);
           
      System.out.println(test);
      
      removeInRange(test, 7, 1, 4);
      
      System.out.println(test);
    
   }
   
   public static void removeInRange(ArrayList<Integer> list, int element, int start, int end)
   {      
      for(int i = start; i < end; i++)
      {
         if(element == list.get(i))
         {
            list.remove(i);
            i--;
            end--;
         }      
      }      
   }
}