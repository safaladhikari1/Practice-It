// Write a static method named isSorted that accepts an array of doubles as a parameter and returns true if the list is in sorted (nondecreasing) order and false otherwise. 
// Assume the array has at least one element. A one-element array is considered to be sorted.

public class IsSorted
{
   public static void main(String[] args)
   {
      double[] array1 = {16.1, 12.3, 22.2, 14.4};
      double[] array2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
      
      System.out.println(isSorted(array1));
      System.out.println(isSorted(array2));
   }
   
   public static boolean isSorted(double[] list)
   {
      boolean flag = true;
      
      if(list.length == 1)
      {
         flag = true;
      }
      else
      {
         
         for(int i=0; i < list.length - 1; i++)
         {
            if(list[i] > list[i+1])
            {
               flag = false;   
            }   
         }      
      }
      
      return flag;
   }
}