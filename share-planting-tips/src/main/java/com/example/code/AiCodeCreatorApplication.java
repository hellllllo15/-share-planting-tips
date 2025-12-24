package com.example.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class AiCodeCreatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiCodeCreatorApplication.class, args);
	}

}
