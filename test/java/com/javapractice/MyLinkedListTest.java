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

    @Test
    public void givenFirstElementWhenDeletedShouldPassLinkedListResult(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        myLinkedList.pop();
        myLinkedList.printMyNodes();
        boolean result =  MyLinkedList.head.equals(mySecondNode) &&
                MyLinkedList.head.getNext().equals(myThirdNode) ;
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastElementWhenDeletedShouldPassLinkedListResult(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        myLinkedList.popLast();
        myLinkedList.printMyNodes();
        boolean result =  MyLinkedList.head.equals(myFirstNode) &&
                MyLinkedList.head.getNext().equals(mySecondNode) &&
                 MyLinkedList.tail.getNext()==(null);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenValueWhenSearchedInLinkedListShouldPassResult(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        int nodePosition   = myLinkedList.searchNode(mySecondNode);
        System.out.println(mySecondNode.getKey() + " is at postion : " + nodePosition);
        boolean result =  (nodePosition==2);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenValueWhenInsertedAfterParticularValueInLinkedListShouldPassResult(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyNode<Integer> insertingNode = new MyNode<>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        myLinkedList.insertValueAtParticularPosition(mySecondNode,insertingNode);
        myLinkedList.printMyNodes();
        boolean result =  mySecondNode.getNext().equals(insertingNode);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenValueWhenDeletedFromParticularPositionInLinkedListShouldPassResult(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.printMyNodes();
        myLinkedList.size();
        myLinkedList.deleteValueFromParticularPosition(myThirdNode);
        myLinkedList.printMyNodes();
        int finalSize = myLinkedList.size();
        boolean result = (finalSize == 3);
        Assertions.assertTrue(result);
    }
}
