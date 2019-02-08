# InOrderTraversal.(N-array Tree)



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
    
    
    private List<List<Integer>> levelOrderTraversal(Node root, List<List<Integer>> result) {
    
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            
            List<Integer> currentIteration = new ArrayList<>();
            
            int size = queue.size();
            
            for (int i=0; i<size; i++) {
                Node item = queue.poll();
                currentIteration.add(item.val);
                queue.addAll(item.children);
            }
            
            result.add(currentIteration);
        }
        
        return result;
    }
    
    public List<List<Integer>> levelOrder(Node root) {
        
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        
        return levelOrderTraversal(root, new ArrayList<List<Integer>>());
    }
}
