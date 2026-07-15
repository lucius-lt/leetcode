// Last updated: 7/16/2026, 1:10:13 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        
    if (root == null) return 0;

        // Compute the height of the left and right subtrees
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // If heights are the same, then the left subtree is a perfect binary tree
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) + countNodes(root.right); // 2^h + nodes in right subtree
        } else {
            return (1 << rightHeight) + countNodes(root.left); // 2^h + nodes in left subtree
        }
    }

    // Helper function to calculate the height of a subtree
    private int getHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left; // Move down to the leftmost node
        }
        return height;
    }
}