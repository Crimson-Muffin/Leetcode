import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class NaryTreeLevelOrderTraversal429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<Node> q = new LinkedList<>();
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> lvl = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                lvl.add(cur.val);
                for (Node child : cur.children) {
                    q.offer(child);
                }
            }
            res.add(lvl);
        }
        return res;
    }
}
