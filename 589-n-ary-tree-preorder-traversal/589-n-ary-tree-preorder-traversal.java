/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null)
            return res;
			
        res.add(root.val);
			
		//root.children is a list, so we can iterate over it
        for(int i = 0; i < root.children.size(); i++){
            preorder(root.children.get(i));
        }
        return res;
    }
}