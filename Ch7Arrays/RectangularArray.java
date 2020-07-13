// Assume that a two-dimensional rectangular array of integers called data has been declared with four rows and seven columns. Write a for loop to initialize the third row of data to store the numbers 1 through 7.

public class RectangularArray
{
   public static void main(String[] args)
   {
      int[][] data = new int[4][7];
      
      for(int i = 0; i < data.length; i++)
      {
         if(i == 2)
         {           
            for(int j = 0; j < data[i].length; j++)
            {
               data[i][j] = j + 1;
            }
         }
      }
   }
}