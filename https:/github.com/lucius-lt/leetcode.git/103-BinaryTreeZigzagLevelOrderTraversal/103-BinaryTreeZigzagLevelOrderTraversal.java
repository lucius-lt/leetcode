// Last updated: 7/16/2026, 1:11:27 AM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;


        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentlevel = new ArrayList<>();


            for(int i =0;i<levelSize;i++){
                TreeNode node= queue.poll();
               // currentlevel.add(node.val);

                if(leftToRight){
                    currentlevel.addLast(node.val);
                }
                else{
                    currentlevel.addFirst(node.val);
                }
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            res.add(currentlevel);
            leftToRight = !leftToRight;
        }
        return res;
    }
}