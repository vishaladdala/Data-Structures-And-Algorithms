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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        
        List<TreeNode> list = new ArrayList<TreeNode>();
        Inorder(root,list);
        
        if(root == null){
            return null;
        }
        
        
        int i = list.indexOf(p);
        
        if(i == list.size()-1){return null;}
        
        if(i>=0 && i<list.size()-1){
            return list.get(i+1);
        }
        
        
        
        return null;
        
        
        
        
    }
    
    public void Inorder(TreeNode node, List<TreeNode> list){
        if(node == null){
            return;
        }
        
        Inorder(node.left,list);
        list.add(node);
        Inorder(node.right,list);
    }
}