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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root,false);
    }
    public int sumOfLeftLeaves(TreeNode root,boolean isLeftChild){
        if(root == null)return 0;
        if(root.left==null && root.right == null)return isLeftChild == true ?root.val : 0;
        int l=sumOfLeftLeaves(root.left,true);
        int r=sumOfLeftLeaves(root.right,false);
        return l+r;
    }
}