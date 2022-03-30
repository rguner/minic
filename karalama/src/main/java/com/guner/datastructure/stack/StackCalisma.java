package com.guner.datastructure.stack;

import java.util.Stack;

class StackCalisma {
    // Pushing element on the top of the stack
    static void stackPush(Stack<Integer> stack) {
        System.out.println("Push Operation:");
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stackPop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");

        for (int i = 0; i < 5; i++) {
            Integer y = stack.pop();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the stack
    static void stackPeek(Stack<Integer> stack) {
        Integer element = stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Searching element in the stack
    static void stackSearch(Stack<Integer> stack, int element) {
        Integer pos = stack.search(element);

        if (pos == -1)
            System.out.println(element + " Element not found");
        else
            System.out.println(element + " Element is found at position: " + pos);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 4);
        stackSearch(stack, 3);
        stackSearch(stack, 2);
        stackSearch(stack, 1);
        stackSearch(stack, 0);
        stackSearch(stack, 6);
    }
}