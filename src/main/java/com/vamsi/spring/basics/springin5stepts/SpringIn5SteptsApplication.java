package com.vamsi.spring.basics.springin5stepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5SteptsApplication {

	public static void main(String[] args) {

		// what are beans
		// what are the dependicy of bean?
		// where to search beans

		// BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new
		// QuickSortAlgorithm());
		// com.vamsi.spring.basics.springin5stepts.BubbleSortAlgorithm@7852e922

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5SteptsApplication.class, args);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl1);
		int result = binarySearchImpl.binarySearch(new int[] { 2, 3, 5, 6 }, 3);
		System.out.println(result);

	}
}
