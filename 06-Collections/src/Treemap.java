package com.Map;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(1,"AI");
        tm.put(2,"Bob");
        tm.put(3,"David");
        //tm.put(null,"John"); // null pointer exception
        tm.put(4,null); // value can be null
        System.out.println(tm);
    }
}
