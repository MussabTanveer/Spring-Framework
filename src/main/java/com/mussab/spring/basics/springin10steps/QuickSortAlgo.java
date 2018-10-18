package com.mussab.spring.basics.springin10steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Bean
@Component
// Make this component primary
@Primary
public class QuickSortAlgo implements SortAlgo {
	public int[] sort(int[] numbers){
		// Logic for quick sort
		return numbers;
	}
}
