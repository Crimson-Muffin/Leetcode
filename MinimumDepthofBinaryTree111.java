class MinimumDepthofBinaryTree111{
    public int minDepth(TreeNode root){
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        // if left or right is 0, then we return the other side + 1
        // if both are 0, then we return 1
        // if both are not 0, then we return the smaller side + 1
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
}