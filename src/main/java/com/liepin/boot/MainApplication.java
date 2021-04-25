package com.liepin.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
   主程序类，所有应用程序的入口
   @SpringBootApplication: 这是一个SpringBoot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args){

        SpringApplication.run(MainApplication.class,args); //主程序类 需要运行的类名
    }
    ;
}
