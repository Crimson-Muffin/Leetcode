public class FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree1379 {
    public static TreeNode res;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || target == null) {
            return null;
        }
        helper(original, cloned, target);
        return res;
    }

    public static void helper(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || target == null) {
            return;
        }
        helper(original.left, cloned.left, target);
        if (original == target) {
            res = cloned;
        }
        helper(original.right, cloned.right, target);
    }

    // better method
    public final TreeNode getTargetCopy1(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || target == null) {
            return null;
        }
        if (original == target) {
            return cloned;
        }
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null) {
            return left;
        }
        return getTargetCopy(original.right, cloned.right, target);
    }
}
