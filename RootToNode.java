import java.util.*;

public class RootToNode {
    public static List<Integer> solve(TreeNode root, int b) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        getPath(root, res, b);
        return res;
    }

    public static boolean getPath(TreeNode root, List<Integer> res, int b) {
        if (root == null)
            return false;
        res.add(root.val);
        if (root.val == b)
            return true;
        if (getPath(root.left, res, b) || getPath(root.right, res, b))
            return true;
        res.remove(res.size() - 1);
        return false;
    }
}
