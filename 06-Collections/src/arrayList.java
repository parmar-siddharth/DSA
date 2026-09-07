package com.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(58);
        arrayList.add(75);
        arrayList.add(106);
        arrayList.add(1,56);  // we can insert element inside array list index based
        arrayList.add("hello");
        arrayList.add("python");
        arrayList.add("Java");
        System.out.println(arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(45);
        arrayList1.addAll(arrayList);
        //System.out.println(arrayList1);


        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(54);
        arrayList2.add(47);
        arrayList2.add(85);
        arrayList2.add(25);
        //System.out.println(arrayList2);
        //[54, 47, 85, 25]
        arrayList2.add(2,100);
        // If we add an element at an index which already contains some value, then that value will shift one index right
        // and new value will be placed at that index pos.
        System.out.println(arrayList2);
        //[54, 47, 100, 85, 25]

        Iterator<Integer> iterator = arrayList2.iterator();
        while (iterator.hasNext()) {
            System.out.println("Current Element is : " + iterator.next());
        }
        ArrayList arrayList3 = (ArrayList) arrayList.clone();
    }
}
/*
// 🔹 ARRAYLIST QUICK NOTES

// 1. Creating ArrayList
ArrayList list = new ArrayList();

// 2. Adding elements
list.add(10);        // adds at end
list.add(20);

// 3. Adding at specific index
list.add(1, 15);
// inserts at index 1 and shifts elements right
// Example: [10, 20] → [10, 15, 20]

// 4. Replacing element
list.set(1, 99);
// replaces element at index (no shifting)
// Example: [10, 15, 20] → [10, 99, 20]

// 5. Adding all elements from another list
ArrayList list2 = new ArrayList();
list2.add(50);
list2.addAll(list);
// merges list into list2
// Example: [50] + [10, 99, 20] → [50, 10, 99, 20]

// 6. Accessing element
list.get(0);         // returns element at index

// 7. Removing element
list.remove(1);      // removes element at index

// 8. Size of list
list.size();         // returns number of elements

// 🔥 KEY POINTS:
// - add(value) → adds at end
// - add(index, value) → inserts + shifts elements
// - set(index, value) → replaces element
// - addAll() → combines lists
// - ArrayList maintains insertion order
// - Allows duplicate elements
// - Default size grows dynamically (no fixed size)
 */