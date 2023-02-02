package jojo.datastructure;

public class Stack<T> {

    private Node<T> initialNode = null;

    private static class Node<T> {
        T data;

        Node<T> nextData;
    }

    public Stack() {

    }

    // insert a new item
    public void push(T newItem) {
        Node<T> oldFirst = initialNode;
        initialNode = new Node<>();
        initialNode.data = newItem;
        initialNode.nextData = oldFirst;
    }

    // get the last item;
    public T pop() {
        if (initialNode == null) {
            throw new RuntimeException("Empty Stack");
        }
        T item = initialNode.data;
        initialNode = initialNode.nextData;
        return item;
    }

    public boolean isEmpty() {
        return initialNode == null;
    }
}
