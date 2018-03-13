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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> res = new ArrayList<String>();
        
        dfs(root,"",res);
        
        return res;
        
    }
    
    public void dfs(TreeNode root, String str, List<String> res){
        if(root == null){
            return;
        }
        
        if(root.right == null && root.left == null){
            res.add(str + root.val);
        }
        
        dfs(root.left, str + root.val + "->", res);
        
        dfs(root.right, str + root.val + "->", res);
    }
}