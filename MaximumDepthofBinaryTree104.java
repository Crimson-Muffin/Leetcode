import java.util.*;
class MaximumDepthofBinaryTree104{
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
    public static void main(String args[]){
        MaximumDepthofBinaryTree104 obj = new MaximumDepthofBinaryTree104();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        //root.left.left = new TreeNode(4);
        //root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(obj.maxDepth(root));
    }
}