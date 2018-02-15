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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> preorder = new ArrayList<Integer>();
        
        helper(root,preorder);
        
        return preorder;
        
    }
    
    public static void helper(TreeNode root, List<Integer> list){
        if(root != null){
            list.add(root.val);
            
            if(root.left != null){
                helper(root.left,list);
            }
            
            if(root.right != null){
                helper(root.right, list);
            }
        }
    }
}