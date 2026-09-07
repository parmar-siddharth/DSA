package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchAccessData
{
	public static void main(String[] args)
	{
//		ArrayList al=new ArrayList();
//		al.add("Telusko");
//		al.add("Java");
//		al.add("AWS");
//		al.add("DevOps");
//		al.add("System Design");
////		
////		System.out.println(al);
//		String str=(String) al.get(3);
////		String str=al.get(4);
//		System.out.println(str);
//		
//		for(int i=0; i<al.size(); i++)
//		{
//			System.out.println(al.get(i));
//			al.add("Ai Engineering");
//		}
//		
//		for(Object o:al)
//		{
//			System.out.println(o);
//			al.add("AWS AI");
//		}
		
//		Iterator itr = al.iterator();
//		while(itr.hasNext())
//		{
////			Object o=itr.next();
////			System.out.println(o);
//			System.out.println(itr.next());
//			al.add("React");//fail fast
//		}
		
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		al.add("Telusko");
		al.add("Java");
		al.add("AWS");
		al.add("DevOps");
		al.add("System Design");
//		
//		System.out.println(al);
		String str=(String) al.get(3);
//		String str=al.get(4);
//		System.out.println(str);
//		
//		Iterator itr = al.iterator();
//		while(itr.hasNext())
//		{
////			Object o=itr.next();
////			System.out.println(o);
//			System.out.println(itr.next());
//			al.add("React");//fail safe
//		}
//		
//		ListIterator litr = al.listIterator(3);
////		while(litr.hasPrevious())
////		{
////			System.out.println(litr.previous());
////		}
//		while(litr.hasNext())
//		{
//			System.out.println(litr.next());
//		}
		
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.addElement(30);
		v.addElement(40);
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("*****************************");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		
		
	}

}
