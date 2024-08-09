package com.example.datastrructure.linkedlist;

public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public void append(int a){
        Node end = new Node(a);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    public void delete(int d){
        Node n = this;
        while (n.next != null){
            if(n.next.value == d){
                n.next = n.next.next;
            }else {
                n = n.next;
            }
        }
    }

    public void retrieve(){
        Node n = this;
        while (n.next != null){
            System.out.print(n.value + " >>> ");
            n=n.next;
        }
        System.out.println(n.value);
    }
}
