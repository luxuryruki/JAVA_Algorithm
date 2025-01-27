package com.example.datastrructure.hashtable;


import java.util.LinkedList;

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
        LinkedList<Node> list = data[index];
        if(list == null) {
            list = new LinkedList<>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
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