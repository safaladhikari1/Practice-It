/*
   Write a static method removeZeros that takes an array of
   integers as a parameter and that moves any zeros in the 
   array to the end of the array, otherwise preserving the order of the list.  
*/

public class RemoveZeros
{
   public static void main(String[] args)
   {
      int[] testArray = {1, 2, 4, 0, 4, 5, 0, 8};
      removeZeros(testArray);
      
      for(int i = 0; i < testArray.length; i++)
      {
         System.out.print(testArray[i] + " ");
      }
   }
   
   public static void removeZeros(int[] list)
   {
      int count = 0; // how many non-zero values?
      for(int i = 0; i < list.length; i++)
      {
         if(list[i] != 0)
         {
            list[count] = list[i];
            count++;
         }
      }
      
      for(int i = count; i < list.length; i++)
      {
         list[i] = 0;
      }
   }
}