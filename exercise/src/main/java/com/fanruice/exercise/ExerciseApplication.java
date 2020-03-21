package com.fanruice.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ExerciseApplication.class, args);
			System.out.println("启动成功！");
		} catch (Exception e) {
			System.out.println("启动异常：" + e);
		}
	}
}
