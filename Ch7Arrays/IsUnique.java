/*
   Write a method named isUnique that takes an array of integers as a parameter and that returns a boolean value indicating whether or not the values in the array are unique (true for yes, false for no).
   The values in the list are considered unique if there is no pair of values that are equal.  
*/

public class IsUnique
{
   public static void main(String[] args)
   {
      int[] list1 = {3, 8, 12, 2, 9, 17, 43};
      int[] list2 = {4, 7, 2, 7, 9, 12, 3};
      
      System.out.println(isUnique(list1));
      System.out.println(isUnique(list2));
   }
   
   public static boolean isUnique(int[] list)
   {      
      if(list.length < 2)
      {
         return true;
      }
      
      else
      {
         for(int i = 0; i < list.length; i++)
         {
            int element = list[i];
            
            for(int j = i + 1; j < list.length; j++)
            {
               if(element == list[j])
               {
                  return false;
               }
            }
         }
         
         return true;
      }
   }
}