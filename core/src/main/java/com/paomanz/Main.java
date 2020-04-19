package com.paomanz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
   // Custom Logger
   private static final Logger log = LoggerFactory.getLogger(Main.class);

   // Config CONSTANT
   private static final String CONFIG_LOCATION = "beans.xml";

   public static void main(String[] args) {
      log.info("Guess The Number Game is Running...");

      // Create Context (Container-Context)
      ConfigurableApplicationContext context
              = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

      // Get BEAN from Container-Context
      NumberGenerator numberGenerator
              = context.getBean("numberGenerator", NumberGeneratorImpl.class);

      int randomNumber = numberGenerator.next();
      int getMaxNum = numberGenerator.getMaxNumber();

      log.info("random number is {}", randomNumber);
      log.info("max number is {}", getMaxNum);

      // CLOSE the Context (Container)
      context.close();
   }
}
