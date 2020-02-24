package com.example.kenyanflag;

public class QueueArr implements Queue {
    private String arr[];
    private int rear;
    private int front;

    public QueueArr(){
        arr=new String[5];
        rear=front=-1;
    }
    public QueueArr(int arrSize){
        arr=new String[arrSize];
        rear=front=-1;
    }
    public boolean isFull(){
        if (front==0 && rear==arr.length-1){
            return true;
        }
        if (front==rear+1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (front==-1)
        {
            return true;
        }
        else
            return false;
    }
    public int size(){
        if (rear>=front)
        {
            return (rear-front)+1;
        }
        else
            return (arr.length-(front-rear)+1);
    }
    public Object front(){
        if (isEmpty())
        {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("Front -> "+front);
            System.out.println("Elements");
            for (int i=front;i!=rear;i=(i+1)%arr.length){
                System.out.println(arr[i]);
            }

        }
        return null;
    }
    public void enqueue(Object o){
        if (isFull()){
            System.out.println("Queue is full");
        }
        else {
            if (front==-1){
                front=0;
            }
            rear=(rear+1)%arr.length;
            arr[rear]= String.valueOf(o);
            //System.out.println("inserted x");
        }
    }
    public Object dequeue(){
        int temp;
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            temp= Integer.parseInt(arr[front]);
            if (front==rear){
                front=-1;
                rear=-1;
            }
            else {
                front=(front+1)%arr.length;
            }
            return temp;
        }
        return null;
    }
    public static void main (String[] args){
        QueueArr queueArr=new QueueArr();
        queueArr.isEmpty();
        queueArr.enqueue(10);
        queueArr.enqueue(100);
        queueArr.enqueue(1000);
        queueArr.enqueue(30);
        queueArr.enqueue(20);
        queueArr.enqueue(102);
        queueArr.isEmpty();
        System.out.println("Size of queue "+queueArr.size());
        System.out.println("Removed element "+ queueArr.dequeue());
        queueArr.front();
        System.out.println(queueArr.size());
    }
}
