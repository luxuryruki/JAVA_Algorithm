package com.example.leetcode.middleOfTheLinkedList;


import java.util.ArrayList;
import java.util.List;

/**
 * 876. Middle of the Linked List
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MiddleOfTheLinkedList {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2,a);
    ListNode c = new ListNode(3,b);
    ListNode d = new ListNode(4,c);
    ListNode e = new ListNode(5,d);

    //Approach 1
    public ListNode middleNode1(ListNode head){
        List<ListNode> list = new ArrayList<>();
        while (head != null){
            list.add(head);
            head = head.next;
        }

        return list.get(list.size() /2);
    }

    //Approach 2
    public ListNode middleNode2(ListNode head){
        ListNode middle = head;
        ListNode end = head;
        while(end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }

/*
* 1 - middle = 1, end = 1
* 1, 2 - middle = 2, end = 2
* 1, 2, 3 - middle = 2, end = 3
* 1, 2, 3, 4 - middle = 3, end = 4
* 1, 2, 3, 4, 5 - middle = 3, end = 5
* */


}
