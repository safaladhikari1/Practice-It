// Write a method named lastIndexOf that accepts an array of integers and an integer value as its parameters and returns the last index at which the value occurs in the array. The method should return -1 if the value is not found. For example, in the list containing {74, 85, 102, 99, 101, 85, 56}, the last index of the value 85 is 5.

public class LastIndexOf
{
   public static void main(String[] args)
   {
      int[] testList = {74, 85, 102, 99, 101, 85, 56};
      System.out.println(lastIndexOf(testList, 85));
   }
   
   public static int lastIndexOf(int[] list, int value)
   {
      
      int index = -1;
      
      for(int i=0; i < list.length; i++)
      {
         if(list[i] == value)
         {
            index = i;
         }
      }
      
      return index;       
   }
}