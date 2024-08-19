import java.util.*;

class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    boolean reverse = true;

    public BSTIterator(TreeNode root, boolean isReverse) {
        this.reverse = isReverse;
        pushAll(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode node = stack.pop();
        if (reverse == false) {
            pushAll(node.right);
        } else {
            pushAll(node.left);
        }
        return node.val;
    }

    public void pushAll(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = reverse ? node.right : node.left;
        }
    }
}

public class TwoSumIVInputisaBST653 {
    // naive solution
    public boolean findTarget1(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    // optimized solution
    public boolean findTarget2(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        BSTIterator left = new BSTIterator(root, false);
        BSTIterator right = new BSTIterator(root, true);
        int l = left.next();
        int r = right.next();

        while (l < r) {
            if (l + r == k) {
                return true;
            } else if (l + r < k) {
                l = left.next();
            } else {
                r = right.next();
            }
        }
        return false;
    }
}
