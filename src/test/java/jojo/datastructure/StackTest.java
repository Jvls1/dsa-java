package jojo.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void testCreateStack() {
        Stack<String> stack = new Stack<>();

        Assertions.assertNotNull(stack, "Stack can't be null");
    }

    @Test
    public void testPushItem() {
        Stack<String> stack = new Stack<>();

        Assertions.assertDoesNotThrow(() -> stack.push("Test"));
    }

    @Test
    public void testPopEmptyStack() {
        Stack<String> stack = new Stack<>();

        Assertions.assertThrows(RuntimeException.class, stack::pop);
    }

    @Test
    public void testIsEmptyMethodOnEmptyStack() {
        Stack<String> stack = new Stack<>();

        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyMethodOnStackWithData() {
        Stack<String> stack = new Stack<>();
        stack.push("ITEM");
        Assertions.assertFalse(stack.isEmpty());
    }
}
