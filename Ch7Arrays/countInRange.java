// Write a method called countInRange that accepts an array of integers, a minimum value, and a maximum value as parameters and returns the count of how many elements from the array fall between the minimum and maximum (inclusive).

public class countInRange
{
   public static void main(String[] args)
   {
      int[] testArray = {14, 1, 22, 17, 36, 7, -43, 5};
      System.out.println(countInRange(testArray, 4, 17));
   }
   
   public static int countInRange(int[] list, int min, int max)
   {     
      int count = 0;
      
      for(int i=0; i < list.length; i++)
      {
         if(list[i] >= min && list[i] <= max)
         {
            count++;
         }
      }
      
      return count;
   }
}