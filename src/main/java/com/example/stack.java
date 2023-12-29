package com.example;

public class stack<T extends Comparable<T>> {

    private LinkedList<T> linkedList;
    
    public stack()
    {
        linkedList = new LinkedList<T>();
    }

    void push(T data)
    {
        linkedList.addAtHead(data);
    }

    void pop()
    {
        linkedList.deleteHead();
    }

    T peak()
    {
        return linkedList.head.data;
    }

    void display()
    {
        linkedList.display();
    }
}
