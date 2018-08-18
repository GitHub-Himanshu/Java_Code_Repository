package com.core.java.programs;

public class Him {

	
	static int temp(int a, int b, int c)
	{
		int ret = 0;
		if(a>0 && b>0 && c>0)
		{
			if(a+b>c || a+c>b || b+c>a)
			{	
				if(a==b && b==c && c==a)
				{
					return 1;
				}
				else
				{
					return 2;
				}
			}
			else
			{
				return 0;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int a=temp(100,90,200);
		System.out.println(a);
		System.out.println("Hello");
	}

}
