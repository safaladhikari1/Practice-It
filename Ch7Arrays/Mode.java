public class Mode
{
   public static void main(String[] args)
   {
      int[] array1 = {27, 15, 15, 11, 27};
      mode(array1);
   }
   
   public static int mode(int[] list)
   {
      int[] count = new int[101];
          
      for(int i = 0; i < list.length; i++)
      {
         count[list[i]]++;
      }
      
      int index = count[0];
      
      for(int j=0; j < count.length; j++)
      {
         if(count[j] > index)
         {
            index = count[j];
         }
         
         if(index == count[j])
         {
            index = Math.min(list[index], list[count[j]]);
         }           
      }
      
      return list[index];
                 
   }
}