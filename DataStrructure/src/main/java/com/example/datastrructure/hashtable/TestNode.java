package com.example.datastrructure.hashtable;

import java.util.LinkedHashMap;
import java.util.LinkedList;

class TestNode {
    String key;
    String value;
    
    TestNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

    String getKey() {
        return key;
    }

    String getValue() {
        return value;
    }

    void setValue(String value) {
        this.value = value;
    }
}

class TestHasTable {
    LinkedList<TestNode>[] data;

    TestHasTable(int size) {
        this.data = new LinkedList[size];
    }

    int getHashCode(String key){
        int hashCode = 0;
        for(char c : key.toCharArray()){
            System.out.println(c);
            hashCode += c;
        }
        return hashCode;
    }

    int getIndex(int hashcode){
        int index = hashcode % this.data.length;
        return index;
    }

    TestNode search(LinkedList<TestNode> list, String key){
        if(list == null) return null;
        for(TestNode node : list){
            if(node.getKey().equals(key)){
                return node;
            }
        }
        return null;
    }

    void put(String key, String value){
        int hashcode = getHashCode(key);
        int index = getIndex(hashcode);

        //
        LinkedList<TestNode> list = data[index];
        if(list == null){
            list = new LinkedList<>();
            data[index] = list;
        }
        TestNode node = search(list,key);
        if(node == null){
            list.addLast(new TestNode(key, value));
        }else {
            node.setValue(value);
        }

    }
    String get(String key){
        int hashcode = getHashCode(key);
        int index = getIndex(hashcode);

        LinkedList<TestNode> list = data[index];
        TestNode node = search(list,key);
        if(node == null) return "Not found";
        return node.getValue();
    }
}

class Test{
    public static void main(String[] args) {
        TestHasTable t = new TestHasTable(3);
        t.put("1", "test");
        t.put("2", "test2");
        t.put("3", "test3");

        System.out.println(t.get("1"));;
        System.out.println(t.get("2"));;
        System.out.println(t.get("3"));;
        System.out.println(t.get("4"));;
    }
}