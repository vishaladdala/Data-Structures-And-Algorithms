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
    public int minDiffInBST(TreeNode root) {
        
        List<Integer> list  = new ArrayList<Integer>();
        
        inorder(root,list);
        
        System.out.print(list);
        
        int mindiff = Integer.MAX_VALUE;
        int diff = 0;
        
        for( int i = 0; i < list.size()-1; i++){
            diff = list.get(i+1) - list.get(i);
            mindiff = diff < mindiff ? diff : mindiff;
        }
        
        
        return mindiff;
        
    }
    
    public void inorder(TreeNode root, List<Integer> list){
        if( root == null){return ;}
        
        inorder(root.left, list);
        
        list.add(root.val);
        
        inorder(root.right, list);
    }
    
}