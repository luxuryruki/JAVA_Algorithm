package com.example.datastrructure.linkedlist.improved;

/*
* header와 같은 멤버를 private으로 두고 getter/setter로 관리해야하는 이유
* Node 클래스는 데이터 저장 용도이므로 LinkedList클래스에서 직접 접근하는것이 용이
* 하지만 LinkedList클래스는 저장된 데이터를 관리하는하는 것이기때문에 외부에서 접근가능하게 할 경우 데이터가 깨질 수 있다.
* 결론은 데이터를 단순히 품고있는 Node는 LinkedList에 의해 직접 관리하는 것이 유리, 이러한 데이터들을 관리하는 linkedlist는 외부에서 함부러 제어 불가능하게 관리.
* */
public class SinglyLinkedList {
    private SinglyNode header;

    public SinglyNode getHeader(){
        return this.header;
    }
    public SinglyLinkedList() {
        this.header = new SinglyNode();
    }
    public void append(int a){
        SinglyNode end = new SinglyNode(a);
//        end.value = a;
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
