package com.hsbc.tutorials.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectSnip {

	private static void collectMethod()
	{
		Collection<String> coll=new ArrayList<>();
		coll.add("abc");
		coll.add("123");
		coll.add("1w2");
		System.out.println("Collection to string: "+coll.toString());
		for (int i = 0; i < coll.size(); i++) {
			System.out.println("collection for normal :"+i);
		}
		
		for (String string : coll) {
			System.out.println("collection for each :"+string);
		}
		Iterator<String> it=coll.iterator();
		while(it.hasNext())
		{
			String str=it.next();
			it.remove();
			System.out.println("Collection iterator: "+str);
			System.out.println("Collection iterator removed: "+coll);
		}
	}
	public static void main(String[] args) {
		collectMethod();		

	}

}
