package com.example.datastrructure.linkedlist;

public class SinglyNode implements Node{
    int value;
    SinglyNode next;

    public SinglyNode(int value) {
        this.value = value;
    }

    @Override
    public void append(int a){
        SinglyNode end = new SinglyNode(a);
        SinglyNode n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    @Override
    public void delete(int d){
        SinglyNode n = this;
        while (n.next != null){
            if(n.next.value == d){
                n.next = n.next.next;
            }else {
                n = n.next;
            }
        }
    }

    @Override
    public void retrieve(){
        SinglyNode n = this;
        while (n.next != null){
            System.out.print(n.value + " >>> ");
            n=n.next;
        }
        System.out.println(n.value);
    }
}
