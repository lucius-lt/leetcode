// Last updated: 7/16/2026, 1:11:39 AM
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
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<>();
        return createtree(1,n);
        
    }

    private List<TreeNode> createtree(int start,int end){
        List<TreeNode> alltree = new ArrayList<>();

        if(start>end){
            alltree.add(null);
            return alltree;
        }

           for (int i = start; i <= end; i++) {
            // All left and right subtrees using i as root
            List<TreeNode> leftTrees = createtree(start, i - 1);
            List<TreeNode> rightTrees = createtree(i + 1, end);

            // Combine left and right with root
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    alltree.add(root);
                }
            }
        }
        return alltree;
    }
}