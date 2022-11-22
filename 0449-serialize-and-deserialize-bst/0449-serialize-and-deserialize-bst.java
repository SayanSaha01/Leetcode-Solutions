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

   public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    dfs(root, sb);
    return sb.toString();
}
private void dfs(TreeNode root, StringBuilder sb) {
    if (root == null) {
        return;
    }
    sb.append(root.val + ",");
    dfs(root.left, sb);
    dfs(root.right, sb);
    return;
}

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    String[] arr = data.split(",");
    TreeNode root = null;
    for (String s : arr) {
        if (s.length() > 0) {
            root = buildBST(root, Integer.parseInt(s));
        }
    }
    return root;
}

    public TreeNode buildBST(TreeNode root, int v) {
        if (root == null) return new TreeNode(v);
        if (v < root.val) {
            root.left = buildBST(root.left, v);
        } else {
            root.right = buildBST(root.right, v);
        }
        return root;
  }
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;