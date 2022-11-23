/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root,sb);
        return sb.toString();
    }
    public void dfs(TreeNode root,StringBuilder sb)
    {
        if(root==null)
            return;
        sb.append(root.val+",");
        dfs(root.left,sb);
        dfs(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
        String[] str = data.split(",");
        TreeNode root = null;
        for(String s:str)
        {
            if(s.length()>0)
            {
                root = insert(root,Integer.parseInt(s));
            }
        }
        return root;
    }
    public TreeNode insert(TreeNode root,int v)
    {
        if(root==null)
            return new TreeNode(v);
        if(v<root.val)
            root.left = insert(root.left,v);
        if(v>root.val)
            root.right = insert(root.right,v);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;