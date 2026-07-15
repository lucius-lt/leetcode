// Last updated: 7/16/2026, 1:11:24 AM
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
    private int indexpre = 0;
    private  Map<Integer,Integer> res=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0 ;i<inorder.length;i++){
            res.put(inorder[i],i);
        }
        return construct(preorder,0,inorder.length-1);
        
    }
    private TreeNode construct(int[] pre, int start,int end){
        if(start>end) return null;

        int rootval = pre[indexpre++];
        TreeNode root= new TreeNode(rootval);

        int rootindex = res.get(rootval);

        root.left=construct(pre,start,rootindex-1);
        root.right=construct(pre,rootindex+1,end);

        return root;

    }
}