package com.hsbc.tutorials.service;
import com.hsbc.tutorials.service.*;

public class Sevice {
	
	private String name;
	
	
	public static void main(String... pk)
	{
		Sevice s=new Sevice();
		System.out.println("hello hashCode  :" +s.hashCode());
		System.out.println("hello   :"+Integer.toHexString(s.hashCode()));
		System.out.println("hello toString  :" +s.toString());
		
	}

}
