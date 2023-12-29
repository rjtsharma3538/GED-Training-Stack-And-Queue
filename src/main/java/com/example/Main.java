package com.example;

public class Main {
    public static void main(String[] args) {
        stack<Integer> st=new stack<Integer>();
        st.push(89);
        st.push(7);
        st.push(823);
        st.push(73);

        st.display();

        st.pop();
        st.pop();

        st.display();

        System.out.println(st.peak());
    }
}