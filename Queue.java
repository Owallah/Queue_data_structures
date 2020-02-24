package com.example.kenyanflag;

public interface Queue {
    public int size();
    public boolean isEmpty();
    public void enqueue(Object O);
    public Object dequeue();
    public Object front();
}
