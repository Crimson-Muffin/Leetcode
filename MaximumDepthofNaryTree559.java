
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}

public class MaximumDepthofNaryTree559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        for (Node x : root.children) {
            res = Math.max(res, maxDepth(x));
        }
        return res + 1;
    }
}
