// Assume that a two-dimensional rectangular array of integers called matrix has been declared with six rows and eight columns. Write a for loop to copy the contents of the second column into the fifth column.

public class CopyColumn
{
   public static void main(String[] args)
   {
      int[][] matrix = new int[6][8];
      
      int temp = 0;
      
      for(int i = 0; i < matrix.length; i++)
      {
         for(int j = 0; j < matrix[i].length; j++)
         {
            if(j == 1)
            {
               temp = matrix[i][j];             
            }
            
            if(j == 4)
            {
               matrix[i][j] = temp;
            }
         }
      }    
   }
}