package by.jwd.task1.exercise6.service.impl;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import by.jwd.task1.exercise6.service.HourService;
import by.jwd.task1.exercise6.service.ServiceFactory;
import by.jwd.task1.exercise6.service.UnacceptableValueServiceException;

public class HourServiceImplTest {
    
  private static final ServiceFactory FACTORY = ServiceFactory.getInstance();

  @Test
  public void getHoursNumberTest() {
      
      HourService service = FACTORY.getHourService();

      try {
          
        int actual = service.calculateHoursNumber(3700);
        int expected = 1;

        assertEquals(actual, expected);
        
    } catch (UnacceptableValueServiceException e) {
        
        fail();
    }    
  }
  
  @Test(expectedExceptions = UnacceptableValueServiceException.class)
  public void unacceptableValueServiceExceptionTest() throws UnacceptableValueServiceException {
      
      HourService service = FACTORY.getHourService();
      service.calculateHoursNumber(-6);
  }
}
