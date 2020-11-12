package by.jwd.task1.exercise9.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class CircleServiceTest {
    
    private static final CircleService service = CircleService.getInstance();

  @Test
  public void calculateCircleAreaTest() {

    try {
        
        double actual = service.calculateCircleArea(1);
        double expected = Math.PI;
        assertEquals(actual, expected, 0.001);
        
    } catch (UnacceptableRadiusServiceException e) {
        
        fail();
    }
      
    
  }

  @Test
  public void calculateCircumferenceTest() {

    try {
        
        double actual = service.calculateСircumference(1);
        double expected = 2*Math.PI;
        assertEquals(actual, expected, 0.001);
      
    } catch (UnacceptableRadiusServiceException e) {
        
        fail();
    }     
  }
  
  @Test(expectedExceptions = UnacceptableRadiusServiceException.class)
  public void UnacceptableRadiusServiceExceptionTest() throws UnacceptableRadiusServiceException {
      
      service.calculateCircleArea(-2);
  }
}
