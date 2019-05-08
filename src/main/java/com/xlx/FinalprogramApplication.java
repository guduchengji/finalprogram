package com.xlx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.xlx.dao")
public class FinalprogramApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalprogramApplication.class, args);
    }

}
