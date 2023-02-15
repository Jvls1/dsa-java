package jojo.datastructure;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;

    private static class Node<T> {
        T data;
        Node<T> nextData;
    }

    public void enqueue(T item) {
        Node<T> oldLast = last;
        last = new Node<>();
        last.data = item;
        last.nextData = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.nextData = last;
        }
    }

    public T dequeue() {
        T item = first.data;
        first = first.nextData;
        if (isEmpty()) {
            last = null;
            throw new RuntimeException("Empty Stack");
        }
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

}
