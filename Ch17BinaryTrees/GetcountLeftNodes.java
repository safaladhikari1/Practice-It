/*
   Write a method countLeftNodes that returns the number of left children in the tree. 
   A left child is a node that appears as the root of the left-hand subtree of another node. 
   An empty tree has 0 left nodes.
*/

public class GetcountLeftNodes
{
   private IntTreeNode overallRoot;
   
   // constructor that builds a canned tree from exercise for debugging
   public GetcountLeftNodes()
   {
      overallRoot = new IntTreeNode(3, null, null);
      overallRoot.left = new IntTreeNode(5);
      overallRoot.left.left = new IntTreeNode(1);
      overallRoot.right = new IntTreeNode(2);
      overallRoot.right.left = new IntTreeNode(4);
      overallRoot.right.left.left = new IntTreeNode(7);
      overallRoot.right.right = new IntTreeNode(6);      
   }
   
   public int countLeftNodes()
   {
      return countLeftNodes(overallRoot);
   }
   
   private int countLeftNodes(IntTreeNode root)
   {            
      if(root == null)
      {
         return 0;
      }
      else if(root.left != null)
      {        
         return 1 + countLeftNodes(root.left) + countLeftNodes(root.right);              
      }
      else
      {
         return countLeftNodes(root.right);
      }
   } 
}