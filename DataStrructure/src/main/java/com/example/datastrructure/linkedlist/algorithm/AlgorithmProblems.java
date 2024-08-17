package com.example.datastrructure.linkedlist.algorithm;

import com.example.datastrructure.linkedlist.improved.SinglyLinkedList;

public class AlgorithmProblems {
    public static void main(String[] args) {
        AlgorithmService algorithmService = new AlgorithmService();
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.append(1);
        sll.append(2);
        sll.append(2);
        sll.append(3);
        sll.append(4);
        sll.append(2);
        sll.append(5);
        sll.append(4);
        sll.append(3);
        sll.append(6);
        sll.append(5);


        //Remove dups
        SinglyLinkedList removedDupsList = algorithmService.removeDups(sll);
        removedDupsList.retrieve();
    }



}
