package Stack;

import java.util.Stack;

//Si el string del array operations es "+", agrego la suma de los últimos dos 'scores'.
//Si es D, agrego al anterior duplicado
//Si es C, elimino el último 'score' anotado
//Si es un número, lo sumo a los scores
//La función devuelve la suma de todo lo obtenido

public class BaseballGame {
    public int calPoints(String[] operations) {
        int prev1 = -1, res = 0, prev2 = -1;

        Stack<Integer> stack = new Stack<>();

        for(String s :operations){
            if(s.equals("+")){
                prev1 = stack.pop();
                prev2 = stack.peek();
                stack.push(prev1);
                stack.push(prev1 + prev2);
            }
            else if(s.equals("D")) stack.push(2 * stack.peek());
            else if(s.equals("C")) stack.pop();
            else stack.push(Integer.parseInt(s));
        }

        while(!stack.isEmpty()) res += stack.pop();
        return res;
    }
}
