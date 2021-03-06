// Write a method called equals that takes in two string arrays and returns true if they are equal; that is, if both arrays have the same length and contain equivalent string values at each index.

public class EqualsStrings
{
   public static void main(String[] args)
   {
      String[] test1 = {"apple", "mango", "banana"};
      String[] test2 = {"grapes", "orange", "avocado"};
      
      System.out.println(equals(test1, test2));   
   }
   
   public static boolean equals(String[] list1, String[] list2)
   {
      if(list1.length != list2.length)
      {
         return false;
      }
      
      for(int i = 0; i < list1.length; i++)
      {
         if(!(list1[i].equals(list2[i])))
         {
            return false;
         }
      }
      
      return true;
      
   }
}