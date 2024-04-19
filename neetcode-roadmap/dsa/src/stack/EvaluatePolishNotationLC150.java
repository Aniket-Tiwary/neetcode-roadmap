package stack;

import java.util.Stack;

public class EvaluatePolishNotationLC150 {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> res = new Stack<>();
        for(String c:tokens){
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                int val1 = res.pop();
                int val2 = res.pop();
                if(c.equals("+"))
                    res.push(val1+val2);
                else if(c.equals("-"))
                    res.push(val2-val1);
                else if(c.equals("*"))
                    res.push(val1*val2);
                else
                    res.push(val2/val1);
            }else{
                res.push(Integer.parseInt(c));
            }
        }
        return res.pop();
    }
    public static void main(String args[]){
        String[] exp = {"2","1","+","3","*"};
        System.out.println(evalRPN(exp));
    }
}
