/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        
      
        
        List<Integer> inorder = new ArrayList<Integer>();
    
        helper(root, inorder);
        
        
     return inorder;   
    }
    
    public static void helper(TreeNode root, List<Integer> list){
        if(root != null){
            if(root.left != null){
                helper(root.left,list);
            }
            list.add(root.val);
            
            if(root.right != null){
                helper(root.right,list);
            }
        }
    }
    
            
            
            