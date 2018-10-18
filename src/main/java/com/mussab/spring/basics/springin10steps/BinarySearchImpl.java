package com.mussab.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Bean
@Component
public class BinarySearchImpl {
	
	// Dependency
	@Autowired
	private SortAlgo sortAlgo;
	
	
	/*
	// below is the loosely coupled code - Constructor Injection
	public BinarySearchImpl(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}*/
	
	// setter injection
	public void setSortAlgo(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}


	public int binarySearch(int[] numbers, int numberToSearchFor){
		// Sorting an array
		// Bubble or Quick Sort Algorithm
		// Below is the tightly coupled code
		/*BubbleSortAlgo bubbleSortAlgo = new BubbleSortAlgo();
		int[] sortedNumbers = bubbleSortAlgo.sort(numbers);*/
		
		int[] sortedNumbers = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		
		// Search the array
		
		// Return the result
		return 3;
	}
	
}
