/*
   Write a static method called numUnique that takes a 
   sorted array of integers as a parameter and that returns
   the number of unique values in the array. The array is guaranteed
   to be in sorted order, which means that duplicates will be grouped together.
*/

public class NumUnique
{
   public static void main(String[] args)
   {
      int[] testArray = {2, 4, 4, 5};
      System.out.println(numUnique(testArray));
   }
   
   public static int numUnique(int[] list)
   {
      if(list.length == 0)
      {
         return 0;
      }
      else
      {
         int count = 1;
         for(int i = 1; i < list.length; i++)
         {
            if(list[i] != list[i-1])
            {
               count++;
            }
         }
         
         return count;
      }
   }
}
