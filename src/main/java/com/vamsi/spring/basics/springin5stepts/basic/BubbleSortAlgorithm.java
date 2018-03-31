package com.vamsi.spring.basics.springin5stepts.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		// Logic for Bubblesort
		return numbers;

	}

}
