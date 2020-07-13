// Write a method averageLength of code that computes and returns the average String length of the elements of an array of Strings. For example, if the array contains {"belt", "hat", "jelly", "bubble gum"}, the average length returned should be 5.5. Assume that the array has at least one element.

public class AverageLength
{
   public static void main(String[] args)
   {
      String[] test = {"belt", "hat", "jelly", "bubble gum"};
      System.out.println(averageLength(test));   
   }
   
   public static double averageLength(String[] list)
   {
      
      int totalStringLength = 0;
      
      for(int i=0; i < list.length; i++)
      {
         for(int j = 0; j < list[i].length(); j++)
         {
            totalStringLength++;
         }   
      }
      
      return (double)totalStringLength / list.length;
   }
}