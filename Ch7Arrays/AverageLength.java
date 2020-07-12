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