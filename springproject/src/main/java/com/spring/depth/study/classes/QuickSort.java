package com.spring.depth.study.classes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.spring.depth.study.interfaces.SortClass;

@Component
@Qualifier("quick")
public class QuickSort implements SortClass {

	@Override
	public int[] sortedArr(int[] arr) {
		int[] sortArrQ=new int[3];
		System.out.println("Array sorted : Quick sort");
		return sortArrQ;
	}
	
}
