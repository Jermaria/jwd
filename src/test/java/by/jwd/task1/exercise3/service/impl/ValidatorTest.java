package by.jwd.task1.exercise3.service.impl;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ValidatorTest {

  @Test
  public void isPositiveTest() {
    
      Validator validator = Validator.getInstance();
      
      boolean result = validator.isPositive(9);
      
      assertTrue(result);
  }
}
