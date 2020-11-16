package by.jwd.task1.exercise4.service;

import by.jwd.task1.exercise4.entity.Expression;

public class ParityChecker {
    
    private static final ParityChecker INSTANCE = new ParityChecker();
    
    private ParityChecker() {}
    
    public static ParityChecker getInstance() {
        return INSTANCE;
    }

    public boolean isEven(int x) {
        
        boolean result = (x % 2 == 0) ? true : false;
        
        return result;
    }
    
    public boolean isExpressionTrue(Expression e) {
        
        boolean result = false;
        
        int counter = 0;
        
        for (int x : e.getArray()) {
            
            if (isEven(x)) {
                
                counter++;
            }
            
            if (counter == 2) {
                
                result = true;
            }       
        }
        
        return result;
    }

}
