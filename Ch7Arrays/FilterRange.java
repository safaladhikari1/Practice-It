/*
   Write a method called interleave that accepts two ArrayLists of integers a1 and a2 as parameters and inserts the elements of a2 into a1 at alternating indexes.
   If the lists are of unequal length, the remaining elements of the longer list are left at the end of a1.
   For example, if a1 stores [10, 20, 30] and a2 stores [4, 5, 6, 7, 8], the call of interleave(a1, a2);
   should change a1 to store [10, 4, 20, 5, 30, 6, 7, 8].
   If a1 had stored [10, 20, 30, 40, 50] and a2 had stored [6, 7, 8], the call of interleave(a1, a2);
   would change a1 to store [10, 6, 20, 7, 30, 8, 40, 50].
*/

import java.util.*;

public class FilterRange
{
   public static void filterRange(ArrayList<Integer> list, int min, int max)
   {
      // loop through the list
      // store the int element = list.get(i).intValue()
      // if element >= min && element <= max
         // remove i
      
      int lastIndex = list.size();
         
      for(int i=0; i<lastIndex; i++)
      {
         int element = list.get(i).intValue();
         
         if(element >= min && element <= max)
         {
            list.remove(i);
            i--;
            lastIndex--;
            
         }
         
      }        
   }
}