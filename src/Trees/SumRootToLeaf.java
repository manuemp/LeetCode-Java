package Trees;

//En un árbol binario compuesto de 1s y 0s, por cada camino hasta una hoja
//generar un número binario. Devolver la suma de todos los números binarios
//formados por el árbol.

public class SumRootToLeaf {
    private StringBuilder sb = new StringBuilder();
    private int res =0;
    public int sumRootToLeaf(TreeNode root) {

        if(root == null) return 0;
        sb.append(root.val);

        if(root.left == null && root.right == null){
            res += strToBinary(sb.toString());
            if(sb.length() > 1) sb.setLength(sb.length() - 1);
            return res;
        }

        sumRootToLeaf(root.left);
        sumRootToLeaf(root.right);

        if(sb.length() > 1) sb.setLength(sb.length() - 1);
        return res;
    }

    public int strToBinary(String str){
        int len = str.length();
        double res = 0;

        for(int i = 0 ; i < len ; i++)
            if(str.charAt(i) == '1') res += Math.pow(2, len - i - 1);

        return (int)res;
    }
}


//LEETCODE

//public int sumRootToLeaf(TreeNode root) {
//    return helper(root,0);
//}
//    private int helper(TreeNode node,int sum){
//        if(node==null){
//            return 0;
//        }
//        sum=(2*sum)+node.val;
//        if(node.left==null && node.right==null){
//            return sum;
//        }
//        return helper(node.left,sum)+helper(node.right,sum);
//    }


