class Solution {
    public int maxDepth(Node root) {
        
        if(root==null)
            return 0;
        int depth=1;
        
        for(int i =0;i<root.children.size();i++){
            
           depth =Math.max(depth, maxDepth(root.children.get(i))+1);
        
        
    
        
 
    }
             return depth;  
}
                           }
