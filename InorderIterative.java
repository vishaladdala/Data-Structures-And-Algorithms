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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        
        TreeNode cur = root;
       
        
        while(cur!=null || !stack.isEmpty()){
             while(cur!=null){
                 
                 stack.push(cur);
                 cur = cur.left;
                 
                 
             }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        
        
        return list;
    }
}