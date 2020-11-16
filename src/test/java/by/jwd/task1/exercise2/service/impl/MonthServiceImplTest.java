package by.jwd.task1.exercise2.service.impl;

import static org.testng.Assert.assertEquals;

import java.util.Optional;

import org.testng.annotations.Test;

import by.jwd.task1.exercise2.entity.Month;
import by.jwd.task1.exercise2.service.MonthService;
import by.jwd.task1.exercise2.service.ServiceFactory;

@Test
public class MonthServiceImplTest {
    
  private static final ServiceFactory FACTORY = ServiceFactory.getInstance();

  public void getMonthByNumberTest() {

      MonthService monthService = FACTORY.getMonthService();
      
      Optional<Month> m = monthService.defineMonthByNumber(1);
      
      Month actual = m.get();
      
      Month expected = Month.JANUARY;
      
      assertEquals(expected, actual);
      
  }

}
