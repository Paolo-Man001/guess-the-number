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

      // Get numberGenerator-bean from Container-Context
      NumberGenerator numberGenerator
              = context.getBean("numberGenerator", NumberGeneratorImpl.class);

      int randomNumber = numberGenerator.next();      // generate-random-number
      log.info("random number is {}", randomNumber);  // log the random-number

      // GET game-bean from Context(Container) :
      Game game = context.getBean(Game.class);
      game.reset();

      // CLOSE the Context (Container)
      context.close();
   }
}
