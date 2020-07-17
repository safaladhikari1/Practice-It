/*
   Write a method called append that accepts two integer arrays as parameters and returns a new array that contains the result of appending the second array's values at the end of the first array.
   For example, if arrays list1 and list2 store {2, 4, 6} and {1, 2, 3, 4, 5} respectively, the call of append(list1, list2) should return a new array containing {2, 4, 6, 1, 2, 3, 4, 5}. If the call instead had been append(list2, list1), the method would return an array containing {1, 2, 3, 4, 5, 2, 4, 6}.
*/

public class Append
{
   public static void main(String[] args)
   {
      int[] test1 = {2, 4, 6};
      int[] test2 = {1, 2, 3, 4, 5};
      
      //int[] a = append(test1, test2);
      
      int[] a = append(test2, test1);
      
      for(int i=0; i<a.length; i++)
      {
         System.out.print(a[i] + " ");
      }
   }
   
   public static int[] append(int[] list1, int[] list2)
   {     
      int[] resultArray = new int[list1.length + list2.length];
      
      int count = 0;
      
      for(count = 0; count < list1.length; count++)
      {
         resultArray[count] = list1[count];
      }
      
      for(int i = 0; i < list2.length; i++)
      {
         resultArray[count] = list2[i];
         count++;   
      }
      
      return resultArray;
      
   }
}