package com.spring.depth.study.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.spring.depth.study.interfaces.SortClass;

@Component
public class BinarySearch {
	
	@Autowired
	@Qualifier("bubble")
	private SortClass sortClass;

	public int binarySearch(int[] arr, int num)
	{
		System.out.println("Binary search method called");
		int[] sortedArr=sortClass.sortedArr(arr);
		//find the number logic
		System.out.println("Binary search complete");
		return 1;
	}

}
