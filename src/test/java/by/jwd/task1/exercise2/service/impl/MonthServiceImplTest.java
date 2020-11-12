package by.jwd.task1.exercise2.service.impl;

import java.util.Optional;

import org.testng.Assert;
import org.testng.annotations.Test;

import by.jwd.task1.exercise2.entity.Month;

@Test
public class MonthServiceImplTest {

  public void getMonthByNumberTest() {
    
      MonthServiceImpl monthService = new MonthServiceImpl();
      
      Optional<Month> m = monthService.getMonthByNumber(1);
      
      Month actual = m.get();
      
      Month expected = Month.JANUARY;
      
      Assert.assertEquals(expected, actual);
      
  }

}
