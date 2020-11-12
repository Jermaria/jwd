package by.jwd.task1.exercise4.service;

import by.jwd.task1.exercise4.entity.Expression;

public class ParityChecker {
    
    public boolean isEven(int x) {
        
        boolean result = (x % 2 == 0) ? true : false;
        
        return result;
    }
    
    public boolean isExpressionTrue(Expression e) {
        
        int counter = 0;
        
        for (int x : e.getArray()) {
            
            if (isEven(x)) {
                
                counter++;
            }
            
            if (counter == 2) {
                
                return true;
            }       
        }
        
        return false;
    }

}
