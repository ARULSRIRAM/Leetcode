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
    public int maxLevelSum(TreeNode root) {
        int ans=0;
        int maxi=Integer.MIN_VALUE;
        int level=1;
        if(root == null)return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int currlevelSum=0;

            for(int i=0;i<size;i++){
                TreeNode popped=q.poll();
                currlevelSum+=popped.val;
                if(popped.right!=null)q.add(popped.right);
                if(popped.left!=null)q.add(popped.left);
            }
            if(maxi < currlevelSum){
                maxi=currlevelSum;
                ans=level;
            }
            level++;
        }
        return ans;

    }
}