package com.example.datastrructure.linkedlist.improved;

public class LinkedListNode {
    public static void main(String[] args){
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.delete(2);
        ll.append(4);
        ll.retrieve();
    }
}
