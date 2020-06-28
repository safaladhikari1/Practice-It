/*
   Write a method isFull that returns whether or not a binary tree is full (true, if it is, false if otherwise). 
   A full binary tree is one in which every node has 0 or 2 children.
   The empty tree is considered full.
*/

public class GetIsFull
{
   private IntTreeNode overallRoot;
   
   // constructs that builds a canned tree for debuggin
   public GetIsFull()
   {
      overallRoot = new IntTreeNode(3, null, null);
      overallRoot.left = new IntTreeNode(5);
      overallRoot.left.left = new IntTreeNode(1);
      overallRoot.right = new IntTreeNode(2);
      overallRoot.right.left = new IntTreeNode(4);
      overallRoot.right.right = new IntTreeNode(6);
   }
   
   public boolean isFull()
   {   
      return isFull(overallRoot);   
   }
   
   private boolean isFull(IntTreeNode root)
   {     
      if(root == null)
      {
         return true;
      }     
      else if(root.left == null && root.right != null)
      {
         return false;
      }
      else if(root.left != null && root.right == null)
      {
         return false;
      }
      else
      {
         return isFull(root.left) && isFull(root.right);
      }
   }     
}