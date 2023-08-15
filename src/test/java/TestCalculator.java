package com.tutorials.mockito;

public class TestCalculator {
  @Test
  public void calculateSumAndStore_withValidInput_shouldCalculateAndUpdateResultInDb(){
     // Arrange
      studentScores = new StudentScoreUpdates(mockDatabase);
      int[] scores = {  60, 70, 90  };
      Mockito.doNothing().when(mockDatabase).updateScores("student1", 220); 
   
      // Act
      studentScores.calculateSumAndStore("student1", scores); 
   
      // Assert
      Mockito.verify(mockDatabase, Mockito.times(1)).updateScores("student1", 220);
  }
}
