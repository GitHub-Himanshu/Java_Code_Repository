package com.core.java.nestedClasses;

public class LocalOuterClass {
	
	private String var="Member of outer class";
	private void check(final String name)
	{
		System.out.println("Method of outer class");
		//only final are accessible in local class before java 8, so had to make "name" as final
		class LocalInnerclass{
			public void check1()
			{
				System.out.println("member of outer class :"+var);
				System.out.println("Argument of outer Method :"+name);
			}
		}
		LocalInnerclass obj=new LocalInnerclass();
		obj.check1();
	}

	public static void main(String[] args) {
		LocalOuterClass obj=new LocalOuterClass();
		obj.check("Name as parameter");
	}

}
