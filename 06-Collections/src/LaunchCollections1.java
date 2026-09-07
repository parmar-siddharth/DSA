package com.collection;
import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections1 
{
	public static void main(String[] args)
	{
		ArrayList<String> courses=new ArrayList<>();
		courses.add("Java");
		courses.add("SpringBoot");
		courses.add("SystemDesign");
		courses.add("AI Engineering");
		courses.add("DevOps");
		
		System.out.println(courses);
		
		//Collections.shuffle(courses);
		int info=Collections.frequency(courses, "Java");
		System.out.println(info);
		Collections.sort(courses);
		System.out.println(courses);
		
	}

}
