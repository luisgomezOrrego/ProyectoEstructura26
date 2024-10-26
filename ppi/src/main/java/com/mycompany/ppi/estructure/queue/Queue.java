
package com.mycompany.ppi.estructure.queue;


public class Queue<T> {
     private Node<T> front;
    private Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (rear != null) {
            rear.setSiguiente(newNode);
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
    }

    public T dequeue() {
        if (front == null) {
            throw new IllegalStateException("The queue is empty.");
        }
        T value = front.getValor();
        front = front.getSiguiente();
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public T peek() {
        if (front == null) {
            throw new IllegalStateException("The queue is empty.");
        }
        return front.getValor();
    }

    public boolean isEmpty() {
        return front == null;
    }
}

