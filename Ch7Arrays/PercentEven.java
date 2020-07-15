/*
   Write a method called percentEven that accepts an array of integers as a parameter and returns the percentage of even numbers in the array as a real number.
   If the array contains no even elements or no elements at all, return 0.0. 
*/

public class PercentEven
{
   public static void main(String[] args)
   {
      int[] testArray = {6, 2, 9, 11, 3};
      System.out.println(percentEven(testArray));
   }
   
   public static double percentEven(int[] list)
   {
      int count = 0;
      double percent = 0.0;
      
      if(list.length < 1)
      {
         return percent;
      }
      
      else
      {
         for(int i=0; i < list.length; i++)
         {
            if(list[i] % 2 == 0)
            {
               count++;   
            }
         }
         
         if(count == 0)
         {
            percent = 0.0;
         }
         
         else
         {
            percent = (double)count / list.length * 100;
         }
      }
      
      return percent;
      
   }
}