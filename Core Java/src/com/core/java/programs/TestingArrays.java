package com.core.java.programs;

public class TestingArrays {
	
	static boolean trueRes()
	{
		System.out.println("True");
		return true;
	}
	
	static boolean falseRes()
	{
		System.out.println("false");
		return false;
	}
	
	static void testMethod()
	{
		int[] arr={-2,3,4,5,-1,0,4};
		System.out.println("arr :"+arr.length);
		
		int arLen=arr.length;
        int countPos=0;
        int countNeg=0;
        int countZer=0;
    for(int m=0;m<=arLen-1;m++)
    {
        if(arr[m]>0)
        {
           countPos++; 
        }
        if(arr[m]<0)
        {
           countNeg++; 
        }
        if(arr[m]==0)
        {
            countZer++;
        }
    }
        System.out.println("count"+countPos+countNeg+countZer);
        double d=(double)countPos;
        double e=(double)arLen;
        double a=d/e;
        System.out.println("double"+a);
		
		
    }
	static int recurMethod(int n)
	{
		
		if(n>0){
		return n+recurMethod(n+1);
	}
		
		return n;
	}
	static void twoDArray()
	{
		int[][] arr={{6,2,4,4},{4,5,6,5},{7,8,9,6},{1,2,3,4}};
		
		int r=0;
		int c=0;
		int[] rd=new int[3];
		int[] ld=new int[3];
		int j=0;
		int sumRD=0;
		int sumLD=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			//System.out.println(arr[i][c]);
			sumRD=sumRD+arr[i][c];
			c++;
		}	
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.println(arr[r][i]);
			sumLD=sumLD+arr[r][i];
			r++;
		}
		System.out.println("sum RD= "+sumRD);
		System.out.println("sum LD= "+sumLD);
		int diff=sumRD-sumLD;
		System.out.println("Abs value = "+Math.abs(diff));
	}
	
	public static void main(String[] args) {
		testMethod();
		//System.out.println("Rec A: "+recurMethod(0));
		//twoDArray();

	}

}
