import java.util.*;

public class BinaryTreePaths257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        dfs(root, "", res);
        return res;
    }

    public void dfs(TreeNode root, String path, List<String> res) {
        if (root.left == null && root.right == null) {
            res.add(path + root.val);
            return;
        }
        if (root.left != null) {
            dfs(root.left, path + root.val + "->", res);
        }
        if (root.right != null) {
            dfs(root.right, path + root.val + "->", res);
        }
    }
}
