package com.collection;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(2);
        //priority Queue increases its size more elements are inserted than its initial capacity
        // if old capacity is < 64 , then 2x old capacity
        // if old capacity is >= 64 , then 1.5x old capacity
        pQueue.add(78);
        pQueue.add(14);
        pQueue.add(86);
        pQueue.add(27);
        pQueue.add(196);
        pQueue.add(158);
        pQueue.add(235);

        System.out.println(pQueue);
        //[14, 27, 86, 78, 196, 158, 235]
        // order of insertion is preserved in Array Deque

        // some pre defined methods
        pQueue.offer(200);
        System.out.println(pQueue);
        pQueue.offer(89);
        System.out.println(pQueue);
        // we cannot insert elements inside priority queue index based bcz it follows heap property
        System.out.println(pQueue.peek());
        // 14
        // [14, 27, 86, 78, 196, 158, 235, 200, 89]
        System.out.println(pQueue.poll());
        System.out.println(pQueue);
        //[27, 78, 86, 89, 196, 158, 235, 200]
    /*

            🧠 Important Concept (ye pakad le 🔥)

            👉 PriorityQueue sorted list nahi hoti hai
            👉 Ye internally Min Heap use karti hai

            Matlab:

            Sirf smallest element top pe guaranteed hota hai
            Baaki elements heap structure me hote hain (not fully sorted)

                25
              /    \
            50      75
           /  \    /   \
         150 100 125   175
         */
    }
}
