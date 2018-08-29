package com.spring.depth.study.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.depth.study.classes.BinarySearch;

@ComponentScan({"com.spring.depth.study.classes"})
@SpringBootApplication
public class SpringprojectApplication {

	public static void main(String[] args) {
		ApplicationContext app=SpringApplication.run(SpringprojectApplication.class, args);
		BinarySearch bs=app.getBean(BinarySearch.class);
		bs.binarySearch(new int[] {1,2,3},5);
	}
}
