package Trees;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q){
        return inOrderCheck(p, q);
    }

    private boolean inOrderCheck(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;

        if(p == null && q != null || q == null && p != null || p.val != q.val)
            return false;

        return inOrderCheck(p.left, q.left) && inOrderCheck(p.right, q.right);
    }
}
