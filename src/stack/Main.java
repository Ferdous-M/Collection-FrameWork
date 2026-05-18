package stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        // peek
        System.out.println("Top element: " + stack.peek());

        // pop
        System.out.println("Removed: " + stack.pop());

        System.out.println(stack);

        // isEmpty
        System.out.println(stack.isEmpty());

        // size
        System.out.println(stack.size());
    }
}