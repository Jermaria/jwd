package by.jwd.task1.exercise4.service;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import by.jwd.task1.exercise4.entity.Expression;

@Test
public class ParityCheckerTest {
    
  private static final ParityChecker CHECKER = ParityChecker.getInstance();

  public void isEvenTest() {
    
    boolean actual = CHECKER.isEven(8);
    assertTrue(actual);
  
  }

  public void isExpressionTrueTest() {
    int[] array = new int[] {2,3,4,5,2};
    Expression e = new Expression(array);
    
    boolean actual = CHECKER.isExpressionTrue(e);

    assertTrue(actual);
    
  }
}
