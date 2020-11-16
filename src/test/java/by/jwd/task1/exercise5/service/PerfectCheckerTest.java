package by.jwd.task1.exercise5.service;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class PerfectCheckerTest {
    
  private static final PerfectChecker CHECKER = PerfectChecker.getInstance();

  @Test
  public void isDivisibleWithoutRemainderTest() {
    
      boolean actual = CHECKER.isDivisibleWithoutRemainder(10, 5);

      assertTrue(actual);
  }

  @Test
  public void isNumberPerfectTest() {
      
      int x = 6;

      try {
          
          boolean actual = CHECKER.isNumberPerfect(x);

          assertTrue(actual);
        
      } catch (ServiceException e) {
          fail();
      }
  }
  
  @Test(expectedExceptions = ServiceException.class)
  public void ServiceExceptionTest() throws ServiceException {
      
      CHECKER.isNumberPerfect(-3);
  }
}
