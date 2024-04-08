package Trees;

//Evaluar si el árbol binario completo es verdadero o falso respetando las siguientes consignas
//Los únicos valores posibles para los nodos son 0, 1, 2 y 3
//Si el nodo es una hoja -> Si su valor es 1 retorno true, si es 0 retorno false
//Si no es una hoja -> Si su valor es 2 retorno una operación OR entre su hoja izquierda y derecha
//Si es 3, retorno una operación AND entre su hoja izquierda y derecha

public class EvaluateTree {
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null){
            if(root.val == 1) return true;
            return false;
        }

        if(root.val == 2) return evaluateTree(root.left) || evaluateTree(root.right);
        return evaluateTree(root.left) && evaluateTree(root.right);
    }
}
