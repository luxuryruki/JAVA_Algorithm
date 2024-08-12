package com.example.datastrructure.linkedlist;

public class DoublyNode implements Node{
    int value;
    DoublyNode previous;
    DoublyNode next;

    public DoublyNode(int value) {
        this.value = value;
    }

    @Override
    public void append(int a) {
        DoublyNode end = new DoublyNode(a);
        DoublyNode n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
        end.previous = n;
    }

    @Override
    public void delete(int d) {
        DoublyNode n = this;
        while (n.next != null){
            if(n.next.value == d){
                n.next = n.next.next;
                n.next.next.previous = n;
            }else {
                n = n.next;
            }
        }
    }

    @Override
    public void retrieve() {
        DoublyNode n = this;
        while (n.next != null){
            if(n.previous != null){
                System.out.print(n.previous.value  + " , ");
            }else {
                System.out.print("0 , ");
            }
            System.out.print(n.value  + " , ");
            if(n.next != null)  System.out.print(n.next.value);
            System.out.println("");
            n=n.next;
        }

    }
}
