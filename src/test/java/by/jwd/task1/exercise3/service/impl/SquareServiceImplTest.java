package by.jwd.task1.exercise3.service.impl;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import by.jwd.task1.exercise3.entity.Square;
import by.jwd.task1.exercise3.service.NoSuchShapeException;
import by.jwd.task1.exercise3.service.ServiceFactory;
import by.jwd.task1.exercise3.service.SquareService;

public class SquareServiceImplTest {
    
    private static final ServiceFactory FACTORY = ServiceFactory.getInstance();

  @Test
  public void calculateAreaTest() {
          
      try {
        
        SquareService service = FACTORY.getSquareService();
        
        Square square = new Square(2);
        double actual = service.calculateArea(square);
        double expected = 4;
        assertEquals(actual, expected, 0.001);
    
      } catch (NoSuchShapeException e) {
        
        fail();  
      
      }
  }
  
  @Test(expectedExceptions = NoSuchShapeException.class)
  public void noSuchShapeExceptionTest() throws NoSuchShapeException {
      
      new Square(-2);

  }

  @Test
  public void getSideByAreaTest() {
      
      SquareService service = FACTORY.getSquareService();
    
      try {
          
          double actual = service.calculateSideByArea(4);
          double expected = 2;
          assertEquals(actual, expected, 0.001);
          
      } catch (NoSuchShapeException e) {
        
          fail();
      }    
  }

  @Test
  public void getSideByCircumscribedRadiusTest() {
      
      SquareService service = FACTORY.getSquareService();
      
      double radius = 2 * Math.sqrt(2);
    
      try {
        double actual = service.calculateSideByCircumscribedRadius(radius);
        double expected = 4;
        assertEquals(actual, expected, 0.001);
        
    } catch (NoSuchShapeException e) {
        
        fail();
    }
  }

}
