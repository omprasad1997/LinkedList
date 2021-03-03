package com.javapractice;

public class MyStack {

    private static MyLinkedList myLinkedList;
    public INode tail;
    public INode head;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public static void push(INode myNode){
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNodes();

    }

    public INode peak() {
        return myLinkedList.head;
    }
}
