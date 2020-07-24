/*
   Write a method called alternate that accepts two Lists of integers as its parameters and returns a new List containing alternating elements from the two lists, in the following order:
   
   First element from first list
   First element from second list
   Second element from first list
   Second element from second list
   Third element from first list
   Third element from second list
   
   If the lists do not contain the same number of elements, the remaining elements from the longer list should be placed consecutively at the end.
   For example, for a first list of (1, 2, 3, 4, 5) and a second list of (6, 7, 8, 9, 10, 11, 12), a call of alternate(list1, list2) should return a list containing (1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12). Do not modify the parameter lists passed in.
*/

import java.util.*;

public class Alternate
{
   public static void main(String[] args)
   {
      List<Integer> testList1 = new ArrayList<>();
      testList1.add(1);
      testList1.add(2);
      testList1.add(3);
      testList1.add(4);
      testList1.add(5);
      
      System.out.println(testList1);
      
      List<Integer> testList2 = new ArrayList<>();
      testList2.add(6);
      testList2.add(7);
      testList2.add(8);
      testList2.add(9);
      testList2.add(10);
      testList2.add(11);
      testList2.add(12);
      
      System.out.println(testList2);
      
      List<Integer> testList3 = alternate(testList1, testList2);
      
      System.out.println(testList3);        
   }
   
   public static List<Integer> alternate(List<Integer> list1, List<Integer> list2)
   {
      List<Integer> list3 = new ArrayList<>();
      
      Iterator<Integer> a1 = list1.iterator();
      Iterator<Integer> a2 = list2.iterator();
      
      while(a1.hasNext() || a2.hasNext())
      {
         if(a1.hasNext())
         {
            list3.add(a1.next());
         }
         
         if(a2.hasNext())
         {
            list3.add(a2.next());
         }   
      }
    
      return list3;          
   }
}