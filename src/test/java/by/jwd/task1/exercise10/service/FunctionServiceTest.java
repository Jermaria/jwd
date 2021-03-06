package by.jwd.task1.exercise10.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.testng.annotations.Test;

import by.jwd.task1.exercise10.entity.Interval;

public class FunctionServiceTest {
    
    private static final FunctionService SERVICE = FunctionService.getInstance();

  @Test
  public void getResultsOprionalTest() {

    Interval interval = new Interval(0, 6);
    
    try {
        
        Optional<Map<Integer, Double>> optionalResult = SERVICE.calculateResultsOprional(interval, 0);
        Map<Integer, Double> actual = optionalResult.get();
        Map<Integer, Double> expected = new HashMap<Integer, Double>();
        expected.put(0, 0.0);
        assertEquals(actual, expected);
        
    } catch (UnacceptableValueServiceException e) {
        
        fail();
    }
    

    
  }
}
