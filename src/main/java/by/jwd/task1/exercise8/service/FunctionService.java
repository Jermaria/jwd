package by.jwd.task1.exercise8.service;

public class FunctionService {
    
    private static final FunctionService INSTANCE = new FunctionService();
    
    private FunctionService() {}

    public static FunctionService getInstance() {
        return INSTANCE;
    }

    public double calculate(double x) {
        
        double result = (isNotExceedingThree(x))? calculateResultNotExceeding(x)
                                                   :calculateResultExceeding(x);
        
        return result;
    }
    
    public boolean isNotExceedingThree(double valueToCompare) {
        
        boolean isNotExceeding = (valueToCompare < 3)?true:false;
        return isNotExceeding;
        
    }
    
    public double calculateResultExceeding(double x) {
        
        double y;
        
        y = -x * x + 3 * x + 9;
        
        return y;
    }
    
    public double calculateResultNotExceeding (double x) {
        
        double y;
        
        y = 1 / (Math.pow(x, 3) - 6);
        
        return y;
        
    }

}
