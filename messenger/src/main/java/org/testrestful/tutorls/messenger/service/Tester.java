package org.testrestful.tutorls.messenger.service;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import org.testrestful.tutorls.messenger.model.Profile;

public class Tester {
	public static void main(String[] args) {
		Map<Profile, Integer> m=new HashMap<>();
		Profile p=new Profile(1, "name", 10);
		m.put(p, 1);
		System.out.println(new Profile(1, "name", 10).hashCode());
		System.out.println("fetching same entry....."+new Profile(1, "name", 10).hashCode());
		System.out.println(m.get(p));
		System.out.println("*****************************");
		String x="infosyslimited";
		String y="I";
		String s1=new String("hello");  
		String s2="hello";  
		s1=s1.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s1==s2);//false because reference is different  
		//System.out.println(s2==s3);
		
	}

}
