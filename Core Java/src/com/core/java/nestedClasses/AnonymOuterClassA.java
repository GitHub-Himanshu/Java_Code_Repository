package com.core.java.nestedClasses;

public class AnonymOuterClassA {
	
	public void check()
	{
		//Anonymous class declaration and instantiation at same time. Class has no name
		//Type 1- Anonymous class that extends a class
		Thread th=new Thread()
		{
			public void run()
			{
				System.out.println("Thread is running");
			}
		};
		th.start();
	}

	public static void main(String[] args) {
		AnonymOuterClassA obj=new AnonymOuterClassA();
		obj.check();

	}

}
