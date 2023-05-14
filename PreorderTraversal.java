public class PreorderTraversal{

public static void main(String[] args){
                BinaryTree EightSixtree = new BinaryTree();
                EightSixtree.Treeroot = new TreeNode("-");
                EightSixtree.Treeroot.left = new TreeNode("/");
                EightSixtree.Treeroot.right = new TreeNode("+");
                EightSixtree.Treeroot.left.left = new TreeNode("*");
                EightSixtree.Treeroot.left.right = new TreeNode("+");
                EightSixtree.Treeroot.left.left.left = new TreeNode("+");
                EightSixtree.Treeroot.left.left.right = new TreeNode("3");
                EightSixtree.Treeroot.left.left.left.left = new TreeNode("3");
                EightSixtree.Treeroot.left.left.left.right = new TreeNode("1");
                EightSixtree.Treeroot.left.right.left = new TreeNode("-");
                EightSixtree.Treeroot.left.right.left.left = new TreeNode("9");
                EightSixtree.Treeroot.left.right.left.right = new TreeNode("5");
                EightSixtree.Treeroot.left.right.right = new TreeNode("2");
                EightSixtree.Treeroot.right.left = new TreeNode("*");
                EightSixtree.Treeroot.right.right = new TreeNode("6");
                EightSixtree.Treeroot.right.left.right = new TreeNode("-");
                EightSixtree.Treeroot.right.left.left = new TreeNode("3");
                EightSixtree.Treeroot.right.left.right.left = new TreeNode("7");
                EightSixtree.Treeroot.right.left.right.right = new TreeNode("4");

                System.out.println("The Preorder traversal of the ch 8.6 binary tree is: ");

                EightSixtree.printPreorderTraversal();
        System.out.println();
        }


}
