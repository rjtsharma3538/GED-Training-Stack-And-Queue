package com.example;

public class Queue<T extends Comparable<T>> {

    private LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<T>();
    }

    void push(T data) {
        linkedList.addAtTail(data);
    }

    void pop() {
        linkedList.deleteHead();
    }

    T peak() {
        return linkedList.head.data;
    }

    void display()
    {
        linkedList.display();
    }

}
