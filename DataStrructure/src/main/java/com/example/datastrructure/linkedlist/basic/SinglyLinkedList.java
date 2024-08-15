package com.example.datastrructure.linkedlist.basic;

public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyNode head = new SinglyNode(1);
        head.append(2);
        head.append(3);
        head.append(4);

        head.retrieve();
    }

}
