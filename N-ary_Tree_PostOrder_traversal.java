// N-ary Tree Postorder Traversal

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
   public List<Integer> postorder(Node root) {
        List<Integer> container = new ArrayList<>();
        helper(root, container);
        return container;
    }

    public void helper(Node root, List<Integer> container) {
        if(root==null) return;
        if(root.children!=null && root.children.size()>0) {
            for(Node child:root.children)
                helper(child, container);
        }
        container.add(root.val);
    }
}
