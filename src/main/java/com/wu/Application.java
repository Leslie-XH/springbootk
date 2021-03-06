package com.wu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.wu.dao")
@EnableTransactionManagement//开启事务
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
