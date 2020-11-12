package by.jwd.task1.exercise6.service.impl;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import by.jwd.task1.exercise6.service.UnacceptableValueServiceException;

public class HourServiceImplTest {
    
    private static final HourServiceImpl service = new HourServiceImpl();

  @Test
  public void getHoursNumberTest() {

      try {
          
        int actual = service.getHoursNumber(3700);
        int expected = 1;

        assertEquals(actual, expected);
        
    } catch (UnacceptableValueServiceException e) {
        
        fail();
    }    
  }
  
  @Test(expectedExceptions = UnacceptableValueServiceException.class)
  public void unacceptableValueServiceExceptionTest() throws UnacceptableValueServiceException {
      
      service.getHoursNumber(-6);
  }
}
