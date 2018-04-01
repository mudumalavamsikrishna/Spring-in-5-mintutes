package com.vamsi.spring.basics.springin5stepts.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vamsi.spring.basics.springin5stepts.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5SteptsBasicApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5SteptsBasicApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5SteptsBasicApplication.class)) {

			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

			int result = binarySearchImpl.binarySearch(new int[] { 2, 3, 5, 6 }, 3);
			LOGGER.info("{}", binarySearchImpl);
			System.out.println(result);

			// applicationContext.close();
		}
	}
}
