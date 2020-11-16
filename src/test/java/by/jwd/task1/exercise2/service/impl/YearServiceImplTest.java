package by.jwd.task1.exercise2.service.impl;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import by.jwd.task1.exercise2.service.ServiceFactory;
import by.jwd.task1.exercise2.service.YearService;

public class YearServiceImplTest {
    
  private static final ServiceFactory FACTORY = ServiceFactory.getInstance();

  @Test
  public void isLeapTest() {
      
      YearService yearService = FACTORY.getYearService();
      
      boolean actual = yearService.isLeap(2020);

      assertTrue(actual);

  }
}
