package com.vamsi.spring.basics.springin5stepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
	// @Qualifier("Quick")
	private SortAlgorithm sortAlgorithm;

	/*
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) { super();
	 * this.sortAlgorithm = sortAlgorithm; }
	 */

	/*
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * this.sortAlgorithm = sortAlgorithm; }
	 */
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortNumbers = sortAlgorithm.sort(numbers);

		System.out.println(sortAlgorithm);

		// Searchh Array

		return 3;
	}
}
