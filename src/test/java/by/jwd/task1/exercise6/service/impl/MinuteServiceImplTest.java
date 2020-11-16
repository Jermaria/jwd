package by.jwd.task1.exercise6.service.impl;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import by.jwd.task1.exercise6.service.MinuteService;
import by.jwd.task1.exercise6.service.ServiceFactory;

@Test
public class MinuteServiceImplTest {

  private static final ServiceFactory FACTORY = ServiceFactory.getInstance();

  public void getMinutesLeftTest() {
      
    MinuteService service = FACTORY.getMinuteService();
    
    int actual = service.calculateMinutesLeft(80);
    int expected = 1;
    
    assertEquals(actual, expected, 0.001);
  }

  public void getMinutesTotalTest() {
    
    MinuteService service = FACTORY.getMinuteService();
    int actual = service.calculateMinutesTotal(80);
    int expected = 1;
    assertEquals(actual, expected);
    
  }

  public void getRemainderTest() {
    
    MinuteService service = FACTORY.getMinuteService();
    int actual = service.calculateRemainder(2);
    int expected = 1;
    assertEquals(actual, expected);
  }
}
