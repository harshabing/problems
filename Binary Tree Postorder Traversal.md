# Binary Tree Postorder Traversal

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        
        postorderTraversals(root, res);
        return res;
    }
    
    
    public void postorderTraversals(TreeNode root, List<Integer> rese){
        
        
        if(root ==null)
            return;
        
        if(root.left!= null){
           postorderTraversals(root.left, rese);
            
        }
        if(root.right!= null){
           postorderTraversals(root.right, rese);
            
        }
        
        rese.add(root.val);
    }
}
