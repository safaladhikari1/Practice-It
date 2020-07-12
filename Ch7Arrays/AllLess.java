public class AllLess
{
   public static void main(String[] args)
   {
      int[] test1 = {45, 20, 300};
      int[] test2 = {50, 41, 600};
      
      System.out.println(allLess(test1, test2));  
   }
   
   public static boolean allLess(int[] list1, int[] list2)
   {
      if(list1.length != list2.length)
      {
         return false;
      }
      
      for(int i=0; i < list1.length; i++)
      {
         if(!(list1[i] < list2[i]))
         {
            return false;
         }
      }
           
      return true;
   }
}
