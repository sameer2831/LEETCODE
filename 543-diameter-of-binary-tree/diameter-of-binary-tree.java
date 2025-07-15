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
    public int dfs(TreeNode root,int[] maxD)
    {
        if(root == null) return 0;
        int leftH=dfs(root.left,maxD);
        int rightH=dfs(root.right,maxD);
        maxD[0]=Math.max(maxD[0],leftH+rightH);
        return 1+Math.max(leftH,rightH);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int maxD[]=new int[1];
        dfs(root,maxD);
        return maxD[0];
        
    }
}