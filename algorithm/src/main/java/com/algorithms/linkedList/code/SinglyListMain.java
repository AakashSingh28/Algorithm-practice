package com.algorithms.linkedList.code;

public class SinglyListMain {


    public static void main(String[] args) {

        SinglyLinkedList list=new SinglyLinkedList();
        list.createSinglyLinkedList(5);
        list.insertInLinkedList(6,1);
        list.insertInLinkedList(7,3);
        list.insertInLinkedList(8,4);
        list.insertInLinkedList(9,5);
        list.insertInLinkedList(10,6);

        list.insertInLinkedList(11,4);
        list.insertInLinkedList(14,0);

        list.traverseSinglyLinkedList();

    }
}
