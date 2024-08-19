import java.util.*;

public class Threetraversals {
    public void preInPostTraversal(TreeNode root) {
        Stack<HashMap<Integer, Integer>> st = new Stack<>();
        HashMap<Integer, Integer> pair = new HashMap<>();
        st.push(new HashMap<>());
        st.peek().put(root.val, 1);
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        while (!st.isEmpty()) {
            if (st.peek().get(root.val) == 1) {
                pre.add(root.val);
                st.peek().put(root.val, 2);
                if (root.left != null) {
                    pair = new HashMap<>();
                    pair.put(root.left.val, 1);
                    st.push(pair);
                    root = root.left;
                }
            } else if (st.peek().get(root.val) == 2) {
                in.add(root.val);
                st.peek().put(root.val, 3);
                if (root.right != null) {
                    pair = new HashMap<>();
                    pair.put(root.right.val, 1);
                    st.push(pair);
                    root = root.right;
                }
            } else if (st.peek().get(root.val) == 3) {
                post.add(root.val);
                st.pop();
                if (!st.isEmpty()) {
                    for (Map.Entry<Integer, Integer> entry : st.peek().entrySet()) {
                        if (entry.getValue() == 1) {
                            root = new TreeNode(entry.getKey());
                        }
                    }
                }
            }
        }

    }
}
