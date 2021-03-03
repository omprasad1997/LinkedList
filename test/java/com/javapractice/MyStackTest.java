package com.javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackTest {
    @Test
   public void given3NumbersWhenAddedToStatckSholudHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyStack myStack = new MyStack();
        MyStack.push(myFirstNode);
        MyStack.push(mySecondNode);
        MyStack.push(myThirdNode);

        myStack.printStack();
        INode peak = myStack.peak();
        Assertions.assertEquals(myThirdNode,peak);
    }
}
