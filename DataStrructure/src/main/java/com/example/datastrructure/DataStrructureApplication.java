package com.example.datastrructure;

import com.example.datastrructure.hashtable.HashTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataStrructureApplication {

    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("min","min is good");
        h.put("yun","yun is yood");
        h.put("kim","kim is kood");
        h.put("jay","jay is jood");

        System.out.println(h.get("min"));;
        System.out.println(h.get("yun"));;
        System.out.println(h.get("kim"));;
        System.out.println(h.get("jay"));;
        System.out.println(h.get("aa"));;

    }

}
