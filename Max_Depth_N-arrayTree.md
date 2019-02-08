
# MAX DEPTH WITHOUT RECUSION !!!!!


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/



class Solution {
    public int maxDepth(Node root) {
       List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(root == null)
            return 0;
    
        
       Queue<Node> q = new LinkedList<Node>();
       
        int levelcount =1;
        int currentcount =0;
        List<Integer> t = new ArrayList<Integer>();
        
        q.offer(root);
        t.add(root.val);
        res.add(t);
        t=null;
        while(!q.isEmpty()){
           List<Integer> temp = new ArrayList<Integer>();  
         while(levelcount>0){
             
             root = q.poll();
             
             if(root.children.size()>0){
                 for(Node child : root.children){
                     currentcount++;
                     q.offer(child);
                     temp.add(child.val);
                 }
             }
             
          levelcount--;   
         }   
          
            if(temp.size()>0)
                res.add(temp);
            
            levelcount = currentcount;
            currentcount =0;
            
        }
        
        return res.size();
}
                           }
