package com.Map;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable<>();
        ht.put("David","David");
        ht.put(1,"AI");
        ht.put(2,"Bob");
        ht.put(3,"David");
        //ht.put(null,"John"); // null pointer exception
//        ht.put(4,null); // value cannot be null // Null pointer exception
        System.out.println(ht);
    }
}
