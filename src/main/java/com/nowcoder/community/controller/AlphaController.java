package com.nowcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alpha")//浏览器能够访问这个类里的某个方法就是通过这个名字来访问
public class AlphaController {

  //能够处理浏览器请求的方法
  @RequestMapping("/hello")
  @ResponseBody//浏览器以为会返回一个网页 但在这个实例里是返回一个字符串 所以要进行一个声明
  public String sayHello() {
    return "Hello Spring Boot.";
  }
}
