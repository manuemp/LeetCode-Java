package Stack;
import java.util.Stack;

//Por cada # se debe eliminar el caracter anterior del String correspondiente
//Evaluar si los String son iguales luego de procesarlos.

public class BackspaceCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        fillStack(s, stack1);
        fillStack(t, stack2);

        if(stack1.size() != stack2.size()) return false;
        while(!stack1.isEmpty())
            if(stack1.pop() != stack2.pop()) return false;

        return true;
    }

    public void fillStack(String s, Stack<Character> stack){
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c != '#') stack.push(c);
            else if(!stack.isEmpty()) stack.pop();
        }
    }
}
