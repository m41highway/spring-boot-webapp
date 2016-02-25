package org.m41highway;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import sun.tools.jar.CommandLine;

@ComponentScan
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

   public static void main (String [] args) {
      
      ApplicationContext ctx = SpringApplication.run(Application.class, args);

      System.out.println("Spring Boot app starts running");

   }

   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application;
   }

}

