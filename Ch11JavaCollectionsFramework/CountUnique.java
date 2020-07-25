/*
   Write a method countUnique that takes a List of integers as a parameter and returns the number of unique integer values in the list.
   Use a Set as auxiliary storage to help you solve this problem.
   
   For example, if a list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], your method should return 5.
   The empty list contains 0 unique values.
*/

import java.util.*;

public class CountUnique
{
   public static void main(String[] args)
   {
      List<Integer> testList = new ArrayList<Integer>();
      testList.add(3);
      testList.add(7);
      testList.add(3);
      testList.add(-1);
      testList.add(2);
      testList.add(3);
      testList.add(7);
      testList.add(2);
      testList.add(15);
      testList.add(15);
      
      System.out.println(testList);
      
      System.out.println(countUnique(testList));
      
   }
   
   public static int countUnique(List<Integer> list)
   {
      Set<Integer> set = new HashSet<Integer>(list);
      return set.size();   
   }
}