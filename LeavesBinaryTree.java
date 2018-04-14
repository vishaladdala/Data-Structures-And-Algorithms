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
    public List<List<Integer>> findLeaves(TreeNode root) {
        
        List<List<Integer>> listofleaves = new ArrayList<>();
        
        List<Integer> leaves = new ArrayList<>();
        
        while(root != null){
            if(isLeaf(root,leaves)) root = null;
            
            listofleaves.add(leaves);
            
            leaves = new ArrayList<>();
            
        }
        return listofleaves;
    }
    
    public boolean isLeaf(TreeNode node, List<Integer> leaves){
        
        if(node.left == null && node.right == null){
            
            leaves.add(node.val);
            return true;
        }
        
        if(node.left!=null){
            if(isLeaf(node.left,leaves))
                node.left = null;
            }
        
        
        if(node.right != null){
            if(isLeaf(node.right,leaves))
                node.right = null;
        }
        
        return false;
    }
}