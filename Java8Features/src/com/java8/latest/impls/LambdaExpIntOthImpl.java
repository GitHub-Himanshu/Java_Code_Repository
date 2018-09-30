package com.java8.latest.impls;

import com.java8.latest.interfaces.LambdaExpBasicsInt;
import com.java8.latest.interfaces.LambdaExpIntOth;
import com.java8.latest.interfaces.LambdaExpModelInt;
import com.java8.latest.models.Student;

public class LambdaExpIntOthImpl {

	public static void main(String[] args) {
		
		//No parameters in interface method
		LambdaExpIntOth lamOth= () -> System.out.println("ConcatNames of LambdaExpIntOth interface called");
		lamOth.concatNames();
		
		//parameters type is optional e.g (Student stud) --also good
		LambdaExpModelInt modInt = (stud)->System.out.println("Student Model interface Method called:"+stud.getName()
		+" "+stud.getAge());
		
		modInt.getStud(new Student("himanshu", 26));
		
		//Return values for method in lambda
		LambdaExpBasicsInt obj= (fName,sName)->{
			System.out.println(fName+sName);
			return fName+sName;
			};
		obj.concatNames("Tyagi", "Himanshu");

	}

}
