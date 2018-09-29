package com.core.java.programs;

import com.core.java.Interfaces.TestInterface;

public class TestInterfaceClass implements com.core.java.Interfaces.TestInterface{

	@Override
	public String getName(String fName, String sName) {
		return null;
		
	}
	
	public static void main(String[] args) {
		
		//Normal Implementation of Interface
		TestInterface t=new TestInterfaceClass() {
			@Override
			public String getName(String fName, String sName) {
				return fName+sName;
				
			}
		};
		System.out.println(t.getName("himanshu", "Tyagi"));
		
		
		//Lambda Expression implementing Interface
		TestInterface t2= (fName,sName) -> {return fName+sName;};
		System.out.println(t2.getName("him", "Infosys"));

	}

}
