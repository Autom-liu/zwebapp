package com.scnu.zwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.scnu.zwebapp.flow.mapper")
public class FlowApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FlowApplication.class, args);
	}
}
