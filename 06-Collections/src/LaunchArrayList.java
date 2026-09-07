package com.collection;

import java.util.ArrayList;

public class LaunchArrayList
{
	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(20);
		al1.add(30);
		al1.add(1, 44);
		//al1.add(null);//allowed
		System.out.println(al1);
		ArrayList al2=new ArrayList();
		al2.add("Telusko");
		al2.add("Java");
		al2.add("DevOps");
		System.out.println(al2);
		al2.addAll(al1);
//		al2.addAll(1,al1);
		System.out.println(al2);
		
	
	}

}
