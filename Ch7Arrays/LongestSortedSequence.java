/*
   Write a method named longestSortedSequence that accepts an array of integers as a parameter and that returns the length of the longest sorted (nondecreasing) sequence of integers in the array. 
   Your method should return 0 if passed an empty array.
*/

public class LongestSortedSequence
{
   public static void main(String[] args)
   {
      int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2};
      
      System.out.println(longestSortedSequence(array2));
         
   }
   
   public static int longestSortedSequence(int[] list)
   {      
      if(list.length == 0)
      {
         return 0;
      }
      
      else
      {
         int initialCount = 0;
         int finalCount = 0;
         
         for(int i = 0; i < list.length - 1; i++)
         {
            if(list[i+1] >= list[i])
            {
               initialCount++;
               
               if(initialCount > finalCount)
               {
                  finalCount = initialCount;
               }                       
            }
            else
            {
               initialCount = 0;
            }
         } 
         
         return finalCount + 1; 
      }
   }
}