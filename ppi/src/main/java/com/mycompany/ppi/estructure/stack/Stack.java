
package com.mycompany.ppi.estructure.stack;


public class Stack<T> {
    private Node<T> top;
     
    public Stack() {
        this.top = null;
    }
    
    public void push(T x) {
        Node<T> newNode = new Node<>(x);
        newNode.setSiguiente(top);
        top = newNode;    
        }
    
    public T pop() {
        if (top==null) {
            throw new RuntimeException("la pila esta vacia");
        }
           T value =top.getValor();
           top= top.getSiguiente();
           return value;    
    }
    
      public T peek() {
        if (top==null) {
            throw new RuntimeException("la pila esta vacia");
        }
        return top.getValor();
    }
    
}
