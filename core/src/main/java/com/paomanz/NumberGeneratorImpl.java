package com.paomanz;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator{
   private final int maxNumber = 50;
   private Random getRandom = new Random();

   @Override
   public int next() {
      return getRandom.nextInt(maxNumber);
   }

   @Override
   public int getMaxNumber() {
      return maxNumber;
   }
}
