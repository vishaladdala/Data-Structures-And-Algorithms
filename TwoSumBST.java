/*
Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
Example 2:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False
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
//logic is to create a arraylist of inorder traversal of bst which gives us an array in sorted order and thn proceed to do the traditional way
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        
        inorder(root, list);
        
        int l = 0;
        int r = list.size() - 1;
        
        while(l < r){
            int sum = list.get(l) + list.get(r);
            
            if(sum == k){
                return true;
            }
            
            else if( sum < k ){
                l++;
            }
            else{
                r--;
            }
        }
        
        return false;
}
    
    public void inorder(TreeNode root, List<Integer> list){
        if (root == null){
            return ;
        }
        inorder( root.left, list);
        list.add(root.val);
        inorder( root.right, list);
    }
}