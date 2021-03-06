package com.shawnyang.poc.spring.integration.esb;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:/configuration-integration.xml" })
public class BootApplication {

	static Log log = LogFactory.getLog(BootApplication.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootApplication.class, args);

		log.info("Beans provided by Spring Boot:");
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			log.info(beanName);
		}
	}
}
