// BFS for a binary tree





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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new  ArrayList<List<Integer>>();
        if(root == null)
            return res;
        
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        int levelcount =1;
        int currentcount = 0;
        
        q.offer(root);
       // List<Integer> r = new ArrayList<Integer>();
       // r.add(root.val);
     //   res.add(r);
        //r=null;
        while(!q.isEmpty()){
            
            
            List<Integer> t = new ArrayList<Integer>();
            while(levelcount>0){
                
                root = q.poll();
                
                //System.out.print(root.val + " ");
                t.add(root.val);
                if(root.left!=null){
                    currentcount++;
                    q.offer(root.left);
                }
                  if(root.right!=null){
                    currentcount++;
                    q.offer(root.right);
                }
                levelcount--;
                
            }
            
            //System.out.println();
            if(t.size() !=0)
                res.add(t);
            levelcount = currentcount;
            currentcount =0;
        }
        Collections.reverse(res);
      return res;
    }
}
