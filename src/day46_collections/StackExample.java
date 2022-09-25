package day46_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);

        System.out.println("at the top " + stack.peek());
        stack.pop();  // removes the top element
        System.out.println("at the top " + stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop() + " was removed from the stack");
        System.out.println(stack);

        // i can use the methods from List , but for stack i want to use the function of LIFO
        System.out.println(stack.get(0));
        stack.add("h");

    }


}
