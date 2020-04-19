package com.paomanz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameImpl implements Game {
   //== CONSTANTS :
   private static final Logger log = LoggerFactory.getLogger(GameImpl.class);

   //== fields :
   private NumberGenerator numberGenerator;
   private int guessCount = 10;
   private int number;
   private int guess;
   private int smallest;
   private int largest;
   private int remainingGuesses;
   private boolean validNumberRange = true;

   @Override
   public int getNumber() {
      return 0;
   }

   @Override
   public int getGuess() {
      return 0;
   }

   @Override
   public void setGuess(int guess) {

   }

   @Override
   public int getSmallest() {
      return 0;
   }

   @Override
   public int getBiggest() {
      return 0;
   }

   @Override
   public int getRemainingGuesses() {
      return 0;
   }

   @Override
   public void reset() {

   }

   @Override
   public void check() {

   }

   @Override
   public boolean isValidNumber() {
      return false;
   }

   @Override
   public boolean isGameWon() {
      return false;
   }

   @Override
   public boolean isGameLost() {
      return false;
   }
}
