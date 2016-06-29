/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class SameTree {
public:

    bool check(TreeNode *p, TreeNode *q){
        if(p == NULL && q == NULL)
            return true;
        else if(p == NULL && q != NULL)
            return false;
        else if(p != NULL && q == NULL)
            return false;
        else
            return (p->val==q->val)&&check(p->left,q->left)&&check(p->right,q->right);
    }
    bool isSameTree(TreeNode* p, TreeNode* q) {
        return check(p,q);
    }
};
