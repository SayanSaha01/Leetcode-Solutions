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
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        if(root.children==null)
            return 1;
        int maxheight = 0;
        for(Node temp:root.children)
        {
            int childrendepth = maxDepth(temp);
            maxheight = Math.max(childrendepth,maxheight);
        }
        return maxheight+1;
    }
}