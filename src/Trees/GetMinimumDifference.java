package Trees;

public class GetMinimumDifference {
    public int diff = Integer.MAX_VALUE;
    public Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        if(root == null) return diff;

        getMinimumDifference(root.left);

        if(prev != null){
            if(diff < 0 || diff > Math.abs(prev - root.val)) diff = Math.abs(prev - root.val);
        }
        prev = root.val;

        getMinimumDifference(root.right);

        return diff;
    }
}
