package com.core.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectMaps {
	public static void testMaps()
	{
		Map<String, String> map=new TreeMap<>();
		map.put("a", "himanshu");
		map.put("e", "him");
		map.put("c", "deepak");
		map.put("d", null);
		for(Map.Entry<String, String> mapEntry:map.entrySet())
		{
			System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
		}
		Set<String> set=map.keySet();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
		}

	}

	public static void main(String[] args) {
		testMaps();

	}

}
