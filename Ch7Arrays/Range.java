// Write a static method named range that takes an array of integers as a parameter and returns the range of values contained in the array. The range of an array is defined to be one more than the difference between its largest and smallest element. For example, if the largest element in the array is 15 and the smallest is 4, the range is 12. If the largest and smallest values are the same, the range is 1.

public class Range
{
   public static void main(String[] args)
   {
      int[] a1 = {8, 3, 5, 7, 2, 4};
      
      System.out.println(range(a1));   
   }
   
   public static int range(int[] list)
   {
      
      int max = list[0];
      int min = list[0];
      
      for(int i = 0; i < list.length; i++)
      {
         
         if(list[i] > max)
         {
            max = list[i];
         }
         
         if(list[i] < min)
         {
            min = list[i];
         }
      }
      
      return max - min + 1;      
   }
}