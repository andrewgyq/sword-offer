/*
面试题7：两个栈实现队列
*/
import java.util.Stack;
public class QueueWithTwoStacks{
    private Stack<Integer> stackFirst = new Stack<Integer>();
    private Stack<Integer> stackSecond = new Stack<Integer>();

    public boolean offer(int val){
        if(stackSecond.empty()){
            stackFirst.push(val);
        }else{
            while(!stackSecond.empty()){
                stackFirst.push(stackSecond.pop());
            }
            stackFirst.push(val);
        }
        return true;
    }
    
    public int poll(){
        if(!stackSecond.empty()){
            return stackSecond.pop();
        }else{
            while(!stackFirst.empty()){
                stackSecond.push(stackFirst.pop());
            }
            return stackSecond.pop();
        }
    }

    public boolean empty(){
        if(stackFirst.empty() && stackSecond.empty()){
            return true;
        }
        return false;
    }
}