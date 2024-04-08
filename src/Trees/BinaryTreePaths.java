package Trees;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    private List<Integer> list = new ArrayList<Integer>();
    private StringBuilder sb = new StringBuilder();
    private List<String> res = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        getPaths(root);
        return res;
    }

    public void getPaths(TreeNode root){
        if(root == null) return;

        list.add(root.val);

        getPaths(root.left);
        getPaths(root.right);

        int size = list.size();
        //Si estoy en una hoja, imprimo el camino
        if(root.left == null && root.right == null){
            sb.setLength(0);
            for(int i = 0 ; i < size - 1 ; i++)
                sb.append(list.get(i) + "->");

            sb.append(list.get(size - 1));
            res.add(sb.toString());
        }
        //Una vez que retorno significa que no vuelvo más a este nodo
        //por lo que lo elimino de la lista parcial.
        list.remove(size - 1);
    }
}
