package com.mussab.spring.basics.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {
		
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgo());
		// int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearchImpl bean = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = bean.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		
		
	}
}
