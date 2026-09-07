package com.collection;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(54);
        linkedList.add(35);
        linkedList.add(15);
        linkedList.add(78);
        linkedList.add(78);
        System.out.println(linkedList);
        //[54, 35, 15, 78, 78]
        linkedList.add(null);
        System.out.println(linkedList);
        //[54, 35, 15, 78, 78, null]
        linkedList.add(2,96);
        System.out.println(linkedList);
        //[54, 35, 96, 15, 78, 78, null]

        // if we add new value to an existing index pos. then unlike array list there we will be no shifting
        // a new node will be created and linking of nodes will be changed

        // LinkedList uses references (pointers) to connect nodes,
        // and elements are accessed sequentially, not by index.

    }
}
/*
// ================= LINKED LIST (SHORT NOTES) =================

// Definition:
// A Linked List is a linear data structure where each element (node)
// contains data + reference to next node.

// Memory:
// Non-contiguous (elements stored at different memory locations)

// Structure of Node:
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Example Representation:
// [10 | next] → [20 | next] → [30 | next] → null


// ================= TYPES =================

// 1. Singly Linked List
// Each node points to next node

// 2. Doubly Linked List
// Node has: prev + next pointer

// 3. Circular Linked List
// Last node points to first node


// ================= JAVA INBUILT CLASS =================

import java.util.LinkedList;

LinkedList<Integer> list = new LinkedList<>();

list.add(10);        // add element
list.addFirst(5);    // add at beginning
list.addLast(20);    // add at end

list.remove(1);      // remove by index
list.get(0);         // access element


// ================= TIME COMPLEXITY =================

// Access (get)        -> O(n)
// Insert (begin/end)  -> O(1)
// Delete              -> O(1) (if reference given)


// ================= ADVANTAGES =================

// 1. Dynamic size (no fixed size)
// 2. Fast insertion/deletion
// 3. No memory wastage (no unused capacity)


// ================= DISADVANTAGES =================

// 1. Slow access (no direct indexing)
// 2. Extra memory for pointers
// 3. Not cache-friendly


// ================= ARRAY VS LINKED LIST =================

// Array:
// - Contiguous memory
// - Fast access O(1)
// - Slow insert/delete

// LinkedList:
// - Non-contiguous memory
// - Slow access O(n)
// - Fast insert/delete


// ================= INTERVIEW DEFINITION =================

// Linked List is a linear data structure where each node stores
// data and a reference to the next node, allowing dynamic memory
// allocation and efficient insertion/deletion.

 */