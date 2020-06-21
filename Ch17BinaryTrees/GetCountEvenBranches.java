/*
   Write a method countEvenBranches that returns the number of branch nodes in a binary tree that contain even numbers. 
   A branch node is one that has one or two children (i.e., not a leaf node). 
   An empty tree has 0 even branches.
*/

public class GetCountEvenBranches
{
   public IntTreeNode overallRoot;
   
   // constructor that builds a canned tree for debugging
   public GetCountEvenBranches()
   {
    overallRoot = new IntTreeNode(3, null, null);
    overallRoot.left = new IntTreeNode(5);
    overallRoot.left.left = new IntTreeNode(1);
    overallRoot.right = new IntTreeNode(2);
    overallRoot.right.left = new IntTreeNode(4);
    overallRoot.right.right = new IntTreeNode(6);      
   }
   
   public int countEvenBranches()
   {
      return countEvenBranches(overallRoot);
   }
   
   private int countEvenBranches(IntTreeNode root)
   {
      if(root == null)
      {
         return 0;
      }
      else if(root.left == null && root.right == null)
      {
         return 0;
      }
      else
      {
         if(root.data % 2 == 0)
         {
            return 1 + countEvenBranches(root.left) + countEvenBranches(root.right);   
         }
         else
         {
            return countEvenBranches(root.right) + countEvenBranches(root.left);   
         }
      }     
   }
}