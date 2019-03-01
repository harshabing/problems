
# Binary Tree Level Order Traversal

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        
        if(root == null)
            return res;
        
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        int levelcount =1;
        int currentcount =0;
        List<Integer> t = new ArrayList<Integer>();
        t.add(root.val);
        res.add(t);
        t =null;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            
            List<Integer> temp = new ArrayList<Integer>();
            
        while(levelcount>0){
            
            root = q.poll();
 
            if(root.left!=null){
                q.offer(root.left);
                temp.add(root.left.val);
                currentcount++;
            }
            
            if(root.right!=null){
                q.offer(root.right);
                temp.add(root.right.val);
                currentcount++;
            }
            
          levelcount--;  
        }
        
        if(temp.size()!=0){
            res.add(temp);
        }            
        levelcount =currentcount;
        currentcount=0;
        }
        return res;
    }
}
