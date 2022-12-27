package src.字符串;

import java.util.Stack;

public class 有效的括号 {
    public boolean isValid (String s) {
        if(s.length()%2==1) return false;
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){return false;}
                else if((c==')')&&(stack.peek()!='(')){return false;}
                else if((c==']')&&(stack.peek()!='[')){return false;}
                else if((c=='}')&&(stack.peek()!='{')){return false;}
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
