package com.javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result =  MyLinkedList.head.equals(myThirdNode) &&
                          MyLinkedList.head.getNext().equals(mySecondNode) &&
                          MyLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAppendedToLinkedListShouldBeAddedToLast(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result =  MyLinkedList.head.equals(myFirstNode) &&
                MyLinkedList.head.getNext().equals(mySecondNode) &&
                MyLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNodes();
        boolean result =  MyLinkedList.head.equals(myFirstNode) &&
                MyLinkedList.head.getNext().equals(mySecondNode) &&
                MyLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

}
