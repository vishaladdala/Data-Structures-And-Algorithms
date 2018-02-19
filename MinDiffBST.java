/*
Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

Example:

Input:

   1
    \
     3
    /
   2

Output:
1

Explanation:
The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
*/
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
    public int getMinimumDifference(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        inorder(root, list);
        int size = list.size() - 1;
        int min = Integer.MAX_VALUE;int dif = 0;
        for (int i = 0; i < size; i++){
           dif =  Math.abs(list.get(i+1) - list.get(i));
            if(dif < min){
                min = dif;
            }
            
        }
        
        return min;
        
    }
    
    public void inorder( TreeNode root, List<Integer> list){
        if( root == null){
            return ;
        }
        
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        
    }
}