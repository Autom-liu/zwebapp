package com.scnu.zwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.scnu.zwebapp.baseinfo.mapper")
public class BaseInfoApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(BaseInfoApplication.class, args);
	}
}
