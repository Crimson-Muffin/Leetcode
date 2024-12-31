
// Source: https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
// Didnt solve it yet. I will solve it later.
import java.util.*;

class VerticalOrderTraversal {
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> hmap;

    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        hmap = new TreeMap<>();
        dfs(root, 0, 0);

        List<List<Integer>> l = new ArrayList<>();
        for (int i : hmap.keySet()) {
            List<Integer> temp = new ArrayList<>();
            TreeMap<Integer, PriorityQueue<Integer>> t = hmap.get(i);
            for (int j : t.keySet()) {
                PriorityQueue<Integer> pq = t.get(j);
                while (!pq.isEmpty()) {
                    temp.add(pq.poll());
                }
            }
            res.add(temp);
        }
        return res;
    }

    public void dfs(TreeNode root, int col, int row) {
        if (root == null) {
            return;
        }
        TreeMap<Integer, PriorityQueue<Integer>> t = hmap.getOrDefault(col, new TreeMap<>());
        PriorityQueue<Integer> pq = t.getOrDefault(row, new PriorityQueue<>());
        pq.add(root.val);
        t.put(row, pq);
        hmap.put(col, t);

        dfs(root.left, col - 1, row + 1);
        dfs(root.right, col + 1, row + 1);
    }
}