package com.example.datastrructure.linkedlist.improved;

/*
* 여기서 Getter / Setter 를 사용하지 않는 이유
* Getter/Setter는 캡슐화, 유지보수, 유효성 검사 등의 장점이 있지만, 단순한 노드에서는 불필요할 수 있음.
* 단순한 자료구조라면 필드를 public으로 유지하는 것이 더 직관적이고 효율적일 수도 있다.
* Linked List 같은 자료구조에서는 직접 필드 접근을 허용하는 것도 좋은 선택.
* 노드에 복잡한 데이터가 들어가거나, 노드를 외부에서 많이 다룰 경우 Getter/Setter 사용이 적절하다.
* */
public class SinglyNode {
    public int value;
    public SinglyNode next;

    public SinglyNode(int value) {
        this.value = value;
    }

    public SinglyNode() {
    }
}
