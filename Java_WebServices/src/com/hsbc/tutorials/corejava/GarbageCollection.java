package com.hsbc.tutorials.corejava;

public class GarbageCollection {
	protected void finalize()
	{
		System.out.println("garbage collected");
	}

	public static void main(String[] args) {
		GarbageCollection g1=new GarbageCollection();
		GarbageCollection g2=new GarbageCollection();
		//g1=null;	//nullify the reference to make it available to gc
		//g1=g2;		// assigning one reference to other to make it availble for gc
		
		//Island of isolation starts
		g1=g2;	//these 2 ref var refering to each other
		g2=g1;	//and objects refered by these var have no valid reference
		g1=null;	
		g2=null;
		////Island of isolation ends
		System.gc();	//internally calls finalize method
	}

}
