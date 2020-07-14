// Write a method called mode that returns the most frequently occurring element of an array of integers. Assume that the array has at least one element and that every element in the array has a value between 0 and 100 inclusive. Break ties by choosing the lower value.  

public class Mode
{
   public static void main(String[] args)
   {
      int[] array1 = {27, 15, 15, 11, 27};
      System.out.println(mode(array1));
   }
   
   public static int mode(int[] list)
   {
      int[] count = new int[101];
          
      for(int i = 0; i < list.length; i++)
      {
         count[list[i]]++;
      }
      
      int index = 0;
      int mode = 101;
      
      for(int j=0; j < count.length; j++)
      {
         if(count[j] > index)
         {
            index = count[j];
            mode = j;
         }
                 
      }     
      return mode;                 
   }
}