package by.jwd.task1.exercise2.service.impl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class YearServiceImplTest {

  @Test
  public void isLeapTest() {
      
      YearServiceImpl service = new YearServiceImpl();
      
      boolean actual = service.isLeap(2020);
      boolean expected = true;
      
      Assert.assertEquals(actual, expected);

  }
}
