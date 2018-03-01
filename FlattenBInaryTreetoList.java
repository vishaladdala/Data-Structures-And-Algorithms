/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        TreeNode now = root;
        while(now!=null){
            if(now.left!=null){
                TreeNode pre = now.left;
                
                while(pre.right!=null){
                    pre = pre.right;
                }
                
                pre.right = now.right;
                
                now.right = now.left;
                now.left = null;
            }
            
            now = now.right;
        }
        
    }
}