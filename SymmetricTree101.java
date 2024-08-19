public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val == right.val) {
            return dfs(left.left, right.right) && dfs(left.right, right.left);
        }
        return false;
    }
}
