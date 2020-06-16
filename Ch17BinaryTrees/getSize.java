// Write a method size that returns the total number of nodes in the tree.  

public class GetSize
{
   private IntTreeNode overallRoot;
   
   //returns the total number of nodes in the tree
   public int size()
   {
      return size(overallRoot);
   }
   
   private int size(IntTreeNode root)
   {
      if(root == null)
      {
         return 0;
      }
      else
      {
        return 1 + size(root.left) + size(root.right);  
      }
   } 
}
