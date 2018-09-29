package com.core.java.nestedClasses;

public class InnerClassOuter {
	
	private String var="Member of outer class";
	private void check()
	{
		System.out.println("Method of outer class");
	}
	
	class InnerClass{
		private String varIn="Member of inner(Non static nested) class";
		public void check1()
		{
			System.out.println("Method of Inner class");
			//Members of outer class are directly accessible
			System.out.println(var);
			check();
		}
	}
	public static void main(String[] args) {
		//to access inner class members, create an object like this
		//1st create object of outer class
		InnerClassOuter in = new InnerClassOuter();
		//create object of inner class, like this:
		InnerClassOuter.InnerClass obj=in.new InnerClass();
		System.out.println(obj.varIn);
		obj.check1();
		

	}

}
