package com.collection;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class LaunchTreeSet
{
	String s;
	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<>();//Set --> Sorted order --> BST --> Red-Black Algo
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		ArrayList al=new ArrayList();
		System.out.println(ts);
		al.addAll(ts);
		ListIterator itr = al.listIterator(3);
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
//		ts.add(null);exeception	
		//ts.add(175);duplicate not allowed
//		System.out.println(ts);
//		System.out.println(ts.higher(50));
//		System.out.println(ts.lower(50));
//		System.out.println(ts.higher(65));
//		System.out.println(ts.lower(30));
//		System.out.println("********************");
//		System.out.println(ts.ceiling(65));
//		System.out.println(ts.floor(30));
//		System.out.println(ts.ceiling(50));
//		System.out.println(ts.floor(50));
//		System.out.println(ts.headSet(75));
//		System.out.println(ts.tailSet(75));
		
	}

}
