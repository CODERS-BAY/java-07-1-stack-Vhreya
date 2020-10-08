package com.codersbay;

import java.util.List;

public class Stack {


    public static void push(int newElement, List<Integer> stack) {

        stack.add(newElement);
    }

    public static int size(List<Integer> stack) {

        return stack.size();
    }

    public static int pop(List<Integer> stack) throws Exception {
        if (stack.size() == 0) {
            throw new Exception("Stack too small");
        }
        int removedElement = stack.get(stack.size() - 1);
        stack.remove(stack.get(stack.size() - 1));
        return removedElement;
    }

    public static int peek(List<Integer> stack) throws Exception {
        if (stack.size() == 0) {
            throw new Exception("Stack too small");
        }
        return stack.get(stack.size() - 1);
    }

    public static int[] pop(int numberOfElementsToBeRemoved, List<Integer> stack) throws Exception {
        if (stack.size() == 0) {
            throw new Exception("Stack too small");
        }
        int[] few = new int[numberOfElementsToBeRemoved];
        int counter = numberOfElementsToBeRemoved-1;
        int numberOfElementsInStack = stack.size();
        for (int i = numberOfElementsInStack - 1; i >= numberOfElementsInStack - numberOfElementsToBeRemoved; i --) {
            few[counter] = stack.get(i);
            stack.remove(stack.size()-1);
            counter--;
        }
        return few;
    }

    @Override
    public String toString() {
        return "Stack{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
