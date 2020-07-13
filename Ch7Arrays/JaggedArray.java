// Write a piece of code that constructs a jagged two-dimensional array of integers named jagged with five rows and an increasing number of columns in each row, such that the first row has one column, the second row has two, the third has three, and so on. The array elements should have increasing values in top-to-bottom, left-to-right order (also called row-major order).

public class JaggedArray
{
   public static void main(String[] args)
   {
      int[][] jagged = new int[5][0];
         
      int value = 1;
      
      for(int i = 0; i < 5; i++)
      {
         jagged[i] = new int[i+1];
         for(int j = 0; j < (i + 1); j++)
         {
            jagged[i][j] = value; 
            value++;     
         }
      }     
   }
}