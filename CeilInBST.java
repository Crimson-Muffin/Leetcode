public class CeilInBST {
    public static int findCeilBST(TreeNode root, int key) {
        int res = -1;
        while (root != null) {
            if (root.val == key)
                return root.val;
            else if (root.val < key)
                root = root.right;
            else {
                res = root.val;
                root = root.left;
            }
        }
        return res;
    }
}
