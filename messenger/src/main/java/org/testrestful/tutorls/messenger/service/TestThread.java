package org.testrestful.tutorls.messenger.service;

public class TestThread extends Thread{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			 try
			 {
				 Thread.sleep(500);
				 }
			 catch(InterruptedException e)
			 {System.out.println(e);} 
			System.out.println("hello thread :"+i);
		}
	}
	public static void main(String[] args) {
		TestThread t=new TestThread();
		t.start();
		TestThread t1=new TestThread();
		t1.start();
	
		
	}

}
