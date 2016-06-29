/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class MaxDepthBinaryTree {
public:
    int max(int x,int y){
        if(x > y)
            return x;
        else
            return y;
    }
    
    int fun(struct TreeNode *root){
        if(root == NULL)
            return 0;
        else if(root->left == 0 && root->right == 0)
            return 1;
        else
            return 1 + max(fun(root->left),fun(root->right));
    }
    int maxDepth(TreeNode* root) {
        return fun(root);
    }
};
