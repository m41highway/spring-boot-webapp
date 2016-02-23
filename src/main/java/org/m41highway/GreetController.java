package org.m41highway;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.TimeUnit;

@RestController
public class GreetController {

   final static String queueName = "spring-boot";

   @Autowired
   RabbitTemplate rabbitTemplate;

   @Autowired
   MessageReceiver receiver;

   @RequestMapping("/")
   public String greet() {
      return "Greetings from Spring Boot!";
   }

   @RequestMapping("/book")
   public void book() {
      rabbitTemplate.convertAndSend(queueName, "I want to buy ticket");
   }

   /*
   @RequestMapping("/confirm")
   public void confirm() {
      try {

         receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);

      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }*/
}
