package com.example.datastrructure.linkedlist.algorithm;

import com.example.datastrructure.linkedlist.improved.SinglyLinkedList;
import com.example.datastrructure.linkedlist.improved.SinglyNode;

import java.util.LinkedList;

public class AlgorithmProblems {
    public static void main(String[] args) {
        AlgorithmService algorithmService = new AlgorithmService();

//        LinkedList<Integer> data = new LinkedList<>();
//        data.add(1);
//        data.add(1);
//        data.add(2);
//        data.add(2);
//        data.add(3);
//
//        System.out.println(algorithmService.removeDuplications(data));

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.append(2);
        sll.append(5);
        sll.append(4);
        sll.append(1);
        sll.append(2);
        sll.append(2);
        sll.append(3);
        sll.append(4);
        sll.append(3);
        sll.append(6);
        sll.append(5);


        SinglyNode node = algorithmService.partition(sll,3);
        while (node != null){
            System.out.println(node.value);
            node = node.next;
        }

//        //Remove dups
//        SinglyLinkedList removedDupsList = algorithmService.removeDups(sll);
//        removedDupsList.retrieve();


    }



}
