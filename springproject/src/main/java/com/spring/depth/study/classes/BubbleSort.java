package com.spring.depth.study.classes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.depth.study.interfaces.SortClass;
@Component
@Qualifier("bubble")
public class BubbleSort implements SortClass{

	public int[] sortedArr(int[] arr) {
		int[] sortArrB=new int[3];
		System.out.println("Array sorted : Bubble sort");
		return sortArrB;
	}

}
