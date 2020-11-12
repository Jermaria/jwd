package by.jwd.task1.exercise3.service.impl;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import by.jwd.task1.exercise3.entity.Square;
import by.jwd.task1.exercise3.service.NoSuchShapeException;

public class SquareServiceImplTest {
    
    private final static SquareServiceImpl service = new SquareServiceImpl();

  @Test
  public void calculateAreaTest() {
          
      try {
        
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
    
      try {
          
          double actual = service.getSideByArea(4);
          double expected = 2;
          assertEquals(actual, expected, 0.001);
          
      } catch (NoSuchShapeException e) {
        
          fail();
      }    
  }

  @Test
  public void getSideByCircumscribedRadiusTest() {
      
      double radius = 2 * Math.sqrt(2);
    
      try {
        double actual = service.getSideByCircumscribedRadius(radius);
        double expected = 4;
        assertEquals(actual, expected, 0.001);
        
    } catch (NoSuchShapeException e) {
        
        fail();
    }
  }

  @Test
  public void isPositiveTest() {
      
    boolean actual = service.isPositive(90);
    boolean expected = true;
    assertEquals(actual, expected);
    
  }
}
