package com.example.datastrructure.linkedlist.algorithm;

import com.example.datastrructure.linkedlist.improved.SinglyLinkedList;
import com.example.datastrructure.linkedlist.improved.SinglyNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AlgorithmService {

    public SinglyLinkedList removeDups(SinglyLinkedList ll){
        SinglyNode node = ll.getHeader();
        while (node != null && node.next != null){
            SinglyNode r = node;
            while (r.next != null){
                if(node.value == r.next.value){
                    r.next = r.next.next;
                }else {
                    r = r.next;
                }
            }
            node = node.next;
        }
        return ll;
    }

    public int removeDuplications(LinkedList<Integer> ll){
        LinkedList<Integer> dataList = new LinkedList<>();
        for(Integer i : ll){
            if(!dataList.contains(i)){
                dataList.add(i);
            }
        }
        return dataList.size() ;
    }

    public SinglyNode getKthFromLast(SinglyLinkedList ll, int k){
        SinglyNode node = ll.getHeader();
        return getK(node, k);


    }

    private SinglyNode getK(SinglyNode node, int k){

        SinglyNode node1 = node;
        SinglyNode node2 = node;

        for(int i = 0; i< k ; i++){
            if(node1 == null) return null;
            node1 = node1.next;
        }

        while(node1 != null ){
            node1 = node1.next;
            node2 = node2.next;
        }
        return node2;
    }

    public SinglyNode partition(SinglyLinkedList ll, int x){
        SinglyNode head = ll.getHeader();

        SinglyNode beforeStart = null;
        SinglyNode beforeEnd = null;
        SinglyNode afterStart = null;
        SinglyNode afterEnd = null;
        SinglyNode centerNode = null;


        while (head.next != null){
            if(head.value == x){
                centerNode = head;
            }else if(head.value < x){
                if(beforeStart ==null){
                    beforeStart = head;
                    beforeEnd = beforeStart;
                }else {
                    beforeEnd.next = head;
                    beforeEnd = head;
                }
            }else {
                if(afterStart == null){
                    afterStart = head;
                    afterEnd = afterStart;

                }else {
                    afterEnd.next = head;
                    afterEnd = head;
                }
            }
            head = head.next;
        }
        if(beforeStart == null){
            centerNode.next = afterStart;
            return centerNode;
        }else{
            beforeEnd.next = centerNode;
            centerNode.next = afterStart;
            return beforeStart;
        }
    }


}
