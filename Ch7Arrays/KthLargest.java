public class KthLargest
{
   public static void main(String[] args)
   {
      int[] list = {74, 85, 102, 99, 101, 56, 84};
      
      for(int i=0; i < list.length; i++)
      {
         System.out.print(list[i] + " ");
      }
      System.out.println();
      
      kthLargest(2, list);   
   }
   
   public static void kthLargest(int k, int[] a)
   {
      
      
      
      // sort the array
      
      for(int i = 0; i < a.length - 1; i++)
      {
         if(!(a[i] < a[i+1]))
         {
            a[i] = a[i+1];
         }
      }
      
      for(int i=0; i < a.length; i++)
      {
         System.out.print(a[i] + " ");
      }
         
   }
}