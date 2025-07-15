// Utility class to store information from recursive calls
class Solution {

    // Returns the subtree height, or –1 if this subtree is already unbalanced
    private int check(TreeNode node) {
        if (node == null) {
            return 0;          // empty subtree → height 0
        }

        int left  = check(node.left);   // height of left subtree
        if (left == -1) return -1;      // left side already unbalanced

        int right = check(node.right);  // height of right subtree
        if (right == -1) return -1;     // right side already unbalanced

        if (Math.abs(left - right) > 1) {
            return -1;        // this node makes the tree unbalanced
        }

        return 1 + Math.max(left, right);  // balanced → return height
    }

    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }
}
