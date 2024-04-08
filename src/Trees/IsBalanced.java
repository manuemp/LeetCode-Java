package Trees;

public class IsBalanced {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root == null) return true;
            return maxDepth(root) >= 0;
        }

        public static int maxDepth(TreeNode root){
            if(root == null) return 0;

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            if(Math.abs(left - right) != 1 && Math.abs(left - right) != 0) return Integer.MIN_VALUE;
            return Math.max(left, right) + 1;
        }
    }
}
