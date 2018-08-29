package com.hsbc.tutorials.collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSnip {

	private static void setMethod()
	{
		Set<String> coll=new HashSet<>();
		coll.add("abc");
		coll.add("123");
		coll.add("1w2");
		coll.add("abc");
		coll.add(null);
		System.out.println("HashSet to string: "+coll.toString());
		for (String string : coll) {
			System.out.println("HashSet for each :"+string);
		}
		Set<String> set=new TreeSet<>();
		//to maintain order ,will sort based on number first, if numbers are same, then it will go to string comparison
		set.add("123a");	
		set.add("123b");
		set.add("25fth");
		set.add("25ftg");
		System.out.println("TreeSet to string: "+set.toString());
		
		for (String string1 : set) {
			System.out.println("HashSet for each :"+string1);
		}
		if(true)
		{
			if(true)
			{
				if(true)
				{
					if(true)
					{
						if(true)
						{
							if(true)
							{
								if(true)
								{
									if(true)
									{
										
									}
								}
							}
						}
					}
				}
			}	
		}
		
		Set<String> lnkSet=new LinkedHashSet<>();
		//it maintains order due to linked list in hash table 
		lnkSet.add("123a");	
		lnkSet.add("b");
		lnkSet.add("25fth");
		lnkSet.add("25ftg");
		System.out.println("LinkedHashSet to string: "+lnkSet.toString());
		
		for (String string2 : lnkSet) {
			System.out.println("LinkedHashSet for each :"+string2);
		}
	}
	public static void main(String[] args) {
		setMethod();		

	}

}
