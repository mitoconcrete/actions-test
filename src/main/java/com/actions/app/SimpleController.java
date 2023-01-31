package com.actions.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
  @GetMapping("/")
  public String init(){
    return "hello world!";
  }
}
