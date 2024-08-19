import java.util.*;

public class BinarySearchTreeIterator173 {
    Stack<TreeNode> stack = new Stack<>();

    public BinarySearchTreeIterator173(TreeNode root) {
        pushAll(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode node = stack.pop();
        pushAll(node.right);
        return node.val;
    }

    public void pushAll(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

}
