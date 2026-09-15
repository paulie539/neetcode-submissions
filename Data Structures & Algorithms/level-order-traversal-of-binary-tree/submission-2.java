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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        helper(root, lists, 0);
        return lists;
    }

    public void helper(TreeNode root, List<List<Integer>> lists, int level) {
        if (root == null) return;
        if (lists.size() <= level) {
            lists.add(new ArrayList<>());
        }
        lists.get(level).add(root.val);
        helper(root.left, lists, level + 1);
        helper(root.right, lists, level + 1);

    }
}
