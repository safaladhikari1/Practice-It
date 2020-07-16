// incomplete

public class Contains
{
   public static void main(String[] args)
   {
      int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
      int[] list2 = {1, 2, 1};
      
      System.out.println(contains(list1, list2));
   }
   
   public static int contains(int[] a1, int[] a2)
   {
      // loop through both arrays
      // if a1[i] == a2[i]
      // count
      // if the count is greater than 3
      // return true
      
      int minCount = 0;
      
      int maxCount = 0; 
      
      for(int i = 0; i < a1.length; i++)
      {
         for(int j = 0; j < a2.length; j++)
         {
            if(a1[i] == a2[j])
            {
               minCount++;
               
               if(minCount > maxCount)
               {
                  maxCount = minCount;
               }
            }
            else
            {
               minCount = 0;
            }
         }    
      }
      
      return maxCount;     
   }  
}