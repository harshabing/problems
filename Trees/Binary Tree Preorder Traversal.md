# Binary Tree Preorder Traversal


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
     List<Integer> res = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
       
        
       if(root ==null){
           return res;}
    
        preorderTraversals(root);
        return res;
    }
    
    public void preorderTraversals(TreeNode root){
            if(root!=null){
                
        res.add(root.val);
        
        if(root.left!=null){
            preorderTraversals(root.left);
        }
        
        if(root.right!=null){
            preorderTraversals(root.right);
        }
    }
    }
    
}
