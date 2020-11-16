package by.jwd.task1.exercise10.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import by.jwd.task1.exercise10.entity.Interval;

public class FunctionService {
    
    private static final FunctionService INSTANCE = new FunctionService();
    private final Validator validator = Validator.getInstance();
    
    private FunctionService(){}

    public static FunctionService getInstance() {
        return INSTANCE;
    }
    
    public Optional<Map<Integer, Double>> calculateResultsOprional(Interval interval, int step) 
                                                  throws UnacceptableValueServiceException {
        
        Map<Integer, Double> results = new HashMap<Integer, Double>();
        
        if (validator.validateStep(step)) {
            
            int x1 = Math.min(interval.getX1(), interval.getX2());
            int x2 = Math.max(interval.getX1(), interval.getX2());
            
            for (int i = x1; i <= x2; i += step) {
                
                int x = i;
                double y = Math.tan(x);
                
                results.put(x, y);
                
            }   
        }
        
        Optional<Map<Integer, Double>> optionalResult = 
                                 (results.size() != 0) ? Optional.of(results) : Optional.empty();
        
        return optionalResult;
        
    }

}
