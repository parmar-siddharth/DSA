package com.collection;
import java.util.ArrayList;

public class LaunchCollections
{
	public static void main(String[] args)
	{
		
		//type safety
		int []ar=new int[3];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		
		int data=ar[1];
		System.out.println(data);
		
		//type safety
		String str[]=new String[2];
		str[0]="AI";
		str[1]="DevOps";
		
		String info=str[0];
		System.out.println(info);
		
		//no safety
		ArrayList<String> courses=new ArrayList<>();
			courses.add("Java");
			courses.add("AI");
			courses.add("DevOps");
			//courses.add(10);
		
			String course1=(String) courses.get(0);
			String course2=(String) courses.get(1);
			String course3=(String) courses.get(2);
			//String course4=(String) courses.get(3);
			
			System.out.println(course1.toUpperCase());
			System.out.println(course2.toUpperCase());
			System.out.println(course3.toUpperCase());
			//System.out.println(course4.toUpperCase());
			
			ArrayList<Integer> list=new ArrayList<>();
//			list.add("Telusko");
			list.add(44);
			list.add(45);
			list.add(46);
			System.out.println(list);
		
	}

}
