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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return addOneNewRow(root,val,depth,1);
        
    }
    public TreeNode addOneNewRow(TreeNode root,int val,int depth,int currDepth){
        if(root == null)return null;
        if(depth==1){
            TreeNode nn=new TreeNode(val);
            nn.left=root;
            return nn;
        }
        else if(currDepth == depth-1){
            TreeNode a=new TreeNode(val);
            TreeNode b=new TreeNode(val);
            a.left=root.left;
            b.right=root.right;
            root.left=a;
            root.right=b;
            return root;
        }
        else {
        addOneNewRow(root.left,val,depth,currDepth+1);
        addOneNewRow(root.right,val,depth,currDepth+1);
        return root;
        }
    }
}