/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode result = new TreeNode(val);
            result.left = root;
            return result;
        }
        add(root, val, 1, depth);
        return root;
    }
    public void add(TreeNode root, int val, int depth, int n) {
        if (root == null) return;
        if (depth == n - 1) {
            TreeNode node = root.left;
            root.left = new TreeNode(val);
            root.left.left = node;
            node = root.right;
            root.right = new TreeNode(val);
            root.right.right = node;
        }else {
            add(root.left, val, depth + 1, n);
            add(root.right, val, depth + 1, n);
        }
    }
}