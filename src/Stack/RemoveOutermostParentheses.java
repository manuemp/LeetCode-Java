package Stack;
import java.util.Stack;

//Dentro de un grupo de paréntesis, remover de cada subrgupo sus paréntesis de
//apertura y cierre
//Ejemplo: (()) -> ()  //  (()()) -> ()()  //  () -> ""  //  (()(())) -> ()(())

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        //Lo que hay que hacer es generar un stack con los paréntesis de apertura
        //Cuando el stack esté vacío significa que se cerró un subgrupo
        //Mientras no esté vacío, significa que estoy dentro del mismo subgrupo

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '('){
                if(stack.isEmpty()) stack.push('(');
                else{
                    stack.push('(');
                    sb.append('(');
                }
            }
            else{
                //Si es de cierre, primero elimino el último ( del stack
                //Luego me fijo si está vacío o si sigo dentro del subgrupo
                stack.pop();
                if(!stack.isEmpty()) sb.append(')');
            }
        }

        return sb.toString();
    }
}
