package com.codersbay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<Integer> stack = new ArrayList<>();
        int newElement = 0;

        System.out.println("What do you want to do? '+' for add elements, '?' for size of stack, '-' for removing an element form the stack, 'last' for showing the last element and 'more' for deleting more elements at once");

        String answer = sc.nextLine();
        if (answer.equals("+")) {
            while (!sc.hasNext("q")) {
                newElement = sc.nextInt();
                Stack.push(newElement, stack);
            }
            System.out.println(stack);
        }

        if (answer.equals("?")) {
            System.out.println(Stack.size(stack));
        }

        if (answer.equals("-")) {
            Stack.pop(stack);
            System.out.println(stack);
        }

        if (answer.equals("last")) {
            System.out.println(Stack.peek(stack));
        }

        if (answer.equals("more")) {
            System.out.println("How many elements do you want to remove?");
            int n = sc.nextInt();
            System.out.println(Arrays.toString(Stack.pop(n, stack)));
        }
    }
}
