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
// class Solution {
//     public TreeNode reverseOddLevels(TreeNode root) {
//         if(root==null )return null;
//         int level=0;
//         Queue<TreeNode> q=new LinkedList<>();
//         q.add(root);
//         while(!q.isEmpty()){
//             int size=q.size();
//             List<TreeNode> ans=new ArrayList<>();
//             for(int i=0;i<size;i++){
//                 TreeNode temp=q.poll();
//                 ans.add(temp);
//                 if(temp.left!=null)q.add(temp.left);
//                 if(temp.right!=null)q.add(temp.right);
//             }
//             if((level&1) == 1){
//                 int l=0;
//                 int r=ans.size()-1;
//                 while(l<r){
//                     int tem=ans.get(l).val;
//                     ans.get(l).val=ans.get(r).val;
//                     ans.get(r).val=tem;
//                     l++;
//                     r--;
//                 }
//             }
//             level++;
//         }
//         return root;
//     }
// }

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        reverse(root.left,root.right,1);
        return root;
    }
    public void reverse(TreeNode left,TreeNode right,int level){
        if(left == null || right == null)return;
        if((level&1) == 1){
            int temp=left.val;
            left.val=right.val;
            right.val=temp;
        }
        reverse(left.left,right.right,level+1);
        reverse(left.right,right.left,level+1);
    }
}