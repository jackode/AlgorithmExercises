package jackode.algorithm.dataStructure.stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * design a stack, the complexity of get min value, push, pop is O(1)
 * Created by liujiankang on 12/21/14.
 */
public class MinStack<T extends Comparable> {
    Stack<T> stack;
    Stack<T> secondStack;

    public MinStack(){
        stack = new Stack<T>();
        secondStack = new Stack<T>();
    }

    public void push(T val){
        stack.push(val);
        if (secondStack.isEmpty() || val.compareTo(secondStack.peek()) < 0) secondStack.push(val);
        else secondStack.push(secondStack.peek());
    }

    public T min(){
        if (secondStack.isEmpty()) throw new EmptyStackException();
        return secondStack.peek();
    }

    public T pop(){
        if (secondStack.isEmpty() || stack.isEmpty()) throw new EmptyStackException();
        secondStack.pop();
        return stack.pop();
    }
}
