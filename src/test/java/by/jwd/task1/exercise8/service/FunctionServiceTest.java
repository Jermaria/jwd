package by.jwd.task1.exercise8.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class FunctionServiceTest {

  @Test
  public void calculateTest() {
    FunctionService service = FunctionService.getInstance();
    
    double actual = service.calculate(0);
    double expected = (double)-1/6;
    assertEquals(actual, expected, 0.001);
  }
  
}
