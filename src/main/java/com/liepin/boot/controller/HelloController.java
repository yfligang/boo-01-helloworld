package com.liepin.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody //ResponseBody写到类前
//@Controller

@RestController //包含ResponseBody和Controller
public class HelloController {

    @RequestMapping("/hello") //映射-请求参数
    public String handle01(){
        return "Hello, SpringBoot 2!"; //请求的返回值
    }
}
