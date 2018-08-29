package org.testrestful.tutorls.messenger.service;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("hello thread :"+i);
		}		
	}

	public static void main(String[] args) {
		RunnableThread rt=new RunnableThread();
		Thread t=new Thread(rt);
		t.start();
	}
}
