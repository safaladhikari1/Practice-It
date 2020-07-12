public class IsPalindrome
{
   public static void main(String[] args)
   {
      String[] test = {"wow", "beta", "gamma", "delta", "gamma", "beta", "alpha"};
      System.out.println(isPalindrome(test));
   }
   
   public static boolean isPalindrome(String[] list)
   {

      for(int i=0; i < list.length / 2; i++)
      {
         if(!(list[i].equals(list[list.length-(i+1)])))
         {
            return false;
         }
      }
      
      return true;
   }
}