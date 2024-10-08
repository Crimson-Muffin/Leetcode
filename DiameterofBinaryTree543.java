public class DiameterofBinaryTree543 {
    int max = 0;

    public int DiameterofBinaryTree(TreeNode root) {
        return maxDepth(root);
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
