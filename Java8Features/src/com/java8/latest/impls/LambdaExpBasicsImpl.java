package com.java8.latest.impls;

import com.java8.latest.interfaces.LambdaExpBasicsInt;

public class LambdaExpBasicsImpl{
	
	//Old implementation of Interface as anonymous class
	public void implInterfaceAnonym()
	{
		LambdaExpBasicsInt lamInt = new LambdaExpBasicsInt(){
			//Anonymous int impl can have member variables
			private int age;
			@Override
			public String concatNames(String fName, String sName)
			{
				System.out.println("Old implementation of interface as anonymous class");
				System.out.println(age);
				return fName+ sName;
			}
		};
		lamInt.concatNames("Himanshu", "Tyagi");
	}

	//Lambda expression of Interface 
	public void implInterfaceLambda()
	{
		System.out.println("Lambda expression implementation of interface");
		LambdaExpBasicsInt lam=(fName,sName)->{
			return fName+sName;
			};
			lam.concatNames("Himanshu", "Lambda Example");
	}
	public static void main(String[] args) {
		LambdaExpBasicsImpl obj=new LambdaExpBasicsImpl();
		obj.implInterfaceAnonym();
		obj.implInterfaceLambda();
		
	}

}
