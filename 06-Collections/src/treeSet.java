package com.collection;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(); //Set --> Sorted order --> BST --> Red-Black Algorithim
        treeSet.add(50);
        treeSet.add(100);
        treeSet.add(150);
        treeSet.add(125);
        treeSet.add(200);
        treeSet.add(175);
        //treeSet.add(175); // duplicate elements are not allowed in tree set
        System.out.println(treeSet);
        //[50, 100, 125, 150, 175, 200]
        System.out.println(treeSet.lower(58)); //50
        System.out.println(treeSet.higher(58));  //100
        System.out.println(treeSet.ceiling(65)); //100
        System.out.println(treeSet.floor(65)); //50
        System.out.println(treeSet.headSet(125)); // [50, 100]
    }
}

// 🌳 TreeSet - Short Notes

/*
1. Definition:
   TreeSet is a class in Java that stores UNIQUE elements in SORTED order.

2. Internal Working:
   - Uses Red-Black Tree (Self-balancing BST)
   - Maintains order automatically

3. Properties:
   ✔ No duplicates allowed
   ✔ Elements are stored in ascending order (default)
   ✔ No index-based access
   ✔ Null values NOT allowed
   ✔ Time Complexity: O(log n)

4. Why sorted?
   - Follows BST rule: Left < Root < Right
   - Uses in-order traversal internally → gives sorted output

5. Common Methods:
   add()      → insert element
   remove()   → delete element
   first()    → smallest element
   last()     → largest element
   higher(x)  → next greater element
   lower(x)   → next smaller element

/*
6. Key Interview Points:
   - TreeSet uses Red-Black Tree
   - Sorted order is maintained automatically
   - All operations are O(log n)
   - Better than HashSet when sorted data is required

7. One-line Summary:
   TreeSet = Sorted + Unique + Self-balancing Tree
*/

