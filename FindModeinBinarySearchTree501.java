import java.util.ArrayList;
import java.util.List;

public class FindModeinBinarySearchTree501 {
    private int currentVal;
    private int currentCount = 0;
    private int maxCount = 0;
    private List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root){
        InOrderTraversal(root);
        int[] result = new int[modes.size()];
        for(int i = 0; i < modes.size(); i++){
            result[i] = modes.get(i);
        }
        return result;
    }


    private void InOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        InOrderTraversal((node.left));

        currentCount = (node.val == currentVal) ? currentCount + 1 : 1;

        if(currentCount == maxCount){
            modes.add(node.val);
        }
        else if(currentCount > maxCount){
            maxCount = currentCount;
            modes.clear();
            modes.add(node.val);
        }
        currentVal = node.val;

        InOrderTraversal(node.right);
    }
}
