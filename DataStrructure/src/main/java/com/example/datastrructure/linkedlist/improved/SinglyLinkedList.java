package com.example.datastrructure.linkedlist.improved;


public class SinglyLinkedList {
    SinglyNode header;

    public SinglyNode getHeader(){
        return this.header;
    }
    public SinglyLinkedList() {
        header = new SinglyNode();
    }
    public void append(int a){
        SinglyNode end = new SinglyNode();
        end.value = a;
        SinglyNode node = header;
        while (node.next != null){
            node = node.next;
        }
        node.next = end;
    }

    public void delete(int a){
        SinglyNode node = header;
        while (node.next != null){
            if(node.next.value == a){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
    }

    public void retrieve(){
        SinglyNode node = header.next;
        while (node.next != null){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println(node.value);


    }

}
