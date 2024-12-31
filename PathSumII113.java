import java.util.*;

public class PathSumII113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        dfs(root, sum, path, res);
        return res;
    }

    public void dfs(TreeNode root, int sum, List<Integer> path, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList<Integer>(path));
        }
        dfs(root.left, sum - root.val, path, res);
        dfs(root.right, sum - root.val, path, res);
        path.remove(path.size() - 1);
    }
}
