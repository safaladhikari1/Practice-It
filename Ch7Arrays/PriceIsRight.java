// incomplete

public class PriceIsRight
{
   public static void main(String[] args)
   {
      int[] a1 = {900, 885, 989, 1};
      int[] a3 = {500, 300, 241, 99, 501};
      priceIsRight(a1, 800);
      priceIsRight(a3, 50);
   }
   
   public static int priceIsRight(int[] bids, int price)
   {
      // loop through the array
      // find the min element and max element
      // if price falls between min and max
         // return the closest element to that price
      // otherwise, return -1
      
      int min = bids[0];
      int max = bids[0];
      
      int minIndex = 0;
      int maxIndex = 0;
      
      for(int i=1; i<bids.length; i++)
      {
         if(bids[i] > max)
         {
            max = bids[i];
            maxIndex = i;
         }
         
         if(bids[i] < min)
         {
            min = bids[i];
            minIndex = i;
         }   
      }
      
      int result = -1;
      
      if(price >= bids[minIndex] && price <= bids[maxIndex])
      {
         for(int i = 0; i < bids.length; i++)
         {
            if(!(bids[i] > price))
            {
               price = bids[i];
            }
         }
        
         return price;
      }
      
      return result;
      
            
   }
}