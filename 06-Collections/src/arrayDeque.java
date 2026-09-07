package com.collection;

import java.util.ArrayDeque;
class Alpha {

}
public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(5);
        //When capacity is full, then it increases size by 2x old size
        arrayDeque.add(100);
        arrayDeque.add(100);
        arrayDeque.add(200);  // adds at last
        System.out.println(arrayDeque);
        //[100, 200]
        arrayDeque.add(300);
        System.out.println(arrayDeque);
        //[100, 200, 300]
        arrayDeque.addFirst(400);  // adds at front
        System.out.println(arrayDeque);
        //[400, 100, 200, 300]
        System.out.println(arrayDeque.peek()); // gives first element but not removes it from array
        //400
        System.out.println(arrayDeque.poll()); //  gives first element but removes it from array
        //[100, 200, 300]
        System.out.println(arrayDeque);
       // arrayDeque.add(new Alpha()); // we can add an object also but it is not recomended to do so.

    }
}
/*
🟢 ArrayDeque kya hai?

👉 Java ka resizable array-based deque (double-ended queue)
👉 Matlab:

Front se bhi add/remove
Rear se bhi add/remove
In Array Deque we cannot insert elements in between, we can oly insert from rear end & front end
because its an circular array structure hai
 */