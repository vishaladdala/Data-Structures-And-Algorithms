/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int closestValue(TreeNode* root, double target) {
        
        int cv = root->val;
        
        while(root){
            
            cv = ( abs(target - root->val) < abs(target - cv) )? root->val : cv;
            
            root = (root->val > target) ? root->left : root->right;
                  
            
        }
                  
        return cv;
        
    }
};