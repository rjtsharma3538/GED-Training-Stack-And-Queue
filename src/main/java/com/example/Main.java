package com.example;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q=new Queue<Integer>();
        q.push(7);
        q.push(71);
        q.push(79);
        q.push(5);
        q.push(10);

        q.display();

        q.pop();
        q.pop();
        q.pop();

        q.display();

        System.out.println(q.peak());
    }
}