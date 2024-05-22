package src.栈_队列_堆;

public class 有效的括号 {
    public Stack<Character> sta= new Stack<>();
    public boolean isValid (String s) {
        // write code here
        char[] ch= s.toCharArray();
        if(ch[0]=='}'||ch[0]==']'||ch[0]==')'|| ch.length%2==1){
            return false;
        }
        for(int i=0;i<ch.length;i++){
            // char flag=sta.peek();
            if(ch[i]=='{'||ch[i]=='['||ch[i]=='('){
                sta.push(ch[i]);
            }else{
                char flag=sta.peek();
                if(ch[i]=='}' && flag=='{'){
                    sta.pop();
                }else if(ch[i]==']' && flag=='['){
                    sta.pop();
                }else if(ch[i]==')' && flag=='('){
                    sta.pop();
                }else{
                    break;
                }
            }
        }
        return sta.isEmpty();
    }
}
