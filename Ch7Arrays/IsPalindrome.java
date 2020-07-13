// Write a method isPalindrome that accepts an array of Strings as its argument and returns true if that array is a palindrome (if it reads the same forwards as backwards) and false if not. For example, the array {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} is a palindrome, so passing that array to your method would return true. Arrays with zero or one element are considered to be palindromes.

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