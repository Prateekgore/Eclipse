package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01FirstAppDependencyInjectionApplication {

	@Bean(name = "ldt")
	public LocalDateTime createLDT() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj01FirstAppDependencyInjectionApplication.class, args);
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);

		String result = generator.generateMessage("  pratik");
		System.out.println(" Wish Message is  ::  " + result);

		((ConfigurableApplicationContext) ctx).close();
	}

}
