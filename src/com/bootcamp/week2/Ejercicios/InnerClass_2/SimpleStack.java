package com.bootcamp.week2.Ejercicios.InnerClass_2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleStack<T> implements Iterable<T> {

    //Static nested class: no necesita acceso a la instancia
    private static class Node<T>{
        T data;
        Node<T> next;

        Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> top;
    private int size;

    public void push(T item) {
        //TODO: crear nuevo nodo que apunte al top atual
        top = new Node<>(item, top);
        //TODO: actualizar top y size
        size++;
    }

    public T pop() {
        //TODO: si esta vacio lanzar NoSuchElementException
        if(isEmpty()) throw new NoSuchElementException("Stack vacio");
        //TODO: guardar dato del top, avanzar top, decrementar size
        T value = top.data;
        top = top.next;
        size--;
        return value;
    }

    public T peek(){
        if (isEmpty()) throw new NoSuchElementException("Stack vacio");
        return top.data;
    }

    public boolean isEmpty() { return top == null;}
    public int size() { return size; }

    //Inner class: necesita acceso al top del stack externo
    private class StackIterator implements Iterator<T>{
        private Node<T> current = top; //TODO: iniciar en top

        @Override
        public boolean hasNext(){
            return current != null;
        }

        @Override
        public T next(){
            if(!hasNext()) throw new NoSuchElementException();
            //TODO: guardar dato, avanzar current, retornar dato
            T data = current.data;
            current =  current.next;
            return data;
        }
    }

    @Override
    public Iterator<T> iterator(){
        return new StackIterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack[");
        Node<T> current = top;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        return sb.append("]").toString();
    }
}