package com.core.java.programs;

import java.util.ArrayList;
import java.util.List;

public class TestingLists {
	
	static void testMethod()
	{
	ArrayList<String> listStr=new ArrayList<String>();
	boolean a=listStr.add("him");
	listStr.add("anshu");
	listStr.add("Tyagi");
	listStr.add("him");
	System.out.println(listStr.size());
	//listStr.trimToSize();
	System.out.println(listStr.size());
	String[] stArr=new String[listStr.size()];
	List<String> nwStr=new ArrayList<>();
	System.out.println(nwStr.size());
	
	String[] s=listStr.toArray(stArr);
	for (String string : s) {
	}
	
	
	
	}

	public static void main(String[] args) {
		testMethod();

	}

}
