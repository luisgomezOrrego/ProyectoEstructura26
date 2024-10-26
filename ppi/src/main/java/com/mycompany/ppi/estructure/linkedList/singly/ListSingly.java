
package com.mycompany.ppi.estructure.linkedList.singly;

import com.mycompany.ppi.estructure.stack.*;

public class ListSingly<T> {
      
    Node root;
    int tamaño;
    

    public void add(T valor ) {
        Node<T> nuevoNodo = new Node<>(valor);
        if (root == null) {
            root = nuevoNodo;
        } else {
            Node<T> actual = root;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        tamaño++;
    }
    
     public T find(String code) {
        Node<T> current = root;
        
        while (current != null) {
            if (current.getValor().equals(code)) {
                return (T) current.getValor();
            }else{
                current=current.getSiguiente();
            }
        }
        return null;
      }
   
    public boolean eliminar(T valor) {
        if (root == null) {
            return false;
        }

        if (root.getValor().equals(valor)) {
            root = root.getSiguiente();
            tamaño--;
            return true;
        }

        Node<T> actual = root;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getValor().equals(valor)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                tamaño--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    
    public void Show() {
    if (root == null) {
        System.out.println("La lista está vacía.");
        return;
    }

    Node<T> current = root;
    System.out.print("Elementos en la lista: ");
    while (current != null) {
        System.out.println(current.getValor() + " ");
        current = current.getSiguiente();
    }
    System.out.println(); // Para añadir un salto de línea al final
}
    
        
    
}
