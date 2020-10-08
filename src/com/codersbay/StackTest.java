package com.codersbay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StackTest {

    List<Integer> stack = new ArrayList<>();

    @Test
    public void testAddElementToStack() {
        int newElement = 3;

        Stack.push(newElement, stack);
        assertEquals(3, stack.get(stack.size() - 1));
    }

    @Test
    public void testReturnSizeOfStack() {
        stack.add(3);
        stack.add(4);
        stack.add(0);
        assertEquals(3, Stack.size(stack));
    }

    @Test
    public void testReturnAndRemoveLastElement() throws Exception {
        assertThrows(Exception.class, () -> Stack.pop(stack));
        stack.add(3);
        stack.add(4);
        stack.add(0);
        assertEquals(0, Stack.pop(stack));
        assertEquals(2, stack.size());
    }

    @Test
    public void testOnlyReturnLastElement() throws Exception {
        stack.add(9);
        stack.add(2);
        stack.add(8);
        assertEquals(8, Stack.peek(stack));
    }

    @Test
    public void testReturnAndRemoveNElementsOfStack() throws Exception {
        int n = 2;
        assertThrows(Exception.class, () -> Stack.pop(n, stack));
        stack.add(9);
        stack.add(2);
        stack.add(8);
        assertArrayEquals(new int[]{2, 8}, Stack.pop(n, stack));
    }

    @Test
    public void testOfOverrideEquals() {
        int[] test = {1, 9};
        int[] test2 = {1, 9};
        assertArrayEquals(new int[]{1, 9}, test);
    }


}
