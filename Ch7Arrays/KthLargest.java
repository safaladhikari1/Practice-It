/*
   Write a method called kthLargest that accepts an integer k and an array a as its parameters and returns the element such that k elements have greater or equal value. If k = 0, return the largest element; if k = 1, return the second largest element, and so on.

   For example, if the array passed contains the values {74, 85, 102, 99, 101, 56, 84} and the integer k passed is 2, your method should return 99 because there are two values at least as large as 99 (101 and 102).

   Assume that 0 <= k < a.length.

*/

public class KthLargest
{
   public static void main(String[] args)
   {
      int[] list = {74, 85, 102, 99, 101, 56, 84};
     
      
      System.out.println(kthLargest(2, list));   
   }
   
   public static int kthLargest(int k, int[] a)
   {     
      // sort the array using bubbleSort algorithm
      
      int arrayLength = a.length;
      
      for(int i = 0; i < arrayLength - 1; i++)
      {
         // arrayLength - i, is making sure we don't go all the way after each loop
         // because after 1st loop, it guarantees that the largest int will be at the end.
         for(int j = 0; j < arrayLength - i - 1; j++)
         {     
            // swap the items between a[j] and a[j+1], if a[j] > a[j+1]
            if(a[j] > a[j+1])
            {
               int temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;          
            }
         }
      }
      
      // here the array is sorted.
      int count = -1;
      int kthLargest = 0;
      
      for(int i = a.length - 1; i >=0 ; i--)
      {
         count++;
         
         if(count == k)
         {
            kthLargest = a[i];
         }   
      }
           
      return kthLargest;      
   }        
}