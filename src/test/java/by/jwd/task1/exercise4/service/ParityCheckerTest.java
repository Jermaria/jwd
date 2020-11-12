package by.jwd.task1.exercise4.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import by.jwd.task1.exercise4.entity.Expression;

@Test
public class ParityCheckerTest {
    
  private static ParityChecker checker = new ParityChecker();

  
  public void isEvenTest() {
    
    boolean actual = checker.isEven(8);
    boolean expected = true;
    assertEquals(actual, expected);
  
  }

  public void isExpressionTrueTest() {
    int[] array = new int[] {2,3,4,5,2};
    Expression e = new Expression(array);
    
    boolean actual = checker.isExpressionTrue(e);
    boolean expected = true;
    assertEquals(actual, expected);
    
  }
}
