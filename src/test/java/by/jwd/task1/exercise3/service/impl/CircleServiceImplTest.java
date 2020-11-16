package by.jwd.task1.exercise3.service.impl;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.testng.annotations.Test;

import by.jwd.task1.exercise3.entity.Square;
import by.jwd.task1.exercise3.service.CircleService;
import by.jwd.task1.exercise3.service.NoSuchShapeException;
import by.jwd.task1.exercise3.service.ServiceFactory;

public class CircleServiceImplTest {
    
  private static final ServiceFactory FACTORY = ServiceFactory.getInstance();

  @Test
  public void calculateInscribedRadiusTest() {
    
      CircleService service = FACTORY.getCircleService();
      Square square;
      try {
          
        square = new Square(4);
        double actual = service.calculateInscribedRadius(square);
        double expected = 2;
        
        assertEquals(actual, expected, 0.001);
        
      } catch (NoSuchShapeException e) {
        
          fail();
      }

  }
}
