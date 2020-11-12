package by.jwd.task1.exercise5.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class PerfectCheckerTest {
    
  private static final PerfectChecker checker = PerfectChecker.getInstance();

  @Test
  public void isDivisibleWithoutRemainderTest() {
    
      boolean actual = checker.isDivisibleWithoutRemainder(10, 5);
      boolean expected = true;

      assertEquals(actual, expected);
  }

  @Test
  public void isNumberPerfectTest() {
      
      int x = 6;
      
      boolean actual;
      try {
          actual = checker.isNumberPerfect(x);
          boolean expected = true;

          assertEquals(actual, expected);
        
      } catch (ServiceException e) {
          fail();
      }
  }
  
  @Test(expectedExceptions = ServiceException.class)
  public void ServiceExceptionTest() throws ServiceException {
      
      checker.isNumberPerfect(-3);
  }
}
