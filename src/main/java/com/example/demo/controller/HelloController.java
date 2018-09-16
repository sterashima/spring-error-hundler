package com.example.demo.controller;

import com.example.demo.error.NotFoundException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  
  @RequestMapping("say")
  public String say() {
    return "Hello world!";
  }
  
  @RequestMapping("error/{flag}")
  public String error(@PathVariable("flag") Long flag) throws NotFoundException {
    if(flag < 100L) {
      throw new NotFoundException();
    }
    
    return "Hello world!";
  }
  
  
}
