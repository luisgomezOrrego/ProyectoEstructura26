
package com.mycompany.ppi.estructure.linkedList.doubly;


public class ListDoubly<T> {
    private Node<T> root;
    
     public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> current = root;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setPrevious(current);
        }
    }
    public void printList() {
        Node<T> current = root;
        while (current != null) {
            System.out.print(current.getValue().toString() + " ");
            current = current.getNext();
        }
        System.out.println();
    } 
    
    public T find(String code) {
       Node<T> current = root;
        
        while (current != null) {
            if (current.getValue().equals(code)) {
                return (T) current.getValue();
            }else{
                current=current.getNext();
            }
        }
        return null;
      }
    
    public boolean remove(String code) {
    Node<T> current = root;

    while (current != null) {
        if (current.getValue().equals(code)) {
            if (current.getPrevious() != null) {
                current.getPrevious().setNext(current.getNext());
            } else {
                root = current.getNext();
            }
            if (current.getNext() != null) {
                current.getNext().setPrevious(current.getPrevious());
            }
            return true;
        }
        current = current.getNext();
    }
    return false;
}
    
    
     
}
