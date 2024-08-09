package com.example.datastrructure.linkedlist;

import com.example.datastrructure.DataStrructureApplication;
import org.springframework.boot.SpringApplication;

public class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);

        head.retrieve();
    }

}
