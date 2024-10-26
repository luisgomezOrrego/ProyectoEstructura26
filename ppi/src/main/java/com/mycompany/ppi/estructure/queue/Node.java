package com.mycompany.ppi.estructure.queue;

import com.mycompany.ppi.estructure.stack.*;


public class Node<T> {
    private T valor;
    private Node<T> siguiente;

    public Node(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Node<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node<T> siguiente) {
        this.siguiente = siguiente;
    }
}
