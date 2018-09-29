package com.core.java.nestedClasses;

public class AnonymOuterClassC {
	
	public void check()
	{
		//Anonymous class declaration and instantiation at same time. Class has no name
		//Type 3- Anonymous class that defines in method or constructor arguments
		//Here anonymous class has been passed as argument to the constructor of Thread class
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread is running");
				
			}
		});
		th.start();
		
		
	}

	public static void main(String[] args) {
		AnonymOuterClassC obj=new AnonymOuterClassC();
		obj.check();

	}

}
