import java.util.*;

public class BoundaryTreeTraversal {
    public boolean isLeaf(TreeNode node) {
        if (node.left == null && node.right == null)
            return true;
        return false;
    }

    public void addLeftBoundary(TreeNode root, List<Integer> res) {
        TreeNode cur = root.left;
        while (cur != null) {
            if (isLeaf(cur) == false)
                res.add(cur.val);
            if (cur.left != null)
                cur = cur.left;
            else
                cur = cur.right;
        }
    }

    public void addLeaves(TreeNode root, List<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.val);
            return;
        }
        if (root.left != null)
            addLeaves(root.left, res);
        if (root.right != null)
            addLeaves(root.right, res);
    }

    public void addRightBoundary(TreeNode root, List<Integer> res) {
        List<Integer> temp = new ArrayList<>();
        TreeNode cur = root.right;
        while (cur != null) {
            if (isLeaf(cur) == false)
                temp.add(cur.val);
            if (cur.right != null)
                cur = cur.right;
            else
                cur = cur.left;
        }
        for (int i = temp.size() - 1; i >= 0; i--)
            res.add(temp.get(i));
    }

    public List<Integer> printBounday(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        if (isLeaf(root) == false)
            res.add(root.val);
        addLeftBoundary(root, res);
        addLeaves(root, res);
        addRightBoundary(root, res);
        return res;
    }

}
