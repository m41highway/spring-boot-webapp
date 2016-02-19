package org.m41highway;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GreetController {

   @RequestMapping("/")
   public String greet() {
      return "Hello from Spring Boot";
   }

}
