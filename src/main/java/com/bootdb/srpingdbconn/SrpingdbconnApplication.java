package com.bootdb.srpingdbconn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.bootdb.srpingdbconn.mapper")
@SpringBootApplication
public class SrpingdbconnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrpingdbconnApplication.class, args);
	}

}
