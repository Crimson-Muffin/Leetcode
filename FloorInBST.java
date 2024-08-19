public class FloorInBST {
    public static int floorinBST(TreeNode root, int key) {
        int res = -1;
        while (root != null) {
            if (root.val == key)
                return root.val;
            else if (root.val > key) {
                root = root.left;
            } else {
                res = root.val;
                root = root.right;
            }
        }
        return res;
    }
}
