package com.core.java.nestedClasses;

public class StaticNestedClass {
	
	private String var="Member of outer class";
	private void check()
	{
		System.out.println("Method of outer class");
	}
	
	static class StaticInner{
		
		private String varIn="Member of static inner class";
		public void check1()
		{
			System.out.println("Method of static inner class");
			//to access outer class members as they are not directly accessable,either make them static and access in static way or:
			StaticNestedClass obj=new StaticNestedClass();
			System.out.println(obj.var);
			obj.check();
		}
	}
	public static void main(String[] args) {
		System.out.println(" Main Method of outer class");
		//to use Static Inner class, create its object in this way.
		StaticNestedClass.StaticInner obj=new StaticNestedClass.StaticInner();
		System.out.println(obj.varIn);
		obj.check1();
	}
}
