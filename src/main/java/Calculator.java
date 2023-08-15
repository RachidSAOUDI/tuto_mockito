package com.tutorials.mockito;

public class Calculator {
  public void calculateSumAndStore(String studentId, int[] scores){
      int total = 0;
      for (int score: scores) {
          total = total + score;
      } // write total to DB
      databaseImpl.updateScores(studentId, total);
    } 
}
