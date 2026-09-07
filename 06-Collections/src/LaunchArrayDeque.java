package com.collection;

import java.util.ArrayDeque;
class Telusko
{
	}
public class LaunchArrayDeque 
{
	public static void main(String[] args)
	{
		ArrayDeque ad=new ArrayDeque();
		ad.add(100);
		ad.add(200);
		System.out.println(ad);
		ad.add(300);
		System.out.println(ad);
		ad.addFirst(400);
		System.out.println(ad);
		ad.add("Telusko");
		ad.add(45.5);
		ad.add(4);
		ad.add(4);
//		ad.add(null);//exception
		System.out.println(ad);
		
		
		
	}

}
