public class BinaryTree {
            TreeNode Treeroot;    //create an treenode called treeroot

     public void printPreorderTraversal() {                 
               printPreorderTraversal(Treeroot);
                      }

     public BinaryTree() {          //BinaryTree constructor which sets the root to null
             Treeroot = null;
                  }

     public void printPreorderTraversal(TreeNode Tnode){            
                        if (Tnode == null)
                                return;
        
         System.out.print(Tnode.key + " ");     //recursively print the nodes of the binary tree
         printPreorderTraversal(Tnode.left);
         printPreorderTraversal(Tnode.right);
                      }
    

}
