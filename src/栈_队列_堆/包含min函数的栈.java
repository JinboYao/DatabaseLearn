package src.栈_队列_堆;
import java.util.*;

public class 包含min函数的栈 {
    public Stack<Integer> stack=new Stack<Integer>();
    public Stack<Integer> stackMin=new Stack<Integer>();
    public void push(int node) {
        if(stack.isEmpty()){
            stackMin.push(node);
        }else{
            if(stackMin.peek()<node){
                stackMin.push(stackMin.peek());
            }else{
                stackMin.push(node);
            }
        }
        stack.push(node);
    }

    public void pop() {
        stack.pop();
        stackMin.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackMin.peek();
    }
}
