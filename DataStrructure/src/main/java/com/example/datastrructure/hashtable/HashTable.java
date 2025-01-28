package com.example.datastrructure.hashtable;


import java.util.LinkedList;

/*
* 1. 키와 값을 담을 노드 생성
*   - Key & Value 선언
*   - Constructor Getter Setter 생성
* 2. 해시테이블 생성
*   - Node 담을 LinkedList 선언
*   - Linkedlist 사이즈를 받아서 해시테이블 constructor 선언
* 3. 해시테이블 기능정의
*   - getHashCode : 해시값 생성
*   - convertToIndex : 해시값을 이용해 인덱스 생성
*   - search : 키값을 이용한 노드 검색
*   - put : 키밸류 삽입
*   - get : 밸류 확인
*
* */
public class HashTable {
    LinkedList<Node>[] data;

    public HashTable(int size) {
        this.data = new LinkedList[size];
    }

    public int getHashCode(String key) {
        int hashCode = 0;
        for(char c : key.toCharArray()) {
            hashCode += c;
        }
        return hashCode;
    }

    public int convertToIndex(int hashCode) {
        return hashCode % this.data.length;
    }

    public Node searchKey(LinkedList<Node> list, String key){
        if(list == null) return null;
        for(Node node : list){
            if(node.getKey().equals(key)) return node;
        }
        return null;
    }

    public void put(String key, String value) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);

        //해당 인덱스에 데이터리스트 있는지 확인, 없으면 생성
        LinkedList<Node> list = data[index];
        if(list == null) {
            list = new LinkedList<>();
            data[index] = list;
        }

        //노드 검색
        Node node = searchKey(list, key);
        //노드가 없으면 노드 생성 후 삽입, 있으면 value 업데이트
        if(node == null) {
            list.addLast(new Node(key,value));
        }else {
            node.setValue(value);
        }
    }

    public String get(String key) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        if(node == null) return "Not found";
        return node.getValue();
    }

}