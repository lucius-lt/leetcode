// Last updated: 7/16/2026, 1:09:34 AM
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
    private int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;

    }
    public int height(TreeNode T){
        if(T==null) return 0;
        int leftheight = height(T.left);
        int rightheight = height(T.right);

        diameter= Math.max(diameter, leftheight+rightheight);
        return 1+ Math.max(leftheight,rightheight);
    }
}