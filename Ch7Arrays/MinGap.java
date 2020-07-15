/*
   Write a method named minGap that accepts an integer array as a parameter and returns the minimum 'gap' between adjacent values in the array. 
   The gap between two adjacent values in a array is defined as the second value minus the first value. 
   
   This gap information can be helpful for determining other properties of the array. 
   For example, if the minimum gap is greater than or equal to 0, then you know the array is in sorted (nondecreasing) order. If the gap is greater than 0, then you know the array is both sorted and unique (strictly increasing).
*/

public class MinGap
{
   public static void main(String[] args)
   {
      int[] testArray = {1, 3, 6, 7, 12};
      System.out.println(minGap(testArray));
   }
   
   public static int minGap(int[] list)
   {
      if(list.length < 2)
      {
         return 0;
      }
      else
      {
         
         int minDifference = list[1] - list[0];
         
         for(int i = 1; i < list.length - 1; i++)
         {
            int difference = list[i+1] - list[i];
            
            if(difference < minDifference)
            {
               minDifference = difference;
            }
         }
         
         return minDifference;        
      }
   }
}