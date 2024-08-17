package com.example.datastrructure.linkedlist.improved;

public class LinkedListNode {
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.append(1);
        sll.append(2);
        sll.append(3);
        sll.delete(2);
        sll.append(4);
        sll.retrieve();


        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.delete(2);
        dll.append(4);
        dll.retrieve();
    }
}
