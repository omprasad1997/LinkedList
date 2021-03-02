package com.javapractice;

public class MyLinkedList {
    public static INode head;
    public static INode tail;
    
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
       if(this.tail==null){
           this.tail=newNode;
       }
       if(this.head == null){
           this.head = newNode;
       }else{
           INode tempNode = this.head;
           this.head = newNode;
           this.head.setNext(tempNode) ;
       }
    }

    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My nodes :");
        INode tempNode = head;
        while(tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void append(INode newNode) {
        if(this.tail==null){
            this.tail=newNode;
        }
        if(this.head == null){
            this.head = newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode  myNode, INode newNode) {
        INode tempNode =  myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = head;
        while(!tempNode.getNext().equals(tail))
        {
            tempNode = tempNode.getNext();
        }
        INode tempNode2 = tempNode;
        tempNode2.setNext(null);
        tempNode = tempNode.getNext();
        return tempNode;
    }
}
