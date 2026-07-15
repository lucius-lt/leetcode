// Last updated: 7/16/2026, 1:11:22 AM
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
    private Map<Integer,Integer> res = new HashMap<>();
    private int postindex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        for(int i =0;i<inorder.length;i++){
            res.put(inorder[i],i);
        }
        postindex=postorder.length-1;
        return construct(inorder,postorder,0,inorder.length-1);
        
    }

    private TreeNode construct(int[] in,int[] pre, int start,int end){
        if(start>end) return null;

        int rootval=pre[postindex--];

        TreeNode root = new TreeNode(rootval);

        int rootindex= res.get(rootval);

        root.right= construct(in,pre,rootindex+1,end);
        root.left= construct(in,pre,start,rootindex-1);

        return root;
    }
}