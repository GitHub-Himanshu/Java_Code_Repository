package com.core.java.nestedClasses;

public class AnonymOuterClassB {
	
	public void check()
	{
		//Anonymous class declaration and instantiation at same time. Class has no name
		//Type 2- Anonymous class that implements an interface
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread is running");
				
			}
		};
		Thread th=new Thread(r);
		th.start();
		
	}

	public static void main(String[] args) {
		AnonymOuterClassB obj=new AnonymOuterClassB();
		obj.check();

	}

}
