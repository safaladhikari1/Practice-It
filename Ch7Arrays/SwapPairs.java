// Write a method named swapPairs that accepts an array of strings as a parameter and switches the order of values in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on.

public class SwapPairs
{
   public static void main(String[] args)
   {
      String[] a = {"four", "score", "and", "seven", "years", "ago"};
      swapPairs(a);
      
   }
   
   public static void swapPairs(String[] list)
   {
      
      String temp = "";
      
      for(int i = 0; i < list.length-1; i+=2)
      {
         temp = list[i];
         
         list[i] = list[i+1];
         list[i+1] = temp;
      }          
   }
}