package by.jwd.task1.exercise1.service;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

@Test
public class ServiceTest {
    
  private static final Service SERVICE = Service.getInstance();

  public void getLastDigitTest() {
      
      int actual = SERVICE.defineLastDigit(43);
      int expected = 3;

      assertEquals(actual, expected);
  }

  public void getSquareTest() {
      
      int actual = SERVICE.calculateSquare(8);
      int expected = 64;

      assertEquals(actual, expected, 0.001);
  }
}
