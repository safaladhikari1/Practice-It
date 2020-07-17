/*
   Write a method called collapse that accepts an array of integers as a parameter and returns a new array containing the result of replacing each pair of integers with the sum of that pair.
   For example, if an array called list stores the values {7, 2, 8, 9, 4, 13, 7, 1, 9, 10}, then the call of collapse(list) should return a new array containing {9, 17, 17, 8, 19}.
   The first pair from the original list is collapsed into 9 (7 + 2), the second pair is collapsed into 17 (8 + 9), and so on.
   If the list stores an odd number of elements, the final element is not collapsed.
   For example, if the list had been {1, 2, 3, 4, 5}, then the call would return {3, 7, 5}. Your method should not change the array that is passed as a parameter.  
*/

public class Collapse
{
   public static void main(String[] args)
   {
      int[] testArray = {1, 2, 3, 4, 5};
      int[] testArray2 = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
      
      int[] a = collapse(testArray2);
      
      for(int i=0; i < a.length; i++)
      {
         System.out.print(a[i] + " ");
      }
              
   }
   
   public static int[] collapse(int[] list)
   {     
      if(list.length % 2 == 0)
      {
         int[] resultArray = new int[list.length/2];
         
         int count = 0;
         
         for(int i=0; i<list.length-1; i+=2)
         {
            int total = list[i] + list[i+1];
            resultArray[count] = total; 
            count++;  
         }
         
         //resultArray[count] = list[list.length - 1];
         
         return resultArray;    
      
      }
      
      else
      {
         int[] resultArray = new int[list.length/2 + 1];
         
         int count = 0;
         
         for(int i=0; i<list.length-1; i+=2)
         {
            int total = list[i] + list[i+1];
            resultArray[count] = total; 
            count++;  
         }
         
         resultArray[count] = list[list.length - 1];
         
         return resultArray; 
      }         
   }
}