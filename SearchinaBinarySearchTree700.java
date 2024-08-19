public class SearchinaBinarySearchTree700 {

    // Recursive Method
    public TreeNode searchBST1(TreeNode root, int val) {
        if (root == null || root.val == val)
            return root;
        if (root.val < val)
            return searchBST1(root.right, val);
        else
            return searchBST1(root.left, val);
    }

    // Iterative Method
    public TreeNode searchBST2(TreeNode root, int val) {
        while (root != null && root.val != val) {
            if (root.val < val)
                root = root.right;
            else
                root = root.left;
        }
        return root;
    }

}
