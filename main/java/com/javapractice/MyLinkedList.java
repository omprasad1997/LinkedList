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
    public int searchNode(INode myGivenNode) {
        int count = 0;
        INode tempNode = head;
        while(tempNode != null && tempNode.getNext() != null)
        {
            if(tempNode.getKey().equals(myGivenNode)){
                break;
            }
            else{
                count++;
                tempNode = tempNode.getNext();
            }
        }
        return count;
    }

    public void insertValueAtParticularPosition(INode mySecondNode, INode insertingNode) {
        INode tempNode = head;
        while(tempNode != null && tempNode.getKey() != mySecondNode.getKey())
        {
            tempNode = tempNode.getNext();
        }
        INode tempNode2 = tempNode;
        tempNode = tempNode.getNext();
        tempNode2.setNext(insertingNode);
        insertingNode.setNext(tempNode);
    }

    public int size() {
        INode tempNode = head;
        int count = 0;
        while(tempNode != null){
            tempNode = tempNode.getNext();
            count++;
        }
        System.out.println("Size is : " + count);
        return count;
    }


    public INode deleteValueFromParticularPosition(INode deletingNode) {
        INode tempNode = head;

            while(tempNode != null && tempNode.getNext().getKey() != deletingNode.getKey())
            {
                tempNode = tempNode.getNext();
            }
            INode newTempNode = tempNode.getNext();
            tempNode.setNext(tempNode.getNext().getNext());
            newTempNode.setNext(null);
            return tempNode;
    }
}
