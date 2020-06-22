/*
   Write a method printLevel that accepts an integer parameter n and that prints the values at level n from the left to right, one per line. 
   We will use the convention that the overallRoot is at level 1, that its children are at level 2, and so on.
*/

public class GetPrintLevel
{
   private IntTreeNode overallRoot;
   
   // constructor that builds a canned tree for debugging
   public GetPrintLevel()
   {
   overallRoot = new IntTreeNode(3, null, null);
   overallRoot.left = new IntTreeNode(5);
   overallRoot.left.left = new IntTreeNode(1);
   overallRoot.right = new IntTreeNode(2);
   overallRoot.right.left = new IntTreeNode(4);
   overallRoot.right.right = new IntTreeNode(6);   
   }
   
   public void printLevel(int level)
   {
      if(level < 1)
      {
        throw new IllegalArgumentException();
      }
      else
      {
         printLevel(overallRoot, level, 1);
      }     
   }
   
   private void printLevel(IntTreeNode root, int level, int depth)
   {
      if(root != null)
      {
         if(level == depth)
         {
            System.out.println(root.data);
         }
         else if(level > depth)
         {
            printLevel(root.left, level, depth + 1);
            printLevel(root.right, level, depth + 1);
         }    
      }
   }   
}