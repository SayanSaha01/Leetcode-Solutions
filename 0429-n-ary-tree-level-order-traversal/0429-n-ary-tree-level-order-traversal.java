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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)
            return list;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node node = queue.poll();
                sublist.add(node.val);
                for(Node c : node.children)
                {
                    queue.add(c);
                }
            }
            list.add(sublist);
        }
        return list;
    }
}