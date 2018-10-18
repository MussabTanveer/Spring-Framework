package com.mussab.spring.basics.springin10steps;

public class BinarySearchImpl {
	
	private SortAlgo sortAlgo;
	
	// below is the loosely coupled code
	public BinarySearchImpl(SortAlgo sortAlgo) {
		super();
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
