package com.youyuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  //开启定时任务
public class SpringbootActivemqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootActivemqProducerApplication.class, args);
	}

}
