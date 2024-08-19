import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal103 {
    boolean flag = true; // flasg = true means left to right ,flag = false means right to left

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> row = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (flag) {
                    row.add(curr.val);
                } else {
                    row.addFirst(curr.val);
                }
                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }
            res.add(row);
            flag = !flag;
        }
        return res;
    }
}
