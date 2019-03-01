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
    public List<Integer> preorder(Node root) {
        
        if(root == null)
            return new ArrayList<Integer>();
        
        List<Integer> list = new ArrayList<Integer>();
        
        populateList(root,list);
        
        return list; 
    }
    
    private void populateList(Node root,List<Integer> list){
        
        if(root == null)
            return;
        
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        
        while(!stack.empty()){
            
            Node topNode = stack.pop();
            list.add(topNode.val);
            
            for(int child=topNode.children.size()-1;child>=0;child--){
                
                stack.push(topNode.children.get(child));
                
            }
            
        }   
    }
}
