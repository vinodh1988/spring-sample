package com.firstservice.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {
	String n[]= {"James","Sharan","Hari"};
  @GetMapping("/greet")
  public String greet() {
	  return "Hi!!! Spring boot is running";
  }
  
  @GetMapping("/people")
  public String[] people() {
	  return n;
  }
  
}
