package jojo.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {

    @Test
    public void testCreateQueue() {
        Queue<String> queue = new Queue<>();

        Assertions.assertNotNull(queue, "Stack can't be null");
    }

    @Test
    public void testEnqueueItem() {
        Queue<String> queue = new Queue<>();

        Assertions.assertDoesNotThrow(() -> queue.enqueue("Test"));
    }

    @Test
    public void testDequeueEmptyStack() {
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
