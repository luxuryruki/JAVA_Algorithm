package com.example.datastrructure.linkedlist.improved;


public class DoublyLinkedList {
    DoublyNode header;

    public DoublyLinkedList() {
        header = new DoublyNode();
    }
    public void append(int a){
        DoublyNode end = new DoublyNode();
        end.value = a;
        DoublyNode node = header;
        while (node.next != null){
            node = node.next;
        }
        end.previous = node;
        node.next = end;
    }

    public void delete(int a){
        DoublyNode node = header;
        while (node.next != null){
            if(node.next.value == a){
                node.next.next.previous = node;
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
    }

    public void retrieve(){
        DoublyNode node = header.next;
        while (node != null){
            if(node.previous != null){
                System.out.print(node.previous.value  + " , ");
            }else {
                System.out.print("0 , ");
            }
            System.out.print(node.value  + " , ");
            if(node.next != null)  System.out.print(node.next.value);
            System.out.println("");
            node=node.next;
        }


    }

}
