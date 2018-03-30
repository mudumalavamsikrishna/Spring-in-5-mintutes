package com.vamsi.spring.basics.springin5stepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5SteptsApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearchImpl = new BinarySearchImpl();
		int result = binarySearchImpl.binarySearch(new int[] { 2, 3, 5, 6 }, 3);
		System.out.println(result);

		SpringApplication.run(SpringIn5SteptsApplication.class, args);
	}
}
