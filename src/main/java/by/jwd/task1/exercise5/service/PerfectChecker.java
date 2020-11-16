package by.jwd.task1.exercise5.service;

public class PerfectChecker {
    
    private static final PerfectChecker INSTANCE = new PerfectChecker();
    
    private static final String NOT_NATURAL_NUMBER_EXCEPTION_MESSAGE = "not natural number";
    
    private PerfectChecker() {}

    public static PerfectChecker getInstance() {
        return INSTANCE;
    }
    
    public boolean isNumberPerfect(int x) throws ServiceException {
        
        boolean result;
        
        Validator validator = Validator.getInstance();
        
        
        if(!validator.isPositive(x)) {
            
            throw new ServiceException(NOT_NATURAL_NUMBER_EXCEPTION_MESSAGE);
        }
  
        int sum = 0;
            
        for (int i = x-1; i > 0; i--) {
               
            if (isDivisibleWithoutRemainder(x, i)) {
                    
                sum += i;
            }
        }
  
        result = (x == sum) ? true : false;
          
        return result;
        
    }
    
    public boolean isDivisibleWithoutRemainder(int divident, int divisor) {
        
        boolean result = (divident % divisor == 0) ? true : false;
        
        return result;
    }
    

}
