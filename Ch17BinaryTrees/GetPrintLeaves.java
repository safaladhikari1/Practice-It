/*
   Write a method printLeaves that outputs the leaves of a binary tree from right to left. 
   More specifically, the leaves should be printed in the reverse order that they would be printed using any of the standard traversals. 
*/

public class GetPrintLeaves
{
   private IntTreeNode overallRoot;
   
   //constructor builds a canned tree
   public GetPrintLeaves()
   {       
      overallRoot = new IntTreeNode(17, null, null);
      
      //helper constructor IntTreeNode(int data) puts null on left and right
      overallRoot.left = new IntTreeNode(41);
      overallRoot.right = new IntTreeNode(9);
      overallRoot.left.left = new IntTreeNode(29);
      overallRoot.left.right = new IntTreeNode(6);
      overallRoot.right.left = new IntTreeNode(81);
      overallRoot.right.right = new IntTreeNode(40);     
   }
   
   public void printLeaves()
   { 
       if(overallRoot == null)
       {
           System.out.println("no leaves");
       }
       else
       {
           System.out.print("leaves: ");
       }
       
       printLeaves(overallRoot);
   }
   
   private void printLeaves(IntTreeNode root)
   {
     if(root == null)
     {
         return;
     }
     else if(root.left == null && root.right == null)
     {
        System.out.print(root.data + " ");    
     }
     else
     {    
         printLeaves(root.right);  
         printLeaves(root.left);                                         
     }     
   } 
}