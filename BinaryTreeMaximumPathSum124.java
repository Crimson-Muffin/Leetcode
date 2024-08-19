public class BinaryTreeMaximumPathSum124 {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return max;
    }

    public int maxGain(TreeNode root) {
        if (root == null)
            return 0;

        int left = Math.max(maxGain(root.left), 0);
        int right = Math.max(maxGain(root.right), 0);

        max = Math.max(max, left + right + root.val);

        return Math.max(left, right) + root.val;
    }
}
