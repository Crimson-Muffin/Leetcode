import java.util.ArrayList;
import java.util.List;

public class inOrder {
    public void traversal(TreeNode root,List<Integer> res){
        if (root == null){
            return;
        }
        traversal(root.left,res);
        res.add(root.val);
        traversal(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root,res);
        return res;
    }
}
