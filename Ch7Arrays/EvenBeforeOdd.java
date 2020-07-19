// incomplete

public class EvenBeforeOdd
{
   public static void main(String[] args)
   {
      int[] testArray = {5, 4, 2, 11, 9, 10, 4, 7, 3};
      
      evenBeforeOdd(testArray);
      
      for(int i=0; i<testArray.length; i++)
      {
         System.out.print(testArray[i] + " ");
      }
   }
   
   public static void evenBeforeOdd(int[] list)
   {
      // loop through the array
      // if list[i] % 2 == 0, put the element at list[0]
      // shift the elements to the right
      // repeat until all the even elements are at the beginning
      
      int count = 0;
      int lastIndex = 1;
      
      for(int i = 1; i < list.length - 1; i++)
      {
         if(list[i] % 2 != 0)
         {
            int oddElement = list[i];
            list[list.length - lastIndex] = oddElement;
            list[i-1] = list[i];                                                                    
         }
         
         lastIndex--;                   
      }
   }
}