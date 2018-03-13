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
    public int kthSmallest(TreeNode root, int k) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        inorder(root,list);
        
        return list.get(k-1);
        
    }
    
    
    public void inorder(TreeNode root, List<Integer> list){
        if(root!=null){
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
            
        }
        
    }
}