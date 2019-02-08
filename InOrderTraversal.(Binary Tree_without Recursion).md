# InOrderTraversal.(Binary Tree_Without Recursion)



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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> res = new  ArrayList<Integer>();
        
        
       if(root == null)
           return res;
        
        Stack<TreeNode> temp = new Stack<TreeNode>();
        
        while(true){
            
            if(root != null){
                temp.push(root);
                root= root.left;
            }
            
            else{
                
                if(temp.isEmpty())
                    break;
                
                
                else{
                    
                    root = temp.pop();
                    res.add(root.val);
                    root = root.right;
                    
                }
                
            }
            
            
        }
        return res;
    }
}
