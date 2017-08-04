package com.zs.bootmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * 
 * @description:spring boot 启动类
 */
@SpringBootApplication// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}