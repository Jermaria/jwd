package by.jwd.task1.exercise6.service.impl;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class MinuteServiceImplTest {
    
  private static final MinuteServiceImpl service = new MinuteServiceImpl();

  public void getMinutesLeftTest() {
    
    int actual = service.getMinutesLeft(80);
    int expected = 1;
    
    assertEquals(actual, expected, 0.001);
  }

  public void getMinutesTotalTest() {
    
    int actual = service.getMinutesTotal(80);
    int expected = 1;
    assertEquals(actual, expected);
    
  }

  public void getRemainderTest() {
    int actual = service.getRemainder(2);
    int expected = 1;
    assertEquals(actual, expected);
  }
}
