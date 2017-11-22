package com.dong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;


@SpringBootApplication
@MapperScan("com.dong.mapper")
public class LdBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(LdBlogApplication.class, args);
	}
}
