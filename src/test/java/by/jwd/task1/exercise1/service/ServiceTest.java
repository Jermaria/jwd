package by.jwd.task1.exercise1.service;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ServiceTest {

  public void getLastDigitTest() {
      
      Service service = new Service();
      
      int actual = service.getLastDigit(43);
      int expected = 3;

      Assert.assertEquals(actual, expected);
  }

  public void getSquareTest() {
    
      Service service = new Service();
      
      int actual = service.getSquare(8);
      int expected = 64;

      Assert.assertEquals(actual, expected, 0.001);
  }
}
