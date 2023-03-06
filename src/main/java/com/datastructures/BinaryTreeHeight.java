package com.datastructures;

// A binary tree node
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int item)
    {
        data = item;
        left = right = null;
    }
}


public class BinaryTreeHeight {

    TreeNode root;

    public static void main(String[] args) {

        BinaryTreeHeight tree = new BinaryTreeHeight();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.left.left = new TreeNode(7);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);

        System.out.println(maxDepth(tree.root));
    }

    private static int maxDepth(TreeNode node) {

        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }


}
