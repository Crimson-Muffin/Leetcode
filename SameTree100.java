public class SameTree100 {
    boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p == null || q == null || p.val!=q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        SameTree100 st = new SameTree100();
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        p.left = new TreeNode(2);
        q.left = new TreeNode(2);
        p.right = new TreeNode(3);
        q.right = new TreeNode(3);
        System.out.println(st.isSameTree(p, q));
    }
}
