package com.example.datastrructure.linkedlist;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(1);
        head.append(2);
        head.append(3);
        head.append(4);

        head.retrieve();
    }

}
