/*
   Write a method sum5 that takes an array of integers as a parameter and
   that returns a new array of length 5 that contains a series of sums.
   The first value in the result should be the sum of every fifth number in the list starting
   with the first number (1st, 6th, 11th, 16th, etc), the second value in the result
   should be the sum of every fifth number in the list starting with the second number(2nd, 7th, 12th, 17th, etc), and so on.
*/

public class ArraySum
{
   public static void main(String[] args)
   {
      int[] testArray = {7, 8, 3, 4, 9, 2, 5, 8, 13, 7};
      
      int[] resultArray = sum5(testArray);
      
      for(int i=0; i<resultArray.length; i++)
      {
         System.out.print(resultArray[i] + " ");
      }
   }
   
   public static int[] sum5(int[] list)
   {
      int[] sum = new int[5];
      
      for(int i = 0; i < list.length; i++)
      {
         sum[i % 5] += list[i];
         
         /*
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ...
            0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, ...
            list[0, 5, 10, 15, ...] -> sum[0]
            list[1, 6, 11, 16, ...] -> sum[1]
            list[2, 7, 12, 17, ...] -> sum[2]
            list[3] -> sum[3]
            list[4] -> sum[4]
            list[5] -> sum[0]        
         */
      }
      
      return sum;
   }
}