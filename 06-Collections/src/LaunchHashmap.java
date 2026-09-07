package com.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LaunchHashmap {
    public static void main(String[] args) {
//        HashMap hm1 = new HashMap();
//        hm1.put(4,"piyush");
//        hm1.put(5,"kumar");
//        hm1.put(6,"kapil");
//        hm1.put(7,"Arun");
//        hm1.put("hello","Arun");
//        System.out.println(hm1);
        //{4=piyush, 5=kumar, 6=kapil, 7=Arun, hello=Arun}

        // for type safety we use generics

        HashMap<Integer,String> hm1 = new HashMap();
        hm1.put(4,"piyush");
        hm1.put(5,"karan");
        hm1.put(6,"karan");
        hm1.put(7,"Arun");
        hm1.put(null,"Rahul");
        hm1.put(8,null);
        System.out.println(hm1);
        //{null=Rahul, 4=piyush, 5=karan, 6=karan, 7=Arun, 8=null}
        // we can have null as key and value both
        // key should be unique , value can be duplicate
        // Order of insertion is not maintained in HashMap

        LinkedHashMap<Integer,String> hm2 = new LinkedHashMap();
        hm2.put(4,"piyush");
        hm2.put(5,"karan");
        hm2.put(6,"karan");
        hm2.put(7,"Arun");
        hm2.put(null,"Rahul");
        hm2.put(8,null);
        System.out.println(hm2);
        //{4=piyush, 5=karan, 6=karan, 7=Arun, null=Rahul, 8=null}
        //order of insertion is maintained in LinkedHashMap
        // Basically linked list + hash map = Linked HashMap
    }
}
