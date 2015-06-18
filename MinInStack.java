/*
面试题21：包含min函数的栈
*/

import java.util.Stack;
public class MinInStack{
    private Stack<Integer> data = new Stack<Integer>();
    private Stack<Integer> min = new Stack<Integer>();

    public void push(int value){
        data.push(value);
        if(min.empty() || value < min.peek())
            min.push(value);
        else
            min.push(min.peek());
        
    }

    public void pop(){
        data.pop();
        min.pop();
    }

    public int min(){
        return min.peek();
    }
}