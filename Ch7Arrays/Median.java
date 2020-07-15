/*
   Write a method called median that accepts an array of integers as its argument and returns the median of the numbers in the array. 
   The median is the number that will appear in the middle if you arrange the elements in order. 
   Assume that the array is of odd size (so that one sole element constitutes the median) and that the numbers in the array are between 0 and 99 inclusive.
*/

public class Median
{
   public static void main(String[] args)
   {
      int[] testArray1 = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
      int[] testArray2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
      
      median(testArray1);
      median(testArray2);
   }
   
   public static int median(int[] list)
   {
      int arrayLength = list.length;
      
      // sorting the array using bubbleSort Algorithm
      
      for(int i = 0; i < list.length - 1; i++)
      {
         for(int j = 0; j < list.length - i - 1; j++)
         {
            if(list[j] > list[j+1])
            {
               int temp = list[j];
               list[j] = list[j+1];
               list[j+1] = temp;   
            }                      
         }
      }
      
      int medianIndex = list.length / 2;
      
      return list[medianIndex];
          
   }  
}