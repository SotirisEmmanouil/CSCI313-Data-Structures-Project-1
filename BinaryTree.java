public class BinaryTree {
            TreeNode Treeroot;

     public void printPreorderTraversal() {
                printPreorderTraversal(Treeroot);
                      }

     public BinaryTree() {
             Treeroot = null;
                  }

     public void printPreorderTraversal(TreeNode Tnode){
                        if (Tnode == null)
                                return;
        
         System.out.print(Tnode.key + " ");
         printPreorderTraversal(Tnode.left);
         printPreorderTraversal(Tnode.right);
                      }
    

}
